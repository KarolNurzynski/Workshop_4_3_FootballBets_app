package pl.coderslab.web.model.entity;

import java.util.Map;

public class LeagueResult {

    private long id;
    private League league;
    private int year;
    private Map<Team,Integer> resultsTable;     //int jest miejscem zespolu w tabeli wynikow (moglby byc ten np. liczba zdobytych punktow)

    public LeagueResult() {
    }

    public LeagueResult(long id, League league, int year, Map<Team, Integer> resultsTable) {
        this.id = id;
        this.league = league;
        this.year = year;
        this.resultsTable = resultsTable;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public League getLeague() {
        return league;
    }

    public void setLeague(League league) {
        this.league = league;
    }

    public Map<Team, Integer> getResultsTable() {
        return resultsTable;
    }

    public void setResultsTable(Map<Team, Integer> resultsTable) {
        this.resultsTable = resultsTable;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
