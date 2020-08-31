package com.cdr.nycab.repo;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cdr.nycab.entity.CabTripData;
import com.cdr.nycab.entity.CabTripSummary;

@Repository
public interface CabTripDataRepository extends CrudRepository<CabTripData, String> {
	@Query(value = "SELECT medallion, count(medallion) as noOfTrips FROM cab_trip_data WHERE medallion IN (:medallions) AND pickup_datetime between :pickupDate and DATE_ADD(:pickupDate, INTERVAL 1 DAY) group by medallion", nativeQuery = true)
	List<CabTripSummary> groupBy(@Param(value = "medallions") String[] medallions, @Param(value = "pickupDate") Date date);
}
