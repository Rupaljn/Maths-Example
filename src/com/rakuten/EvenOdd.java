package com.rakuten;

public class EvenOdd {
public static boolean evenNum(int num1){
	boolean flag  = false;
	if(num1%2==0){
		flag = true;
	}
	return flag;
}
public static void main(String[] args) {
boolean numbers = EvenOdd.evenNum(50);
System.out.println(numbers);
}
}
