package com.tts.Calculator.companiesRepository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.tts.Calculator.controllers.model.Calculation;

public interface CalcRepository extends CrudRepository<Calculation, Long> {

	public List<Calculation> findAll();


	
	
}
