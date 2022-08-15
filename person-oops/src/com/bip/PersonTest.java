package com.bip;

public class PersonTest {
	public static void main(String[] args) {
		System.out.println("Main");
		Leg leftLeg = new Leg(BIPSide.LEFT, BIPColor.BLACK, 2);
		Leg rightLeg = new Leg(BIPSide.RIGHT, BIPColor.BLACK, 2);

		Hand leftHand = new Hand(BIPSide.LEFT, BIPColor.BLACK, 2);
		Hand rightHand = new Hand(BIPSide.RIGHT, BIPColor.BLACK, 2);

		Person person = new Person("Sushant", 26, BIPColor.BLACK, leftLeg, rightLeg, leftHand, rightHand);
		System.out.println(person);
	}
}
