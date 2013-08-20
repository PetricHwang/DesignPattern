package com.petric.factory.impl;

import com.petric.factory.IFactory;
import com.petric.product.IPeople;
import com.petric.product.impl.Woman;

public class WomanFactory implements IFactory {

	@Override
	public IPeople getPeople() {
		return new Woman();
	}

}
