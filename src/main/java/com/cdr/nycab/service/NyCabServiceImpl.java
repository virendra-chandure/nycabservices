package com.cdr.nycab.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.cdr.nycab.entity.CabTripSummary;
import com.cdr.nycab.repo.CabTripDataRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class NyCabServiceImpl implements NyCabService {
	
	private static final org.slf4j.Logger log = 
		    org.slf4j.LoggerFactory.getLogger(NyCabServiceImpl.class);
	@Autowired
	CabTripDataRepository cabTripDataRepository;

	@Cacheable(value = "cabtrips", condition = "!#ignoreCache")
	public List<CabTripSummary> getNoOfTripsInMedallion(String[] medallions, Date pickupDate, boolean ignoreCache) {
		log.info("Populating data for medallions: {}, pickupDate: {}", medallions, pickupDate);
		List<CabTripSummary> cabTrips = cabTripDataRepository.groupBy(medallions, pickupDate);
		log.info("Cab trip data populated from database");
		return cabTrips;
	}

	@CacheEvict(value = "cabtrips", allEntries = true)
	public void clearCache() {
		log.info("Cache cleared for the cab trip data");
	}

}
