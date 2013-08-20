package com.petric.factory.impl;

import com.petric.factory.IAnimalFactory;
import com.petric.product.ICat;
import com.petric.product.IDog;
import com.petric.product.impl.BlackCat;
import com.petric.product.impl.BlackDog;

public class BlackAnimalFactory implements IAnimalFactory {

	@Override
	public ICat createCat() {
		return new BlackCat();
	}

	@Override
	public IDog createDog() {
		return new BlackDog();
	}

}
