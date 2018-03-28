package com.example.krosmunityBack.service.impl;

import com.example.krosmunityBack.repository.MatchRepository;
import com.example.krosmunityBack.service.MatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class MatchServiceImpl implements MatchService {

    @Autowired
    private MatchRepository matchRepository;

    public List<Object[]> countGodUsage(LocalDate localDate) {
        return matchRepository.countGodUsage(localDate);
    }

    public float[][] winAgainstMatrix(LocalDate localDate) {
        int result[][] = new int[10][10];
        float result2[][] = new float[10][10];
        matchRepository.countWinLoss(localDate).stream().forEach((a) -> {
            result[((Number) a[0]).intValue() - 1][((Number) a[1]).intValue() - 1] = ((Number) a[2]).intValue();
        });

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                result2[i][j] = 100 * result[i][j] / (float) (result[i][j] + result[j][i]);
            }
        }
        return result2;
    }

    public float[][] globalWinrate(LocalDate localDate) {
        List<Object[]> win = win(localDate);
        List<Object[]> loss = loss(localDate);
        float[][] res = new float[10][2];

        for (int i = 0; i < 10; i++) {
            res[i][0] = i + 1;
            res[i][1] = ((Number) win.get(i)[1]).intValue() / (float) (((Number) win.get(i)[1]).intValue() + ((Number) loss.get(i)[1]).intValue());
        }

        return res;
    }

    private List<Object[]> win(LocalDate localDate) {
        return matchRepository.countGodWin(localDate);
    }

    private List<Object[]> loss(LocalDate localDate) {
        return matchRepository.countGodLoss(localDate);
    }


}