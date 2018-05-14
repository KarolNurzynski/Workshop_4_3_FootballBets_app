package pl.coderslab.web.model.entity;

import java.util.Set;

public class Sport {

    private int id;
    private String name;
    private Set<Team> teams;
    private Set<League> leagues;
    private Set<LeagueResult> leagueResults;

    public Sport() {
    }

    public Sport(int id, String name, Set<Team> teams, Set<League> leagues, Set<LeagueResult> leagueResults) {
        this.id = id;
        this.name = name;
        this.teams = teams;
        this.leagues = leagues;
        this.leagueResults = leagueResults;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Team> getTeams() {
        return teams;
    }

    public void setTeams(Set<Team> teams) {
        this.teams = teams;
    }

    public Set<League> getLeagues() {
        return leagues;
    }

    public void setLeagues(Set<League> leagues) {
        this.leagues = leagues;
    }

    public Set<LeagueResult> getLeagueResults() {
        return leagueResults;
    }

    public void setLeagueResults(Set<LeagueResult> leagueResults) {
        this.leagueResults = leagueResults;
    }
}
