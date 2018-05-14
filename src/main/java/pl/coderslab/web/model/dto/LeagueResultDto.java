package pl.coderslab.web.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import pl.coderslab.web.model.entity.League;

import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LeagueResultDto {

    @JsonProperty("leagueResult_id")
    private long id;

    @JsonProperty("leagueResult_league")
    private League league;

    @JsonProperty("leagueResult_year")
    private int year;

    @JsonProperty("leagueResult_resultTable")
    private Map<TeamDto,Integer> resultsTable;     //int jest miejscem zespolu w tabeli wynikow (moglby byc ten np. liczba zdobytych punktow)

    public LeagueResultDto() {
    }

    public LeagueResultDto(long id, League league, int year, Map<TeamDto, Integer> resultsTable) {
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

    public Map<TeamDto, Integer> getResultsTable() {
        return resultsTable;
    }

    public void setResultsTable(Map<TeamDto, Integer> resultsTable) {
        this.resultsTable = resultsTable;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "LeagueResultDto - id: "+id+",league: "+league+", year: "+year+", result table: "+resultsTable.toString();
    }
}
