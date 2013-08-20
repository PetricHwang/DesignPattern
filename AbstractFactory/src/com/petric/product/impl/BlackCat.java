package com.petric.product.impl;

import com.petric.product.ICat;

public class BlackCat implements ICat {

	@Override
	public void eat() {
		System.out.println("The black cat is eating!!!");
	}

}
