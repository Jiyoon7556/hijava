package com.sun.Greet;
/** package 아래에 /** 치면 알아서 잡히는 내용들
 * 첫번째 자바 실습  // 내용 적기
 * @author user   // author 치면 알아서 user명 잡힘
 * @update HelloJava class와 main 함수 method의 JVM 상의 동작 순서 
 */
public class HelloJava {

	public static void main(String[] args) {
		// HelloJava에게 say라는 명령을 내림!
		HelloJava.say("Hi~");

		System.out.println("Hello JAVA1!!");
//	ctrl+z/ JVM이 스스로 화면에 출력
//ctrl+shift+f : code 정리하기	
//		여러줄 주석 /* */
	}

	public static void say(String message) {
		System.out.println("Hello JAVA23!!");
		System.out.println(message);
	}
}
