package com.SiteDetailsTest.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.SiteDetailsTest.domain.Site;

@Repository
public interface SiteDetailRepository extends MongoRepository<Site, String> {

}
