package com.rakuten;

public class NumberReverses {
public static void main(String[] args) {
	int num = 921783;
	int result = 0;
	while(num!=0){
		int reminder = num%10;
		result = result*10+ reminder;
		num = num/10;
	}
	System.out.println(result);
}
}
