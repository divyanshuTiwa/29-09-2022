package com.collection.demo.bll;
import java.util.LinkedList;
import java.util.Arrays;
import java.util.LinkedList;


public class Collection001 {

	public static void main(String[] args) {
		LinkedList<String> languages =new LinkedList<String>();
		//add elements to linkedlist
		languages .add("C");
		languages .add("C++");
		languages .add("Java");
		languages .add("Kotlin");
		languages .add("Python");
		languages .add("Perl");
		languages .add("Ruby");
		
		System.out.println("Display all elements");
        System.out.println("Languages : "+languages);
				
				
			/*	for(String language :lang01) {
					System.out.println(language);
				}
			*/	
				//Remove index 5
        		languages.remove(5);
				System.out.println("***************************");
				System.out.println("Display all languages after remove index 5");
				for(String language :languages)
					System.out.println(language);
				
				//Remove from kotlin element
				languages.remove("Kotlin");
				System.out.println("********************************");
				System.out.println("Display all elemens after remove kotlin element :");
				for(String language :languages)
					System.out.println(language);

				//Remove all the scripting languages (Python, Ruby, Perl)
				LinkedList<String> scripting_languages = new LinkedList<> (Arrays.asList("Python","Rubi","Perl"));
			
				languages.removeAll(scripting_languages);
				
				System.out.println("******************************");
				System.out.println("Display all elemens after remove all "
								+ "the scripting languages (Python, Ruby, Perl) :");
				for(String language :languages)
					System.out.println(language);
				
				//Remove all the elements from the list
				languages.removeAll(languages);
				System.out.println("*********************************");
				System.out.println("List after remove all elements :");
				for(String language :languages)
					System.out.println(language);
				
			}
}
