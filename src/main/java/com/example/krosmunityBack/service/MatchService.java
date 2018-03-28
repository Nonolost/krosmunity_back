package com.example.krosmunityBack.service;

import java.time.LocalDate;
import java.util.List;

public interface MatchService {

    List<Object[]> countGodUsage(LocalDate localDate);

    float[][] winAgainstMatrix(LocalDate localDate);

    float[][] globalWinrate(LocalDate localDate);


}
