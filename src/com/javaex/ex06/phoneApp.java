package com.javaex.ex06;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class phoneApp {

	public static void main(String[] args) throws IOException {
		
		Scanner sc= new Scanner(System.in);
		
		Reader fr = new FileReader("C:\\javaStudy\\file\\PhoneDB_1.txt");
		BufferedReader br = new BufferedReader(fr);
		
		List<Person> pList = new ArrayList<Person>();
		
		//리스트에 넣기
		while(true) { 
			String line = br.readLine();
			
			if(line == null) {
				break;
			}
			
			String[] pArray = line.split(",");
			String name = pArray[0];
			String hp = pArray[1];
			String company = pArray[2];
			
			Person p = new Person(name, hp, company);
			pList.add(p);
			
		}
		
		//값입력받은후 -> 리스트에저장
		System.out.println("정보를 입력하세요(,로 구분)");
		String newline = sc.nextLine();
		
		String[] pArray = newline.split(",");
		String name = pArray[0];
		String hp = pArray[1];
		String company = pArray[2];
		
		Person p01 = new Person(name, hp, company);
		pList.add(p01);
		
		Writer fw = new FileWriter("C:\\javaStudy\\file\\PhoneDB_1.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		//리스트에 있는 값을 모두 텍스트에 write한다
		for(Person p : pList) {
			
			String str = p.getName() + "," + p.getHp() + "," + p.getCompany() + "\n";
			bw.write(str);
		}
		
		for(Person p : pList) {
			System.out.println("이름: " + p.getName());
			System.out.println("핸드폰: " + p.getHp());
			System.out.println("회사: " + p.getCompany());
			System.out.println("");
		}
		
		br.close();
		bw.close();
		sc.close();
		
	}
		
		

}
