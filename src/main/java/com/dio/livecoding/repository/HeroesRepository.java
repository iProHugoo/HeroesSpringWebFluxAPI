package com.dio.livecoding.repository;

import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

import com.dio.livecoding.document.Heroes;

@EnableScan
public interface HeroesRepository extends CrudRepository<Heroes, String> {
}
