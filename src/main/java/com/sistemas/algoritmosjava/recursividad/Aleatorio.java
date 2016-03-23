package com.sistemas.algoritmosjava.recursividad;

import java.util.Random;

public class Aleatorio {
	public int seed(int n){
		Random rnd = new Random();
		return (int)(rnd.nextDouble() * n + 1);
	}
}
