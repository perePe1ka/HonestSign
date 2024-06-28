package org.example.api;

import com.google.gson.Gson;
import org.example.models.Document;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.concurrent.*;

public class CrptApi {

    private final String apiUrl = "";
    private final HttpClient httpClient;
    private final Gson gson;
    private final TimeUnit timeUnit;
    private final Integer requestLimit;
    private final Semaphore semaphore;
    private final ScheduledExecutorService scheduledExecutorService;

    public CrptApi(TimeUnit timeUnit, Integer requestLimit) {
        this.timeUnit = timeUnit;
        this.requestLimit = requestLimit;
        this.gson = new Gson();
        this.httpClient = HttpClient.newHttpClient();
        this.semaphore = new Semaphore(requestLimit, true);
        this.scheduledExecutorService = Executors.newScheduledThreadPool(1);

        long delay = timeUnit.toMillis(1);
        scheduledExecutorService.scheduleAtFixedRate(semaphore::release, delay, delay, TimeUnit.SECONDS);
    }

    public void createDockument(Document document, String signature) throws Exception {
        semaphore.acquire();

        String requestBody = gson.toJson(document);
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(apiUrl))
                .header("Content-Type", "application/json")
                .header("Signature", signature)
                .POST(HttpRequest.BodyPublishers.ofString(requestBody))
                .build();

        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

        if (response.statusCode() != 200) {
            throw new Exception("Failed to create" + response.body());
        }
    }
}
