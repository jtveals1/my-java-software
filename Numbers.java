package lab;

import java.io.*;
import java.util.*;
/**
 * Numbers.java
 * @author jtveals
 * 10/15/16
 */
public class Numbers {
/**
 * main
 * @param args
 * @throws IOException
 * @throws FileNotFoundException
 */
	public static void main(String[] args) throws IOException,FileNotFoundException {
		
		int sum = 0;
		double average = 0;
		int lowest = 0;
		int highest = 0;
		
		ArrayList<Integer> numberList = new ArrayList<Integer>();
	
		readFile(numberList);
		sum = addNumbers(numberList);
		average = getAverage(numberList,sum);
		lowest  = getLowest(numberList);
		highest = getHighest(numberList);
		printFile(sum,average,lowest,highest);
		
	}
	/**
	 * readFile
	 * @param numberList
	 * @throws FileNotFoundException
	 * reads the file and stores the numbers in an arrayList
	 */
	private static void readFile(ArrayList<Integer> numberList) throws FileNotFoundException{
		
		File file = new File("D:/csc151/CSC151/Resources/numbers.txt");
		Scanner scanner = new Scanner(file);
		String input = "";
		
		while (scanner.hasNext()) {
			input = scanner.nextLine();
		    numberList.add(Integer.parseInt(input));
		}
		
		scanner.close();
	}
	/**
	 * addNumbers
	 * @param numberList
	 * @return sum
	 * adds the numbers in the arrayList and returns the sum
	 */
	private static int addNumbers(ArrayList<Integer> numberList) {
	
		int sum = 0;
		
		for (int i = 0; i < numberList.size(); i++) {
			sum += numberList.get(i);
		}
		
	    return sum;
	}
	/**
	 * getAverage
	 * @param numberList
	 * @param sum
	 * @return average
	 * divides the sum by the number of elements in the arrayList and returns the average
	 */
	private static double getAverage(ArrayList<Integer> numberList, int sum) {
		//cast as double to include fractional part of the real number
		return (double)sum / numberList.size();
	}
	/**
	 * getLowest
	 * @param numberList
	 * @return lowest
	 * gets the lowest number in the arrayList and returns that value
	 */
	private static int getLowest(ArrayList<Integer> numberList) {
	
		int lowest = numberList.get(0);	
		
		for (int i = 1; i < numberList.size(); i++) {
			if (lowest > numberList.get(i)) {
				lowest = numberList.get(i);
			}
		}
		
		return lowest;
	}
	/**
	 * getHighest
	 * @param numberList
	 * @return highest
	 * gets the highest number in the arrayList and returns that value
	 */
	private static int getHighest(ArrayList<Integer> numberList) {
		int highest = numberList.get(0);
		
		for (int i = 1; i < numberList.size(); i++) {
			if (highest < numberList.get(i)) {
				highest = numberList.get(i);
			}
		}
		
		return highest;
	}
	/**
	 * printFile
	 * @param sum
	 * @param average
	 * @param lowest
	 * @param highest
	 * @throws IOException
	 * creates a file and prints the results to that file
	 */
	private static void printFile(int sum, double average, int lowest, int highest) 
			throws IOException {
		
		FileWriter writer = new FileWriter("D:/csc151/CSC151/Resources/results.txt"); 
		PrintWriter printWriter = new PrintWriter(writer);
		
		printWriter.println("The Sum is " + sum);
		printWriter.println(String.format("The average is %.2f",average));
		printWriter.println("The lowest is " + lowest);
		printWriter.println("The highest is " + highest);
		writer.close();
		printWriter.close();
	}
}
