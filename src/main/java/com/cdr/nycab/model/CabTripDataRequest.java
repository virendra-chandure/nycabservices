package com.cdr.nycab.model;

import java.util.Date;

public class CabTripDataRequest {
	private String[] medallions;
	private Date pickupDate;
	private boolean ignoreCache;

	public String[] getMedallions() {
		return medallions;
	}

	public void setMedallions(String[] medallions) {
		this.medallions = medallions;
	}

	public Date getPickupDate() {
		return pickupDate;
	}

	public void setPickupDate(Date pickupDate) {
		this.pickupDate = pickupDate;
	}

	public boolean isIgnoreCache() {
		return ignoreCache;
	}

	public void setIgnoreCache(boolean ignoreCache) {
		this.ignoreCache = ignoreCache;
	}

}
