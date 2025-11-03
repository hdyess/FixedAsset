package com.pluralsight;

public class House extends FixedAsset{

	int yearBuilt;
	int squareFeet;
	int bedrooms;


	public House(String name, double value, int yearBuilt, int squareFeet, int bedrooms) {
		super(name, value);
		this.yearBuilt = yearBuilt;
		this.squareFeet = squareFeet;
		this.bedrooms = bedrooms;
	}


	public double getValue() {
		return super.getValue();
	}

}
