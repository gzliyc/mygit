package com;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		div(20);
	}
	
	public static void div(Integer num)
	{
		for(int i=1;i<=num;i++){
			if(i%3==0&&i%5==0){
				System.out.println("FizzBuzz");
			}else if(i%3==0){
				System.out.println("Fizz");
			}else if(i%5==0){
				System.out.println("Buzz");
			}else{
				System.out.println(i);
			}
			
		}
	}

}
