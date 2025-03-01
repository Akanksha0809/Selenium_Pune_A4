package com.ShoppersStack_GenericUtility;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Random;

public class Java_Utility {

	public int getRandomNumber() {
		Random r=new Random();
		int num = r.nextInt(1000);
		return num;
	}
	
	public String getLocalDate() {
		String localDate = LocalDate.now().toString().replace("-","");
		return localDate;
	}
	
	public String getLocalDateAndTime() {
		String localDateTime = LocalDateTime.now().toString().replace("-","").replace(":","").replace(".","");
		return localDateTime;
	}

}
