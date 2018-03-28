package com.example.krosmunityBack.domain;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

import static com.example.krosmunityBack.domain.MatchEntity.MATCH_TABLE;

@Entity
@Table(name = MATCH_TABLE)
public class MatchEntity {


    public static final String MATCH_TABLE = "Matches";

    public static final String ID_COLUMN = "id";
    public static final String PLAYER_CLASS_COLUMN = "player_class";
    public static final String OPPONENT_CLASS_COLUMN = "opponent_class";
    public static final String WINNER_COLUMN = "winner";
    public static final String NB_TOUR_COLUMN = "nb_tours";
    public static final String GAME_DURATION_COLUMN = "duration";
    public static final String TRACKER_VERSION_COLUMN = "tracker_version";
    public static final String DATE_COLUMN = "date";
    public static final String TYPE_MATCH_COLUMN = "type_match";
    public static final String PLAYER_RANK_COLUMN = "player_rank";


    @Id
    @Column(name = ID_COLUMN)
    private int id;

    @Column(name = PLAYER_CLASS_COLUMN)
    private int playerClass;

    @Column(name = OPPONENT_CLASS_COLUMN)
    private int opponentClass;

    @Column(name = WINNER_COLUMN)
    private int winner;

    @Column(name = NB_TOUR_COLUMN)
    private int nbTours;

    @Column(name = GAME_DURATION_COLUMN)
    private int gameDuration;

    @Column(name = TRACKER_VERSION_COLUMN)
    private String trackerVersion;

    @Column(name = DATE_COLUMN)
    private LocalDateTime dateTime;

    @Column(name = TYPE_MATCH_COLUMN)
    private int typeMatch;

    @Column(name = PLAYER_RANK_COLUMN)
    private int playerRank;


    public MatchEntity() {
    }

    public MatchEntity(int id, int playerClass, int opponentClass, int winner, int nbTours, int gameDuration, String trackerVersion, LocalDateTime dateTime, int typeMatch, int playerRank) {
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

    public String getTrackerVersion() {
        return trackerVersion;
    }

    public void setTrackerVersion(String trackerVersion) {
        this.trackerVersion = trackerVersion;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
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
