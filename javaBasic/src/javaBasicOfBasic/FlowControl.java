package javaBasicOfBasic;

public class FlowControl {

	public static void main(String[] args) {
		//if else statement, ternary operation can be used for simple statement
		int age = 12;
		
		if(age < 14)
			System.out.println("Enroll to elementary school");
		else if(age < 17)
			System.out.println("Enroll to middle school");
		else if(age < 20)
			System.out.print("Enroll to high school");
		else
			System.out.println("Go to college");
		
		//switch-case
		char grade = 'A';
		System.out.print("Your grade looks ");
		switch(grade) {
			case 'A': System.out.println("Exellent");
					  break;
			case 'B': System.out.println("Great");
				      break;
			case 'C': System.out.println("Not bad");
					  break;
			case 'F': System.out.println("Awful");
					  break;
			default: System.out.println("weird");
		}
			
		int month = 10;
		int day;
		
			switch(month) {
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				day = 31;
				break;
			case 2:
				day = 28;
			case 4: case 6: case 9: case 11:
				day = 30;
				break;
			default:
				day = 0;
			}
			System.out.println("This month has " + day + "days");
		
		//While
		int num = 1;
		int sum = 0;
		while(num <= 10){
			sum += num++;
		}
		System.out.println("Sum of 1~10: " + sum);
		
		//Do while, loop should run at least once
		num = 1;
		sum = 0;
		do {
			sum += num++;
		}while(num <=10);
		System.out.println("Sum of 1~10: " + sum);		
		
		//for
		for(int i = 2; i <= 9; i++) 
			for(int j = 1; j < 10; j++)
				System.out.println(i + " x " + j + " = " + i * j);
		
		//for&continue
		int total = 0;
		int num2;
		
		for(num2 = 1; num2 <= 10; num2++) {
			if(num % 2 == 0) continue;
			total += num;					//add only odd numbers
		}
		System.out.println("Add only odd numbers 1~10: " + total);
		
		//for&break
		int sum2 = 0;
		int num3 = 1;
		
		while(true) {
			sum2 += num3;
			
			if (sum2 > 100) {
				System.out.println("Sum is bigger than 100!");
				break;
			}
			num3++;
		}
		System.out.println("sum2 = " + sum2);
	}

}
