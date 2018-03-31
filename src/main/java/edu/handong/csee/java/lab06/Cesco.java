package edu.handong.csee.java.lab06;//package name
import java.util.Scanner;// Scanner import


/** this class defines Cesco object.
 * this Cesco class has GROWTH_RATE, ONE_BUG_VOLUME,houseVolume,startPopulation,countWeeks,population,totalBugVolume,newBugs,newBugVolume members.
 * this Cesco class has main methods.
 * 
 * @author 21500509_LEE SU HYUN
 * 
 */


public class Cesco {//class name
	
	static double GROWTH_RATE = 0.95;//static variable of double type 
	static double ONE_BUG_VOLUME = 0.002;//static variable of double type 
	
	public static void main(String[] args) {//main method
	
		Cesco myCesco = new Cesco();// produce Cesco instance and reference variable of Cesco type refer to instance
		
		Scanner input = new Scanner(System.in);// produce Scanner to receive input value
	
		System.out.println("Enter the total volume of your house in cubic feet");//print out
		double houseVolume = input.nextDouble();// receive the value of double type variable
		System.out.println("Enter the estimated number of roaches in your house");//print out
		double startPopulation = input.nextDouble();//receive the value of double type variable
		double population = startPopulation;//the value of population equals to startPopulaton
		System.out.println("Starting with a roach population of" + startPopulation+"\n");//print out
		double totalBugVolume = population * ONE_BUG_VOLUME;//the value of totalBugVolume equals to population * ONE_BUG_VOLUME
		int countWeeks = 0;//the value of countWeeks is zero 
		
	}

	}
