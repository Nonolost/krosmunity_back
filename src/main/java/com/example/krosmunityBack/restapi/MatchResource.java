package com.example.krosmunityBack.restapi;

import com.example.krosmunityBack.service.MatchService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Autowired
    MatchService matchService;

    @GetMapping("/usage")
    List<Object[]> count() {
        LOGGER.debug("[GET-match-usage]");
        return matchService.countGodUsage(LocalDate.now().minusDays(300));
    }

    @GetMapping("/winrate")
    float[][] winrate() {
        LOGGER.debug("[GET-match-winrate]");
        return matchService.winAgainstMatrix(LocalDate.now().minusDays(300));
    }

    @GetMapping("/globalWinrate")
    float[][] globalWinrate() {
        LOGGER.debug("[GET-match-globalWinrate]");
        return matchService.globalWinrate(LocalDate.now().minusDays(300));
    }

}
