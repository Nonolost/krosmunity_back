package com.example.krosmunityBack.domain.DTO;

public class MatchDTO {
    private int id;

    private int playerClass;

    private int opponentClass;

    private int winner;

    private int nbTours;

    private int gameDuration;

    private int trackerVersion;

    private String dateTime;

    private int typeMatch;

    private int playerRank;

    public MatchDTO() {
    }

    public MatchDTO(int id, int playerClass, int opponentClass, int winner, int nbTours, int gameDuration, int trackerVersion, String dateTime, int typeMatch, int playerRank) {
        this.id = id;
        this.playerClass = playerClass;
        this.opponentClass = opponentClass;
        this.winner = winner;
        this.nbTours = nbTours;
        this.gameDuration = gameDuration;
        this.trackerVersion = trackerVersion;
        this.dateTime = dateTime;
        this.typeMatch = typeMatch;
        this.playerRank = playerRank;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPlayerClass() {
        return playerClass;
    }

    public void setPlayerClass(int playerClass) {
        this.playerClass = playerClass;
    }

    public int getOpponentClass() {
        return opponentClass;
    }

    public void setOpponentClass(int opponentClass) {
        this.opponentClass = opponentClass;
    }

    public int getWinner() {
        return winner;
    }

    public void setWinner(int winner) {
        this.winner = winner;
    }

    public int getNbTours() {
        return nbTours;
    }

    public void setNbTours(int nbTours) {
        this.nbTours = nbTours;
    }

    public int getGameDuration() {
        return gameDuration;
    }

    public void setGameDuration(int gameDuration) {
        this.gameDuration = gameDuration;
    }

    public int getTrackerVersion() {
        return trackerVersion;
    }

    public void setTrackerVersion(int trackerVersion) {
        this.trackerVersion = trackerVersion;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public int getTypeMatch() {
        return typeMatch;
    }

    public void setTypeMatch(int typeMatch) {
        this.typeMatch = typeMatch;
    }

    public int getPlayerRank() {
        return playerRank;
    }

    public void setPlayerRank(int playerRank) {
        this.playerRank = playerRank;
    }
}
