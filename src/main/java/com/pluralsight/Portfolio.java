package com.pluralsight;

import java.util.ArrayList;

public class Portfolio {
	private String name;
	private String owner;
	private ArrayList<Valuable> assets;

	public Portfolio(String name, String owner) {
		this.name = name;
		this.owner = owner;
		this.assets = new ArrayList<Valuable>();
	}

	public void add(FixedAsset asset) {
		assets.add(asset);
	}

	public double getValue() {
		double returnValue = 0;
		for (Valuable v : assets) {
			returnValue += v.getValue();
		}
		return returnValue;
	}

}
