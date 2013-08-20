package com.petric.factory.impl;

import com.petric.factory.IAnimalFactory;
import com.petric.product.ICat;
import com.petric.product.IDog;
import com.petric.product.impl.WhiteCat;
import com.petric.product.impl.WhiteDog;

public class WhiteAnimalFactory implements IAnimalFactory {

	@Override
	public ICat createCat() {
		return new WhiteCat();
	}

	@Override
	public IDog createDog() {
		return new WhiteDog();
	}

}
