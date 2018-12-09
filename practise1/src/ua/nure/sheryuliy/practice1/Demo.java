package ua.nure.sheryuliy.practice1;
import java.util.Scanner;

public class Demo {
	public static void main(String []args) {
		Task1 aa = new Task1();
		aa.hello();
		
		Task2 bb = new Task2();
		Scanner in = new Scanner(System.in);
	    System.out.print("Введите первое число: ");
	    int a = in.nextInt();
	    System.out.print("Введите второе число: ");
	    int b = in.nextInt();
	    System.out.println("Сумма чисел = " + bb.summa(a,b));
	}
}
