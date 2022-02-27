package com.javacodegeeks.patterns.factorymethodpattern;

public abstract class DisplayService {
	
	protected abstract XMLParser getParser();
	
	public void display(){ //hien thi
		//khởi tạo XMLParser có tên là parser
		//gán giá trị cho nó bằng 1 trong 4 cái: feedback, error,...
		//gán bằng cách gọi hàm getParser()
		XMLParser parser = getParser(); 
		String msg = parser.parse();
		System.out.println(msg);
	}
}
