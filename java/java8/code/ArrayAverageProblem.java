package java8.code;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ArrayAverageProblem {
	
	public static void main(String[] args) {
		//System.setProperty("log4j.configurationFile","./path_to_the_log4j2_config_file/log4j2.xml");

		Logger logger=LogManager.getLogger(ArrayAverageProblem.class);
		logger.debug("Welcome to Java Prorgram to calculate average of numbers");
		logger.debug("enter length of the array?"); 
		Scanner scnr = new Scanner(System.in);
		int length = scnr.nextInt();
		List<Integer> l=new ArrayList<Integer>();
		
		logger.debug("Please enter numbers "); 
		for (int i = 0; i < length; i++) { 
			l.add(scnr.nextInt()); 
			}
		Double average=average(l);
		logger.debug("Average of all numbers in array is {}" ,average ); 
		scnr.close(); }
	public static Double average(List<Integer> list) {
		return list.stream()
				  .mapToInt(i -> i)
				  .average()
				  .getAsDouble();
		}
	}

