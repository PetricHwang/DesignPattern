package com.petric.main;

import com.petric.factory.IFactory;
import com.petric.factory.impl.ManFactory;
import com.petric.factory.impl.WomanFactory;
import com.petric.product.IPeople;

public class MainTest {
	public static void main(String[] args) {

		IFactory manFactory = new ManFactory();
		IPeople man = manFactory.getPeople();
		man.say();

		IFactory womanFactory = new WomanFactory();
		IPeople woman = womanFactory.getPeople();
		woman.say();
	}
}
