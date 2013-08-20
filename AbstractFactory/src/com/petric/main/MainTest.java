package com.petric.main;

import com.petric.factory.IAnimalFactory;
import com.petric.factory.impl.BlackAnimalFactory;
import com.petric.factory.impl.WhiteAnimalFactory;
import com.petric.product.ICat;
import com.petric.product.IDog;

public class MainTest {
	public static void main(String[] args) {
		IAnimalFactory whiteAnimalFactory = new WhiteAnimalFactory();
		ICat whiteCat = whiteAnimalFactory.createCat();
		whiteCat.eat();
		IDog whiteDog = whiteAnimalFactory.createDog();
		whiteDog.eat();

		IAnimalFactory blackAnimalFactory = new BlackAnimalFactory();
		ICat blackCat = blackAnimalFactory.createCat();
		blackCat.eat();
		IDog blackDog = blackAnimalFactory.createDog();
		blackDog.eat();

	}
}
