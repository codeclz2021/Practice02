package com.javaex.practice;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		int age;
		
		//나이를 입력받는다.
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력해주세요");
		System.out.print("나이: ");
		age = sc.nextInt();
		
		//그룹 분류후 결과를 출력한다.
		if( 19 <= age && age < 65 ) { //19살 이상 65살 미만이면
			System.out.println("1번그룹 입니다.");
		}else { // 그이외의 나이이면
			System.out.println("2번그룹 입니다.");
		}
		
		sc.close();

	}

	

	
	
	
}
