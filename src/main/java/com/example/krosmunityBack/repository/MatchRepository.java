package com.example.krosmunityBack.repository;

import com.example.krosmunityBack.domain.MatchEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;


@Repository
public interface MatchRepository extends JpaRepository<MatchEntity, Integer>, JpaSpecificationExecutor<MatchEntity> {

    @Query(value="select class, count(*) From (select player_class as class from matches where date>?1 union all select opponent_class as class from matches where date>?1) Tab group by class", nativeQuery = true)
    List<Object []> countGodUsage(LocalDate time);

    @Query(value="SELECT class,count(*) FROM (SELECT player_class AS class FROM matches WHERE winner=1 AND date>?1 UNION ALL SELECT opponent_class AS class FROM matches WHERE winner=0 AND date>?1) Tab GROUP BY class;", nativeQuery = true)
    List<Object []> countGodWin(LocalDate time);

    @Query(value="SELECT class,count(*) FROM (SELECT player_class AS class FROM matches WHERE winner=0 AND date>?1 UNION ALL SELECT opponent_class AS class FROM matches WHERE winner=1 AND date>?1) Tab GROUP BY class;", nativeQuery = true)
    List<Object []> countGodLoss(LocalDate time);

    @Query(value="select player_class , opponent_class ,count(*) as count From (select id,player_class,opponent_class from matches where winner = 1 AND date>?1 union all select id,opponent_class,player_class from matches where winner=0 AND date>?1) Tab group by 1,2", nativeQuery = true)
    List<Object []> countWinLoss(LocalDate localDate);


}
