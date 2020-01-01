package ca.weizhi.fencyAPI.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotBlank;
import java.util.UUID;

public class Store {

    @NotBlank
    final private String name;
    private UUID id;
    private Double altitude;
    private Double longitude;

    public Store(@JsonProperty("name") String name,
                 @JsonProperty("alt") Double altitude,
                 @JsonProperty("lon") Double longitude,
                 @JsonProperty("id") UUID id){

        this.name=name;
        this.altitude=altitude;
        this.longitude=longitude;
        this.id=id;
    }

    public Double getAltitude() {
        return altitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public String getName() {
        return name;
    }

    public UUID getUUID() {
        return id;
    }


}
