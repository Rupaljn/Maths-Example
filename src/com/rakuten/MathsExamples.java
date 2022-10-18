package com.rakuten;

public class MathsExamples {
public  int maximumNum(int num1, int num2){
	int result = 0;
	if(num1>num2){
		result = num1;
	}
	else{
		result = num2;
	}
	
return result;
	}
public static void main(String[] args) {
MathsExamples me = new MathsExamples();
int numbers  =me.maximumNum(10, 50);
System.out.println(numbers);
}
}
