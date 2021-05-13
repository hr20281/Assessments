import java.util.Scanner;

public class Multiplication {
	public static String isMultiplication(int num,int range){
		String res = "";
		for(int i = 1; i <= range ; i++){
			res+= num + " " + "*" +" "+ i + " "+ " = " + " " +num* i +  "\n" ;
		}
		return res;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number : ");
		int num = scan.nextInt();
		System.out.println("enter the range : ");
		int range = scan.nextInt();
		System.out.println(isMultiplication(num,range));
	}

}
