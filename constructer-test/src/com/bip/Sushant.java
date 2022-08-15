package com.bip;

public class Sushant {
	public static void main(String[] args) throws CloneNotSupportedException {
		Department java = new Department("JAVA");

		Employee avay = new Employee("Avay", java, "AUG 1", 4.2);

		Employee sushant = (Employee) avay.clone();
		sushant.name = "Sushant";
		sushant.dept.nanme = "DS";

		System.out.println(avay);
		System.out.println(sushant);
	}
}
