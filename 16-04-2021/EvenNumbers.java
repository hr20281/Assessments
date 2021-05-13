import java.util.Scanner;

public class EvenNumbers {
	public static void evenOrOdd(int num){
		if(num % 2 == 0){
			System.out.println("it is a even number ");
		}
		else 
			System.out.println("it is a odd number ");
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number : ");
		int num = scan.nextInt();
		evenOrOdd(num);
	}
}
