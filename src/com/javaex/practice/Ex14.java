/*
#월 입력
#switch-case

월을 입력받아 해당월의 일수를 출력하는프로그램을 작성하세요
*/
package com.javaex.practice;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		
		double income; //수익
		double tax; // 소득세
		String msg; // 출력 메세지
		
		Scanner sc = new Scanner(System.in);
		System.out.println("수익을 입력해 주세요");
		System.out.print("금익: ");
		income = sc.nextDouble();
		
		if(income < 0 ) {
			msg = "잘못 입력했습니다." ;
			
		}else if( income <= 1000 ) {
			tax = 0.09*income;
			msg = "소득세는 " + tax + " 입니다.";
			
		}else if( income <= 4000) {
			tax = 1000*0.09 + 0.18*(income-1000);
			msg = "소득세는 " + tax + " 입니다.";
			
		}else if( income < 8000) {
			tax = 1000*0.09 + 3000*0.18 + 0.27*(income-4000);
			msg = "소득세는 " + tax + " 입니다.";
			
		}else{
			tax = 1000*0.09 + 3000*0.18 + 4000*0.27 + 0.36*(income-8000);
			msg = "소득세는 " + tax + " 입니다.";
			
		}
		
		System.out.println(msg);
		
		sc.close();
	}
}
