package com.tts.Calculator.services;

import java.util.List;

import com.tts.Calculator.controllers.model.Calculation;

public interface CalcServicesInt {

	String numToRoman(Long answer);

	List<Calculation> Answer();

	void mult(Calculation multCalc);

	void div(Calculation divCalc);

	void sub(Calculation subCalc);

	void add(Calculation addCalc);

}
