package com.bip;

public class Employee implements Cloneable {
	String name;
	Department dept;
	String joiningData;
	Double ye;

	public Employee(String name, Department dept, String joiningData, Double ye) {
		super();
		this.name = name;
		this.dept = dept;
		this.joiningData = joiningData;
		this.ye = ye;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", dept=" + dept + ", joiningData=" + joiningData + ", ye=" + ye + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Department cD = (Department) dept.clone();
		return new Employee(name, cD, joiningData, ye);
	}
}
