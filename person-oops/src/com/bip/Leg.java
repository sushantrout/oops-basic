package com.bip;

public class Leg {
	BIPSide side;
	BIPColor color;
	int height;

	public BIPSide getSide() {
		return side;
	}

	public void setSide(BIPSide side) {
		this.side = side;
	}

	public BIPColor getColor() {
		return color;
	}

	public void setColor(BIPColor color) {
		this.color = color;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public Leg(BIPSide side, BIPColor color, int height) {
		super();
		this.side = side;
		this.color = color;
		this.height = height;
	}

	@Override
	public String toString() {
		return "Leg [side=" + side + ", color=" + color + ", height=" + height + "]";
	}
	
	static {
		System.out.println("Leg Loaded");
	}

}
