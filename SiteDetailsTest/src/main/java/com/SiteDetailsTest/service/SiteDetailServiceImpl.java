package com.SiteDetailsTest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SiteDetailsTest.domain.Site;
import com.SiteDetailsTest.repository.SiteDetailRepository;

@Service
public class SiteDetailServiceImpl implements SiteDetailService {

	@Autowired
	SiteDetailRepository siteDetailRepository;

	@Override
	public void saveAllSites(List<Site> sites) {
		for(Site site : sites) {
			siteDetailRepository.save(site);
		}
		//siteDetailRepository.saveAll(sites);
		//https://javatechonline.com/saving-data-into-database-using-spring-boot-data-jpa-step-by-step-tutorial/
	}

}
