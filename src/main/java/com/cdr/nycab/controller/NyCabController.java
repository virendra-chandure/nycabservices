package com.cdr.nycab.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cdr.nycab.entity.CabTripSummary;
import com.cdr.nycab.model.CabTripDataRequest;
import com.cdr.nycab.service.NyCabServiceImpl;

@RestController
@RequestMapping(path = "/api/nycabdata")
public class NyCabController {

	@Autowired
	private NyCabServiceImpl service;

	@PostMapping(path = "/trips/find", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> find(@RequestBody CabTripDataRequest request) {
		List<CabTripSummary> cabTripDataList = service.getNoOfTripsInMedallion(request.getMedallions(),
				request.getPickupDate(), request.isIgnoreCache());
		return ResponseEntity.ok(cabTripDataList);
	}

	@DeleteMapping(path = "/cache")
	public ResponseEntity<?> clearCache() {
		service.clearCache();
		return ResponseEntity.accepted().build();
	}
}
