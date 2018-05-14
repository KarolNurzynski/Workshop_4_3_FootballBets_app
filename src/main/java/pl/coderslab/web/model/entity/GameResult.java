package pl.coderslab.web.model.entity;

import java.util.Date;

public class GameResult {

    private long id;
    private Date date;
    private Team teamA;
    private Team teamB;
    private int resultTeamA;
    private int resultTeamB;

    public GameResult() {
    }

    public GameResult(long id, Date date, Team teamA, Team teamB, int resultTeamA, int resultTeamB) {
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

    public void setTeamA(Team teamA) {
        this.teamA = teamA;
    }

    public Team getTeamB() {
        return teamB;
    }

    public void setTeamB(Team teamB) {
        this.teamB = teamB;
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
}
