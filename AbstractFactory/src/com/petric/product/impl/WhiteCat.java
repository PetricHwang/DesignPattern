package com.petric.product.impl;

import com.petric.product.ICat;

public class WhiteCat implements ICat {

	@Override
	public void eat() {
		System.out.println("The white cat is eating!!!");
	}

}
