/*
#월 입력
#switch-case

월을 입력받아 해당월의 일수를 출력하는프로그램을 작성하세요
*/
package com.javaex.practice;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		
		int min; //작은수
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 3개를 입력해주세요");
		System.out.print("숫자1: ");
		int num01 = sc.nextInt();
		
		System.out.print("숫자2: ");
		int num02 = sc.nextInt();
		
		System.out.print("숫자3: ");
		int num03 = sc.nextInt();
		
		min = num01;
		if(min > num02) {
			min = num02;
		}
		if(min > num03) {
			min = num03;
		}
		 
		System.out.println("가장 작은수는 " +  min + " 입니다." );
	
		sc.close();

	}
}
