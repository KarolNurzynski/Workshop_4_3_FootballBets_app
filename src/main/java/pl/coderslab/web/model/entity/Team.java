package pl.coderslab.web.model.entity;

import java.util.Map;
import java.util.Set;

public class Team {

    private long id;
    private String name;
    private Country country;
    private Set<League> leagues;
    private Set<GameResult> gameResults;
    private Map<League,Integer> scores;

    public Team() {
    }

    public Team(long id, String name, Country country, Set<League> leagues, Set<GameResult> gameResults, Map<League, Integer> scores) {
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
}
