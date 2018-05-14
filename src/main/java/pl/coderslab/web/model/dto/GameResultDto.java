package pl.coderslab.web.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import pl.coderslab.web.model.entity.Team;

import java.util.Date;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GameResultDto {

    @JsonProperty("game_id")
    private long id;

    @JsonProperty("game_date")
    private Date date;

    @JsonProperty("game_teamA")
    private Team teamA;

    @JsonProperty("game_teamB")
    private Team teamB;

    @JsonProperty("game_resultTeamA")
    private int resultTeamA;

    @JsonProperty("game_resultTeamB")
    private int resultTeamB;

    public GameResultDto() {
    }

    public GameResultDto(long id, Date date, Team teamA, Team teamB, int resultTeamA, int resultTeamB) {
        this.id = id;
        this.date = date;
        this.teamA = teamA;
        this.teamB = teamB;
        this.resultTeamA = resultTeamA;
        this.resultTeamB = resultTeamB;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Team getTeamA() {
        return teamA;
    }

    public void setTeamA(Team TeamA) {
        this.teamA = TeamA;
    }

    public Team getTeamB() {
        return teamB;
    }

    public void setTeamB(Team TeamB) {
        this.teamB = TeamB;
    }

    public int getResultTeamA() {
        return resultTeamA;
    }

    public void setResultTeamA(int resultTeamA) {
        this.resultTeamA = resultTeamA;
    }

    public int getResultTeamB() {
        return resultTeamB;
    }

    public void setResultTeamB(int resultTeamB) {
        this.resultTeamB = resultTeamB;
    }

    @Override
    public String toString() {
        return "GameResultDto - id: "+id+",date: "+date.toString()+", result: "+teamA+" - "+teamB+" "+resultTeamA+" : "+resultTeamB;
    }
}
