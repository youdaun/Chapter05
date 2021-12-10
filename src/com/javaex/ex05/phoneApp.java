package com.javaex.ex05;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.LinkedList;
import java.util.List;

public class phoneApp {

	public static void main(String[] args) throws IOException {
		
		Reader fr = new FileReader("C:\\javaStudy\\file\\PhoneDB.txt");
		BufferedReader br = new BufferedReader(fr);
		List<Person> pList = new LinkedList<Person>();

		while(true) {
			String line = br.readLine();

			if(line == null) {
				break;
			}
			
			String[] dataArray = line.split(",");
			
			String name = dataArray[0];
			String hp = dataArray[1];
			String company = dataArray[2];
			
			Person p02 = new Person(name, hp, company);
			pList.add(p02);
			
		}
		
		
		for(Person p : pList) {
			System.out.println("이름: " + p.getName());
			System.out.println("핸드폰: " + p.getHp());
			System.out.println("회사: " + p.getCompany());
			System.out.println("");
		}
		
		br.close();
	}

}
