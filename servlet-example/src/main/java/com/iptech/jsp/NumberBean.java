package com.iptech.jsp;

import java.io.Serializable;

public class NumberBean implements Serializable{
	private static final long serialVersionUID = -7276641989735853235L;
	private double number;

	public double getNumber() {
		System.out.println("Getting number: "+number);
		return number;
	}

	public void setNumber(double number) {
		this.number = number;
	}

	public NumberBean(double number) {
		super();
		System.out.println("Contrstor: "+number);
		this.number = number;
	}
	
}
