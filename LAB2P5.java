//write a program to check whether the number is prime or not//
import java.util.Scanner;
class LAB2P5{
	public static void main(String...args){
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		boolean p = true; 
		for (int i=2;i<=a/2;i++){   //a/2 is for less time complexity//
			if(a%2==0){
				p=false;
				break;	
			}
		}
		if(p){
			System.out.println("it is a prime");
		
		}
		else{
			System.out.println("not a prime");
		}
	}
}
