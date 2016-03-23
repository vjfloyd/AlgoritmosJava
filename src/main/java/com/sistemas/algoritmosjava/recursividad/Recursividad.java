package com.sistemas.algoritmosjava.recursividad;

import java.util.Arrays;

public class Recursividad {

	public void count(int x){
		if( x == 0)
			return;
		System.out.println(x);
		count(x -1);
	}
	public void count2(int x){
		if( x > 0){
			System.out.println(x);
			count(x -1);
		}
	}
	
	public int getHigher(int arreglo[],int i,int mayor){	
		System.out.println("tam=" + arreglo.length);
		
		System.out.println("i=" + i + "mayor=" + mayor);
		if( i < arreglo.length ){
		  if( arreglo[i] > mayor){
    		 mayor = arreglo[i];  
		  }
			return getHigher(arreglo, i+1,mayor); 
		}
		return mayor;
	}
	
	public int[] getArray(int n,int max){
		Aleatorio al = new Aleatorio();
		int array[] = new int[n];
		for (int i = 0; i < array.length; i++) {
				array[i] = al.seed(max);
		}
		return array;
	}
	
	
	public void showArray(int array[]){
		System.out.println();
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+",");
		}
		System.out.println();
	}
	
	public int factorial(int n){
		if(n==0)
			return 2;
		System.out.println("n="+n);	
		return n*factorial(n-1);
		
	}
	
	public static void main(String[] args) {
		Recursividad rec = new Recursividad();
		
		int[] array = Arrays.copyOf( rec.getArray(10,20), 10);
		rec.showArray(array);
		int mayor = rec.getHigher(array , 0 ,0);
	
		System.out.println("Mayor" + mayor);
		
		System.out.println("Factorial " + rec.factorial(4));
	}
	
	

}
