package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class Ex04 {

	public static void main(String[] args) throws IOException {
		
		Reader fr = new FileReader("C:\\javaStudy\\file\\PhoneDB.txt");
		BufferedReader br = new BufferedReader(fr);
		List pList = new ArrayList();
				
		
		while(true) {
			String str = br.readLine();
			
			if(str == null) {
				break;
			}
			
			String[] sArray = str.split(",");
			System.out.println("이름: " + sArray[0]);
			System.out.println("핸드폰: " + sArray[1]);
			System.out.println("회사: " + sArray[2]);
			System.out.println("");
		}
		
		br.close();

	}

}
