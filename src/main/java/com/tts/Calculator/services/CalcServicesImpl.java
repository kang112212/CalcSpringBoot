package com.tts.Calculator.services;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tts.Calculator.companiesRepository.CalcRepository;
import com.tts.Calculator.controllers.model.Calculation;

@Service
public class CalcServicesImpl implements CalcServicesInt {
	
	@Autowired
	CalcRepository calcRepository;
	
	@Override
	public void add(Calculation addCalc) {
		Long sum = (long) (addCalc.getNum1() + addCalc.getNum2());
		addCalc.setAnswer(sum);
		String roman =  numToRoman(sum);
		addCalc.setRoman(roman);
		calcRepository.save(addCalc);
	}
	@Override
	public void sub(Calculation subCalc) {
		Long difference = (long) (subCalc.getNum1() - subCalc.getNum2());
		subCalc.setAnswer(difference);
		String roman =  numToRoman(difference);
		subCalc.setRoman(roman);
		calcRepository.save(subCalc);
	}
	@Override
	public void div(Calculation divCalc) {
		Long quotient = (long) (divCalc.getNum1() / divCalc.getNum2());
		divCalc.setAnswer(quotient);
		String roman =  numToRoman(quotient);
		divCalc.setRoman(roman);
		calcRepository.save(divCalc);
	}
	@Override
	public void mult(Calculation multCalc) {
		Long product = (long) (multCalc.getNum1() * multCalc.getNum2());
		multCalc.setAnswer(product);
		String roman =  numToRoman(product);
		multCalc.setRoman(roman);
		calcRepository.save(multCalc);
	}
	@Override
	public List<Calculation> Answer() {
		return calcRepository.findAll();
	}
	@Override
	public String numToRoman(Long answer) {
		setup();
		String result = new String();
			if(answer == 0l) {
				return "Nulla";
			} else {
				for (Long i : bases)
				{
					while (answer >= i)
					{
						result += map.get(i);
						answer -= i;
					}
				}
				return result;
			}
	}
	
	final static Long[] bases = {
	  1000000000000000l, 900000000000000l, 500000000000000l, 400000000000000l, 100000000000000l, 90000000000000l, 50000000000000l, 40000000000000l, 10000000000000l, 9000000000000l, 5000000000000l, 4000000000000l,   
			
	  1000000000000l, 900000000000l, 500000000000l, 400000000000l, 100000000000l, 90000000000l, 50000000000l, 40000000000l, 10000000000l, 9000000000l, 5000000000l, 4000000000l,
	  
	  1000000000l, 900000000l, 500000000l, 400000000l, 100000000l, 90000000l, 50000000l, 40000000l, 10000000l, 9000000l, 5000000l, 4000000l,

	  1000000l, 900000l, 500000l, 400000l, 100000l, 90000l, 50000l, 40000l, 10000l, 9000l, 5000l, 4000l, 
	  
	  1000l, 900l, 500l, 400l, 100l, 90l, 50l, 40l, 10l, 9l, 5l, 4l, 1l };
	
	private static HashMap<Long, String> map = new HashMap<Long, String>();
	
	public void setup()
	{
		map.put(1l, "I");
		map.put(4l, "IV");
		map.put(5l, "V");
		map.put(9l, "IX");
		map.put(10l, "X");
		map.put(40l, "XL");
		map.put(50l, "L");
		map.put(90l, "XC");
		map.put(100l, "C");
		map.put(400l, "CD");
		map.put(500l, "D");
		map.put(900l, "CM");
		map.put(1000l, "M");

		map.put(4000l, " (IV) ");
		map.put(5000l, " (V) ");
		map.put(9000l, " (IX) ");
		map.put(10000l, " (X) ");
		map.put(40000l, " (XL) ");
		map.put(50000l, " (L) ");
		map.put(90000l, " (XC) ");
		map.put(100000l, " (C) ");
		map.put(400000l, " (CD) ");
		map.put(500000l, " (D) ");
		map.put(900000l, " (CM) ");
		map.put(1000000l, " (M) ");

		map.put(4000000l, " ((IV)) ");
		map.put(5000000l, " ((V)) ");
		map.put(9000000l, " ((IX)) ");
		map.put(10000000l, " ((X)) ");
		map.put(40000000l, " ((XL)) ");
		map.put(50000000l, " ((L)) ");
		map.put(90000000l, " ((XC)) ");
		map.put(100000000l, " ((C))");
		map.put(400000000l, " ((CD)) ");
		map.put(500000000l, " ((D)) ");
		map.put(900000000l, " ((CM)) ");
		map.put(1000000000l, " ((M)) ");

		map.put(4000000000l, " (((IV))) ");
		map.put(5000000000l, " (((V))) ");
		map.put(9000000000l, " (((IX))) ");
		map.put(10000000000l, " (((X))) ");
		map.put(40000000000l, " (((XL))) ");
		map.put(50000000000l, " (((L))) ");
		map.put(90000000000l, " (((XC))) ");
		map.put(100000000000l, " (((C))) ");
		map.put(400000000000l, " (((CD))) ");
		map.put(500000000000l, " (((D))) ");
		map.put(900000000000l, " (((CM))) ");
		map.put(1000000000000l, " (((M))) ");
		
		map.put(4000000000000l, " ((((IV)))) ");
		map.put(5000000000000l, " ((((V)))) ");
		map.put(9000000000000l, " ((((IX)))) ");
		map.put(10000000000000l, " ((((X)))) ");
		map.put(40000000000000l, " ((((XL)))) ");
		map.put(50000000000000l, " ((((L)))) ");
		map.put(90000000000000l, " ((((XC)))) ");
		map.put(100000000000000l, " ((((C)))) ");
		map.put(400000000000000l, " ((((CD)))) ");
		map.put(500000000000000l, " ((((D)))) ");
		map.put(900000000000000l, " ((((CM)))) ");
		map.put(1000000000000000l, " ((((M)))) ");
	}	
	
}
