package com.javacodegeeks.patterns.abstractfactorypattern;

public class TestAbstractFactoryPattern {

	public static void main(String[] args) {
		
		//khoi tao AbstractParseFactory
		//switch-case ParserFactoryProducer
		//va truyen vao NYFactory de khoi tao NYParserFactory
		AbstractParserFactory parserFactory = ParserFactoryProducer.getFactory("NYFactory");
		
		 //khoi tao XMLParser
		//switch-case AbstractParserFactory
		//va truyen vao NYORDER de khoi tao NYOrderXMLParser
		XMLParser parser = parserFactory.getParserInstance("NYORDER");
		
		//goi den phuong thuc parse() cua NYOrderXMLParser
		String msg="";
		msg = parser.parse();
		System.out.println(msg);
		
		System.out.println("************************************");
		
		//tuong tu
		parserFactory = ParserFactoryProducer.getFactory("TWFactory");
		parser = parserFactory.getParserInstance("TWFEEDBACK");
		msg = parser.parse();
		System.out.println(msg);
	}

}
