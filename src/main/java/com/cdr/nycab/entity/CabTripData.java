package com.cdr.nycab.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CabTripData {

	@Id
	private String medallion;

}
