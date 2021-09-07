package com.SiteDetailsTest.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.SiteDetailsTest.common.RequestMapper;
import com.SiteDetailsTest.service.SiteDetailService;
import com.SiteDetailsTest.service.dto.AllSitesRequest;

@RestController
public class SiteDetailController {
	@Autowired
	private SiteDetailService siteDetailService;

	@PostMapping(RequestMapper.FIND_ALL_AND_PUSH)
	@ResponseStatus(HttpStatus.OK)
	public void create(@RequestBody AllSitesRequest allSitesRequest) {
		System.out.println(allSitesRequest.getSites().size());
		siteDetailService.saveAllSites(allSitesRequest.getSites());
	}
}
