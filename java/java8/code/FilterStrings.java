package java8.code;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FilterStrings {
	public static void main(String[] args) {
		Logger logger=LogManager.getLogger(FilterStrings.class);
		logger.debug("Welcome to Java Prorgram to calculate average of numbers");
		logger.debug("enter length of the array?"); 
		Scanner scnr = new Scanner(System.in);
		int length = scnr.nextInt();
		List<String> l=new ArrayList<String>();
		logger.debug("Please enter strihgs "); 
		for (int i = 0; i <= length; i++) { 
			String s=scnr.nextLine();
			l.add(s); 
			}
		List<String> ans=new ArrayList<String>();
		ans.addAll(search(l));
		
		logger.debug(ans.toString());
		scnr.close();
		}
	public static List<String> search(List<String> list) {
		return list.stream()
				  .filter(s -> s.startsWith("a"))
				  .filter(s -> s.length() == 3)
				  .collect(Collectors.toList());
	}
	}

