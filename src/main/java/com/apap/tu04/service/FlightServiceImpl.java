package com.apap.tu04.service;


import org.springframework.transaction.annotation.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apap.tu04.model.FlightModel;
import com.apap.tu04.repository.FlightDb;

@Service
@Transactional
public class FlightServiceImpl implements FlightService{
	
	@Autowired
	private FlightDb flightDb;
	
	@Override
	public void addFlight(FlightModel flight) {
		flightDb.save(flight);
	}

	@Override
	public void deleteFlight(FlightModel flight) {
		// TODO Auto-generated method stub
		flightDb.delete(flight);
	}

	@Override
	public FlightModel getFlightByID(long id) {
		// TODO Auto-generated method stub
		
		return flightDb.findById(id).get();
	}

	
}