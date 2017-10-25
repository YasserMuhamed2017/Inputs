		package Java;
		import java.util.Scanner;
		
		public class Inputs {
		 static Scanner scanner= new Scanner(System.in);
		 static Scanner reader = new Scanner(System.in);
		public static void main(String[] args) {
		
			
			boolean isTrue = true;
			String name = "654";
		int age = 654;
		double salary = 5.20;
		//convert to string
		String newSalary =String.valueOf(salary);
		String newAge = String.valueOf(age);
		String bool = String.valueOf(isTrue);
		//convert to integer
		int newRate = Integer.parseInt(name);
		System.out.println((int) salary);
		//convert to double
		double x= Double.parseDouble(name);
		System.out.println(x);
		double y = (double) salary;
		System.out.println(y);
		
		
		}
	
	}
