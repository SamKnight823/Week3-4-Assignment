package assignmentWeek3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArraysAndMethods {
static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		int l = ages.length - 1;
		double sum = 0;
		
		System.out.println(ages[l] - ages[0]);
		List<Integer> intList = new ArrayList<Integer>(ages.length + 1);
		for (int i : ages)
		{
		    intList.add(i);
		}
		intList.add(99);
		ages = convertArrayListToArray(intList);
		int x = ages.length - 1;    		
		System.out.println(ages[x] - ages[0]);
		for (int num : ages) {
			sum += num;
		}
		System.out.println(sum / ages.length);
		
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		double total = 0;
		for (String name : names) {
			total += name.length();		
		}
		System.out.println(total / names.length);
		for (String i : names) {
			System.out.print(i + " ");
		}
		
		//Q3 - array.lenth - 1
		//Q4 - array[0]
		System.out.println();
		int[] nameLengths = new int[names.length];
		int sum1 = 0;
		for (int num = 0; num < names.length; num++) {
			nameLengths[num] = names[num].length();
			sum1 += nameLengths[num];
		}
		System.out.println(sum1);
		System.out.println(returnStringNTimes("go", 7));
		System.out.println(returnFullName("Garden", "Eden"));
		int [] practice = {3,4,55,66,44,33,77};
		System.out.println(checkIfAbove100(practice));
		int [] practices = {3,4,5,7};
		System.out.println(checkIfAbove100(practices));
		double[] newArray = {77.9, 99.2, 44.3, 22.4};
		System.out.println(returnAverage(newArray));
		double[] newArray2 = {77.9, 99.2, 44.3, 22.4, 88.8};
		System.out.println(isFirstArrayBigger(newArray,newArray2));
		System.out.println(willBuyDrink(false,11.56));
		System.out.println(willBuyDrink(true,11.56));
		isItSpring();	
}
	
	
public static void isItSpring() {
	System.out.println("Is the weather sunny or cloudy today?");
	String weather = s.next();
	if (weather.equalsIgnoreCase("sunny")|| weather.equalsIgnoreCase("cloudy")) {
		System.out.println("Is today February 2?");
		String date = s.next();
		if (date.equalsIgnoreCase("yes") || date.equalsIgnoreCase("no")) {
			if (date.equalsIgnoreCase("yes") && weather.equalsIgnoreCase("sunny")) {
				System.out.println("Boo the groundhog will see his shadow. 6 more weeks of winter!");
			} else if (date.equalsIgnoreCase("yes") && weather.equalsIgnoreCase("cloudy")) {
				System.out.println("Yay the groundhog won't see his shadow. Spring is coming!");
			} else {
				System.out.println("I guess it is too early to know.");
			}
		}else {
			System.out.println("Please enter yes or no.");
			isItSpring();
		}
	}else {
		System.out.println("Please enter sunny or cloudy.");
		isItSpring();
	}//method was created to practice Scanner and equality techniques
}

	
	
public static String returnStringNTimes(String word, int n)
{
	String newWord = "";
	for (int i = 0; i < n; i ++) {
		newWord += word;
		}
	return newWord;
}

public static String returnFullName(String firstName, String lastName) {
	return firstName + " " + lastName;
}

public static boolean checkIfAbove100(int[] array) {
	int total = 0;
	for (int i : array) {
		total += i;
	}
	if (total > 100) {
		return true;
	} else {
		return false;
	}
}

public static double returnAverage(double[] array) {
	double sum = 0;
	for (double i : array) {
		sum += i;
	}
	return sum / array.length;
}
public static int[] convertArrayListToArray(List<Integer> integers)
{
    int[] array = new int[integers.size()];
    for (int i=0; i < array.length; i++)
    {
        array[i] = integers.get(i).intValue();
    }
    return array;
}

public static boolean isFirstArrayBigger(double[] array1, double[] array2) {
	double sum1 = 0;
	double sum2 = 0;
	double length = array1.length;
	double length2 = array2.length;
	for (double i : array1) {
		sum1 += i;
	}
	for (double x : array2) {
		sum2 += x;
	}
	if ((sum1/length) > (sum2/length2)) {
		return true;
	} else {
		return false;
	}
}

public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
	if (isHotOutside && moneyInPocket > 10.50) {
		return true;
	} else {
		return false;
	}
}

public static boolean willGroundhogSeeShadow(String weather, int date) {
	if (weather.equals("sunny") && date == 02022023) {
		return true;
	} else {
		return false;
	}
}

}