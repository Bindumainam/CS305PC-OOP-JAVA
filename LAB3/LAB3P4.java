import java.util.Scanner;
class LAB3P4{
	public static void main(String...args){
		Scanner s= new Scanner(System.in);
		int n = s.nextInt();
		String x=s.next();
		LAB3P4 l=new LAB3P4();
		l.show();
		l.show(10);
		l.show("String");
		l.show(10,"String");
	}
		public void show () {
			System.out.println("Constructor without params");
	}
		public void show (int x) {
			System.out.println("Constructor with int params:" + x);
	}
		public void show (String s) {
			System.out.println("Constructor with String params:" + s);
	}
		public void show (int x,String s) {
			System.out.println("Constructor with two params int and String:" + x +" " + s);
	}
}

