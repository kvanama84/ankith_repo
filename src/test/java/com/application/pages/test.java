package com.application.pages;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String emailstamp="abcdhkfk@gmail.com";
		String Datearr[] =emailstamp.split("@");
		String emailfront=Datearr[0];
		String emailrear=Datearr[1];
		
		SimpleDateFormat sdf=new SimpleDateFormat("hh:mm:ss");
		
		String timestamp=sdf.format(Calendar.getInstance().getTime());
		timestamp=timestamp.replace(":", "-");
		String finalemail_id=emailfront+timestamp+"@"+emailrear;
		System.out.println(finalemail_id);
	}

}
