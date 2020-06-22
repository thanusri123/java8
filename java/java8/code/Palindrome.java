package java8.code;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Palindrome {
	public static void main(String[] args) {
		Logger logger=LogManager.getLogger(Palindrome.class);
		logger.debug("enter length of the array?"); 
		Scanner scnr = new Scanner(System.in);
		int length = scnr.nextInt();
		List<String> l=new ArrayList<String>();
		logger.debug("Please enter strings "); 
		for (int i = 0; i <= length; i++) { 
			String s=scnr.nextLine();
			l.add(s); 
			}
		List<String> ans=new ArrayList<String>();
		ans.addAll(checkPalindrome(l));
		Stream.of(ans).forEach(s->logger.debug(s));
		scnr.close();
		
		
	}
	static List<String> checkPalindrome(List<String> list){
        return list.stream()
        		.filter(s->new StringBuffer(s).compareTo((new StringBuffer(s).reverse()))==0)
        		.collect(Collectors.toList());
        	
        
    }
}
