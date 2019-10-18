package com.tts.Calculator.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tts.Calculator.controllers.model.Calculation;
import com.tts.Calculator.services.CalcServicesImpl;

@RestController
public class CalcController {
	
	@Autowired
	CalcServicesImpl calcServicesImpl;
	
	@CrossOrigin
	@GetMapping("/calculators")
	public List<Calculation> showAnswer() {
		return calcServicesImpl.Answer();
	}
	
	@CrossOrigin(origins = "http://localhost:3000")
	@PostMapping("/calculator/add")
	public void postAdd(@RequestBody Calculation addCalc) {
		calcServicesImpl.add(addCalc);
	}
	
	@CrossOrigin(origins = "http://localhost:3000")
	@PostMapping("/calculator/sub")
	public void postSub(@RequestBody Calculation subCalc) {
		calcServicesImpl.sub(subCalc);
	}
	
	@CrossOrigin(origins = "http://localhost:3000")
	@PostMapping("/calculator/div")
	public void postDiv(@RequestBody Calculation divCalc) {
		calcServicesImpl.div(divCalc);
	}
	
	@CrossOrigin(origins = "http://localhost:3000")
	@PostMapping("/calculator/mult")
	public void postMult(@RequestBody Calculation multCalc) {
		calcServicesImpl.mult(multCalc);
	}
	
	
}
