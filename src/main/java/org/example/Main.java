package org.example;

import org.example.api.CrptApi;
import org.example.models.Description;
import org.example.models.Document;
import org.example.models.Product;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        Integer a = 127;
        Integer b = 127;
        Integer c = 128;
        Integer d = 128;

        System.out.println(a == b);
        System.out.println(c == d);
    }
}


//    CrptApi crptApi = new CrptApi(TimeUnit.SECONDS, 20);
//
//    Document document = new Document();
//        document.setDoc_id("doc123");
//                document.setDoc_status("NEW");
//                document.setDoc_type("LP_INTRODUCE_GOODS");
//                document.setImportRequest(true);
//                document.setOwner_inn("1234567890");
//                document.setParticipant_inn("0987654321");
//                document.setProducer_inn("1122334455");
//                document.setProduction_date("2020-01-23");
//                document.setProduction_type("PRODUCT_TYPE");
//                document.setReg_date("2020-01-23");
//                document.setReg_number("reg123");
//
//                Description description = new Description();
//                description.setParticipantInn("0987654321");
//                document.setDescription(description);
//
//                Product product = new Product();
//                product.setCertificateDocument("certDoc");
//                product.setCertificateDocumentDate("2020-01-23");
//                product.setCertificateDocumentNumber("cert123");
//                product.setOwnerInn("1234567890");
//                product.setProducerInn("1122334455");
//                product.setProductionDate("2020-01-23");
//                product.setTnvedCode("tnved123");
//                product.setUitCode("uit123");
//                product.setUituCode("uitu123");
//
//                document.setProducts(new Product[]{product});
//
//                String signature = "signature";
//
//                try {
//                crptApi.createDockument(document, signature);
//                } catch (Exception e) {
//                e.printStackTrace();
//                }