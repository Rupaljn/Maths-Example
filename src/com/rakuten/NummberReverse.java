package com.rakuten;

public class NummberReverse {
public static void main(String[] args) {
	int num = 523456; 
	int reverse = 0;
	while(num!=0){
		 int reminder = num%10;
		 reverse = reverse*10+reminder;
		 num = num/10;
	}
	System.out.println(reverse);
}
}
