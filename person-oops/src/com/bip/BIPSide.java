package com.bip;

public enum BIPSide {
	LEFT("My Left "), RIGHT("My Right ");
	static {
		System.out.println("BIPSide Enum Loaded");
	};
	
	String value = "";
	private BIPSide(String value) {
		System.out.println("Step2");
		this.value = value;
	}
	public String getValue() {
		System.out.println("Step3");
		return value;
	}
}
