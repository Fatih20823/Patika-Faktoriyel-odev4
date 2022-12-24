package com.main;

import java.math.BigInteger;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Eleman Sayisi Giriniz: ");
		int n = scan.nextInt();
		System.out.println("Kombinasyon Sayisi: ");
		int r = scan.nextInt();
		
		BigInteger total = new BigInteger("1");
		BigInteger total2 = new BigInteger("1");
		BigInteger total3 = new BigInteger("1");
		BigInteger result = new BigInteger("1");
		for (int i = 1; i <= n; i++) {
			 total = total.multiply(BigInteger.valueOf(i)); 		   
		}		   

		for (int j = 1; j <= r; j++) {
			
			 total2 = total2.multiply(BigInteger.valueOf(j));			
		}
		
		for (int k = 1; k <= n-r; k++) {
		
			 total3 = total3.multiply(BigInteger.valueOf(k));
		}

		result =total.divide(total2.multiply(total3));
		
		
		System.out.println(result);
		scan.close();
	}

}
