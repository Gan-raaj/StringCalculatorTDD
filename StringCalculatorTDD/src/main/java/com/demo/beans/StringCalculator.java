package com.demo.beans;

import java.util.List;

public class StringCalculator {
	 
	public int Add(String number) {
		if(number.isEmpty()) {
			return 0;
		}else if(number.contains(",")) {
			String[] splt = number.split(",");
			int sum = 0;
				for(String str:splt) {
					sum += toInt(str);
				}
			return sum;
		}
		else {
			return Integer.parseInt(number);
		}
	}

	private int toInt(String str) {
		return Integer.parseInt(str);
	}
}
