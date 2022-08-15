package com.bip;

public class Department implements Cloneable {
	String nanme;

	public String getNanme() {
		return nanme;
	}

	public void setNanme(String nanme) {
		this.nanme = nanme;
	}

	public Department(String nanme) {
		super();
		this.nanme = nanme;
	}

	@Override
	public String toString() {
		return "Department [nanme=" + nanme + "]";
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
