package com.SiteDetailsTest.service.dto;

import java.util.List;

import com.SiteDetailsTest.domain.Site;

public class AllSitesRequest {

	private List<Site> sites;

	public AllSitesRequest(List<Site> sites) {
	        this.sites = sites;
	    }

	public List<Site> getSites() {
		return sites;
	}

	public AllSitesRequest() {
		super();
		
	}

	public void setSites(List<Site> sites) {
		this.sites = sites;
	}
}
