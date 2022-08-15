package com.bip;

public class Person {
	String name;
	int age;

	BIPColor color;
	Leg leftLeg;
	Leg rightLeg;
	Hand leftHand;
	Hand rightHand;

	public Person(String name, int age, BIPColor color, Leg leftLeg, Leg rightLeg, Hand leftHand, Hand rightHand) {
		super();
		this.name = name;
		this.age = age;
		this.color = color;
		this.leftLeg = leftLeg;
		this.rightLeg = rightLeg;
		this.leftHand = leftHand;
		this.rightHand = rightHand;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public BIPColor getColor() {
		return color;
	}

	public void setColor(BIPColor color) {
		this.color = color;
	}

	public Leg getLeftLeg() {
		return leftLeg;
	}

	public void setLeftLeg(Leg leftLeg) {
		this.leftLeg = leftLeg;
	}

	public Leg getRightLeg() {
		return rightLeg;
	}

	public void setRightLeg(Leg rightLeg) {
		this.rightLeg = rightLeg;
	}

	public Hand getLeftHand() {
		return leftHand;
	}

	public void setLeftHand(Hand leftHand) {
		this.leftHand = leftHand;
	}

	public Hand getRightHand() {
		return rightHand;
	}

	public void setRightHand(Hand rightHand) {
		this.rightHand = rightHand;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", color=" + color + ", leftLeg=" + leftLeg + ", rightLeg="
				+ rightLeg + ", leftHand=" + leftHand + ", rightHand=" + rightHand + "]";
	}
	
	static {
		System.out.println("Person Loaded");
	}

}
