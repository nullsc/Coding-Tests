//
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class ex {
	public static void main(String[] args) {
	compareDec();

	}

// 1
	public static void isPos(){
		Scanner getint = new Scanner(System.in);
		System.out.println("Please enter number: ");
		int num = getint.nextInt();
		//getint.close();

		if (num == 0){
			System.out.println(num + " is zero");
		} else if (num > 0){
			System.out.println(num + " is positive");
		} else if (num < 0){
			System.out.println(num + " is negative");
		}

	}
//2
	public static void isSame(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 3 numbers");

		String nums = scan.nextLine();
		String[] nums1 = nums.split(" ");
		System.out.println(nums1[0]);
		scan.close();
	
		if (nums1.length != 3)
			return;

		if(nums1[0].equals(nums1[1]) && nums1[1].equals(nums1[2])){
			System.out.println("All numbers are the same!");
		} else {
			System.out.println("The numbers are different");
		}
	}


//4
	public static void compareDec(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 2 decimal numbers");

		String nums = scan.nextLine();
		String[] nums1 = nums.split(" ");
		scan.close();
	
		if (nums1.length != 2){
			System.out.println("Error: Enter 2 decimal numbers");
			return;
		}

		double first = Math.round(Double.parseDouble(nums1[0]) * 100.0) / 100.0; //convert string to double and roubd to 2dp
		double second = Math.round(Double.parseDouble(nums1[1]) * 100.0) / 100.0;

		System.out.println(first);
		if(first == second){
			System.out.println("Numbers are the same!");
		} else {
			System.out.println("Numbers are different");
		}

	}


}
