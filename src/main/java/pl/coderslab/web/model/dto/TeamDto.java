package pl.coderslab.web.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import pl.coderslab.web.model.entity.Country;
import pl.coderslab.web.model.entity.GameResult;
import pl.coderslab.web.model.entity.League;

import java.util.Map;
import java.util.Set;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TeamDto {

    @JsonProperty("team_id")
    private long id;

    @JsonProperty("team_name")
    private String name;

    @JsonProperty("team_country")
    private Country country;

    @JsonProperty("team_leagues")
    private Set<League> leagues;

    @JsonProperty("team_gameResults")
    private Set<GameResult> gameResults;

    @JsonProperty("team_scores")
    private Map<League,Integer> scores;

    public TeamDto() {
    }

    public TeamDto(long id, String name, Country country, Set<League> leagues, Set<GameResult> gameResults, Map<League, Integer> scores) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.leagues = leagues;
        this.gameResults = gameResults;
        this.scores = scores;
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

    public Set<League> getLeagues() {
        return leagues;
    }

    public void setLeagues(Set<League> leagues) {
        this.leagues = leagues;
    }

    public Set<GameResult> getGameResults() {
        return gameResults;
    }

    public void setGameResults(Set<GameResult> gameResults) {
        this.gameResults = gameResults;
    }

    public Map<League, Integer> getScores() {
        return scores;
    }

    public void setScores(Map<League, Integer> scores) {
        this.scores = scores;
    }

    @Override
    public String toString() {
        return "TeamDto - id: "+id+", name: "+name+", country: "+country+", leagues: "+leagues+", game results: "+gameResults+", scores: "+scores;
    }
}
