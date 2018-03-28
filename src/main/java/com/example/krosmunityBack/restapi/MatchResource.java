package com.example.krosmunityBack.restapi;

import com.example.krosmunityBack.service.MatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping(MatchResource.MATCH_BASE_PATH)
public class MatchResource {

    public static final String MATCH_BASE_PATH = "/match";

    @Autowired
    MatchService matchService;

    @GetMapping("/usage")
    List<Object[]> count() {
        return matchService.countGodUsage(LocalDate.now().minusDays(30));
    }

    @GetMapping("/winrate")
    float[][] winrate() {
            return matchService.winAgainstMatrix(LocalDate.now().minusDays(30));
    }
    @GetMapping("/globalWinrate")
    float[][] globalWinrate() {
        return matchService.globalWinrate(LocalDate.now().minusDays(30));
    }

}
