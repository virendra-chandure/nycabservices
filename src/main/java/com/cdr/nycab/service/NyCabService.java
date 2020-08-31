package com.cdr.nycab.service;

import java.util.Date;
import java.util.List;

import com.cdr.nycab.entity.CabTripSummary;

public interface NyCabService {

	public List<CabTripSummary> getNoOfTripsInMedallion(String[] medallions, Date pickupDate, boolean ignoreCache);

	public void clearCache();

}
