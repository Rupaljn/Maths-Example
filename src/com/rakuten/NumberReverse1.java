package com.rakuten;

public class NumberReverse1 {
public static void main(String[] args) {
	int num = 2345678;
	int result = 0;
	while(num!=0){
		int remiander = num%10;
		result = result*10+remiander;
		num = num/10;
		
		
	}
	
	System.out.println(result);
}
}
