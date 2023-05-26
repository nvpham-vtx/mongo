package com.spring.mongo.demo.repository;

import com.spring.mongo.demo.model.SuperHero;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface SuperHeroRepository extends MongoRepository<SuperHero, String> {
    SuperHero findByName(String name);
}
