package pl.coderslab.web.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import pl.coderslab.web.model.entity.League;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)     //elementy, które istnieją w JSON , ale nie istnieją w klasie, mają być ignorowane
public class CountryDto {

    @JsonProperty("country_id")     //Określamy nazwę parametru w JSON
    private long apiCountryId;

    @JsonProperty("country_name")
    private String name;

    public CountryDto() {
    }

    public CountryDto(long apiCountryId, String name, List<League> leagues) {
        this.apiCountryId = apiCountryId;
        this.name = name;
    }

    public long getApiCountryId() {
        return apiCountryId;
    }

    public void setApiCountryId(long apiCountryId) {
        this.apiCountryId = apiCountryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "CountryDto - id: "+apiCountryId+",name: "+name;
    }

}