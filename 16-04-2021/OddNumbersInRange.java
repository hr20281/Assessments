import java.util.Scanner;

public class OddNumbersInRange {
	public static void OddNumbersInRange(int startrange,int endrange){
		for(startrange = 1; startrange <= endrange; startrange++){
			if(startrange % 2!= 0)
				System.out.print(startrange + " ");
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the start-range : ");
		int startrange = scan.nextInt();
		System.out.println("enter the end-range : ");
		int endrange = scan.nextInt();
		OddNumbersInRange(startrange,endrange);

	}

}
