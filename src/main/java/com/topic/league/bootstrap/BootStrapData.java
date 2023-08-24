package com.topic.league.bootstrap;

import com.topic.league.entities.Athlete;
import com.topic.league.entities.Team;
import com.topic.league.repositories.AthleteRepository;
import com.topic.league.repositories.TeamRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class BootStrapData implements CommandLineRunner{

    private final AthleteRepository athleteRepository;
    private final TeamRepository teamRepository;

    public BootStrapData(AthleteRepository athleteRepository, TeamRepository teamRepository) {
        this.athleteRepository = athleteRepository;
        this.teamRepository = teamRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Team eleftherai = new Team("Eleftherai", "el@gmail.com");
        Athlete joxlo = new Athlete("Giannis","Xlo",new Date (19-02-1991),"gxlo@gmail.com", 8, 8 , 2);
        Athlete vlassis = new Athlete("Vlassios","Makr",new Date (19-02-1444),"sdfsd@gmail.com", 10, 8 , 5);
        Athlete gouz = new Athlete("Chris","Gouz",new Date (19-02-2000),"gxhrtlo@gmail.com", 2, 0 , 2);

        eleftherai.getTeamMember().add(vlassis);
        eleftherai.getTeamMember().add(gouz);
        eleftherai.getTeamMember().add(joxlo);

        teamRepository.save(eleftherai);
        System.out.println(eleftherai);
    }
}
