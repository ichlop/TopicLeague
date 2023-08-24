package com.topic.league.repositories;

import com.topic.league.entities.Athlete;
import org.springframework.data.repository.CrudRepository;

public interface AthleteRepository extends CrudRepository<Athlete,Long> {
}
