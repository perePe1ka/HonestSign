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
public class Document {
    @SerializedName("description")
    private Description description;

    @SerializedName("doc_id")
    private String doc_id;

    @SerializedName("doc_status")
    private String doc_status;

    @SerializedName("doc_type")
    private String doc_type;

    @SerializedName("importRequest")
    private Boolean importRequest;

    @SerializedName("owner_inn")
    private String owner_inn;

    @SerializedName("participant_inn")
    private String participant_inn;

    @SerializedName("producer_inn")
    private String producer_inn;

    @SerializedName("production_date")
    private String production_date;

    @SerializedName("production_type")
    private String production_type;

    @SerializedName("products")
    private Product[] products;

    @SerializedName("reg_date")
    private String reg_date;

    @SerializedName("reg_number")
    private String reg_number;
}
