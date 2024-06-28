package org.example.models;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @SerializedName("certificate_document")
    private String certificateDocument;
    @SerializedName("certificate_document_date")
    private String certificateDocumentDate;
    @SerializedName("certificate_document_number")
    private String certificateDocumentNumber;
    @SerializedName("owner_inn")
    private String ownerInn;
    @SerializedName("producer_inn")
    private String producerInn;
    @SerializedName("production_date")
    private String productionDate;
    @SerializedName("tnved_code")
    private String tnvedCode;
    @SerializedName("uit_code")
    private String uitCode;
    @SerializedName("uitu_code")
    private String uituCode;
}
