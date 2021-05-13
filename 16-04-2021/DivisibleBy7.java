import java.util.Scanner;

public class DivisibleBy7 {
	public static boolean isDivisibleBy7(int num){
		if(num < 0){
			return isDivisibleBy7(-num);
		}
		if(num == 0 || num == 7)
			return true;
		if(num < 10)
			return false;
		return isDivisibleBy7(num / 10 - 2 * (num - num / 10 * 10));
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number : ");
		int num = scan.nextInt();
		isDivisibleBy7(num);
		if(isDivisibleBy7(num))
			System.out.println("is divisible by 7");
		else
			System.out.println("is not divisible by 7");
	}
}