package pl.coderslab.web.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import pl.coderslab.web.model.entity.Country;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LeagueDto {

    @JsonProperty("league_id")
    private long id;

    @JsonProperty("league_name")
    private String name;

    @JsonProperty("league_country_id")
    private String country_id;

    public LeagueDto() {
    }

    public LeagueDto(long id, String name, String country_id) {
        this.id = id;
        this.name = name;
        this.country_id = country_id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry_id() {
        return country_id;
    }

    public void setCountry_id(String country_id) {
        this.country_id = country_id;
    }

    @Override
    public String toString() {
        return "LeagueDto - id: "+id+",name: "+name;
    }
}
