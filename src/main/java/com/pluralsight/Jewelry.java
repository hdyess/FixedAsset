package com.pluralsight;

public class Jewelry extends FixedAsset{

	double karat;


	public Jewelry(String name, double value, double karat) {
		super(name, value);
		this.karat = karat;
	}


	public double getValue() {
		return super.getValue();
	}


}
