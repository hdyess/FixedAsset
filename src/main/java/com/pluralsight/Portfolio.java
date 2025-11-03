package com.pluralsight;

import java.util.ArrayList;

public class Portfolio {
	private String name;
	private String owner;
	private ArrayList<FixedAsset> assets;

	public Portfolio(String name, String owner) {
		this.name = name;
		this.owner = owner;
	}

	public void add(FixedAsset asset) {
		assets.add(asset);
	}

	public double getValue() {
		double returnValue = 0;
		for (FixedAsset a : assets) {
			returnValue += a.getMarketValue();
		}
		return returnValue;
	}



}
