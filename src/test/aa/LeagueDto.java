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

    @JsonProperty("league_country")
    private Country country;

    public LeagueDto() {
    }

    public LeagueDto(long id, String name, Country country) {
        this.id = id;
        this.name = name;
        this.country = country;
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

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "LeagueDto - id: "+id+",name: "+name+", country: "+country;
    }
}
