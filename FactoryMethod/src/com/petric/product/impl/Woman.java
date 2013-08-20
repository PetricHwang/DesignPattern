package com.petric.product.impl;

import com.petric.product.IPeople;

public class Woman implements IPeople {

	@Override
	public void say() {
		System.out.println("I'm a Woman!!!");
	}

}
