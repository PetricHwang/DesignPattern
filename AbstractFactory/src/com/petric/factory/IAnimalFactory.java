package com.petric.factory;

import com.petric.product.ICat;
import com.petric.product.IDog;

public interface IAnimalFactory {

	public ICat createCat();

	public IDog createDog();
}
