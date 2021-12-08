package com.javaex.ex01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex01 {

	public static void main(String[] args) throws Exception{
		//원래는 예외처리해줘야함(공부차원에서 위같이 처리함)
		InputStream in = new FileInputStream("C:\\javaStudy\\file\\img.jpg");
		OutputStream out = new FileOutputStream("C:\\javaStudy\\file\\byteimg1.jpg");
		
		byte[] buff = new byte[1024]; //쟁반(속도를 높히기위한..)
		
		System.out.println("복사시작");
		while(true) {
			
			int data = in.read(buff);
			
			if(data == -1) {
				System.out.println("복사가 완료되었습니다." + data);
				break;
			}
			
			out.write(buff);
		}
		
		
		/*
		System.out.println("복사시작");
		while(true) {
			int data = in.read(); //input
			System.out.println(data);
			
			if(data == -1) { //전송이 끝나면 read() 메소드에서 -1을 보낸다
				System.out.println("복사가 완료되었습니다.");
				break;
			}
			
			out.write(data); //output
		}
		*/
		
		in.close();
		out.close();
		
		

	}

}
