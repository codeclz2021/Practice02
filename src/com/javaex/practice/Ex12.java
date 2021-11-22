/*
#월 입력
#switch-case

월을 입력받아 해당월의 일수를 출력하는프로그램을 작성하세요
*/
package com.javaex.practice;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		
		String mark; //기호
		double num01; //숫자1
		double num02; //숫자2
		double result;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("출력되는 내용을 입력하세요");
		System.out.print("기호: ");
		mark = sc.nextLine();
		
		System.out.print("숫자1: ");
		num01 = sc.nextDouble();
		
		System.out.print("숫자2: ");
		num02 = sc.nextDouble();
		
		switch(mark) {
			case "+":
				result = num01 + num02;
				System.out.println( "결과는: " +  result );
				break;
			case "-":
				result = num01 - num02;
				System.out.println( "결과는: " +  result );
				break;
			case "*":
				result = num01 * num02;
				System.out.println( "결과는: " +  result );
				break;
			case "/":
				if(num02==0) {
					System.out.println( "계산할 수 없습니다." );
				}else {
					result = num01 / num02;
					System.out.println( "결과는: " +  result );
				}
				break;
			default:
				System.out.println("계산할 수 없는 기호입니다.");
				break;
		}
		
		sc.close();

	}
}
