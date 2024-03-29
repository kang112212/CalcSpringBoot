package com.tts.Calculator.controllers.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Calculation {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Double num1;
	private Double num2;
	private String operation;
	private Long answer;
	private String roman;
	
	
	public Calculation() {}


	public Calculation(Double num1, Double num2, String operation, Long answer, String roman) {
		super();
		this.num1 = num1;
		this.num2 = num2;
		this.operation = operation;
		this.answer = answer;
		this.roman = roman;
	}


	public Double getNum1() {
		return num1;
	}


	public void setNum1(Double num1) {
		this.num1 = num1;
	}


	public Double getNum2() {
		return num2;
	}


	public void setNum2(Double num2) {
		this.num2 = num2;
	}


	public String getOperation() {
		return operation;
	}


	public void setOperation(String operation) {
		this.operation = operation;
	}


	public Long getAnswer() {
		return answer;
	}


	public void setAnswer(Long answer) {
		this.answer = answer;
	}


	public String getRoman() {
		return roman;
	}


	public void setRoman(String roman) {
		this.roman = roman;
	}


	
	
}
