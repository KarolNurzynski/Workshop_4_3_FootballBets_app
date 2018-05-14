package pl.coderslab.web.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import pl.coderslab.web.model.entity.LeagueResult;

import java.util.Set;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SportDto {

    @JsonProperty("sport_id")
    private int id;

    @JsonProperty("sport_name")
    private String name;

    @JsonProperty("sport_teams")
    private Set<TeamDto> teams;

    @JsonProperty("sport_leagues")
    private Set<LeagueDto> leagues;

    @JsonProperty("sport_id")
    private Set<LeagueResult> leagueResults;

    public SportDto() {
    }

    public SportDto(int id, String name, Set<TeamDto> teams, Set<LeagueDto> leagues, Set<LeagueResult> leagueResults) {
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

    public Set<TeamDto> getTeamDtos() {
        return teams;
    }

    public void setTeamDtos(Set<TeamDto> teams) {
        this.teams = teams;
    }

    public Set<LeagueDto> getLeagueDtos() {
        return leagues;
    }

    public void setLeagueDtos(Set<LeagueDto> leagues) {
        this.leagues = leagues;
    }

    public Set<LeagueResult> getLeagueResults() {
        return leagueResults;
    }

    public void setLeagueResults(Set<LeagueResult> leagueResults) {
        this.leagueResults = leagueResults;
    }

    @Override
    public String toString() {
        return "Sport - id: "+id+",name: "+name+", teams: "+teams+", leagues: "+leagues;
    }
}
