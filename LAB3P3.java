import java.util.Scanner;
class LAB3P3{
	public static void main(String...args){
		LAB3P3 l=new LAB3P3();
		l.show();
		l.show(10);
		l.show("String");
		l.show(10,"String");
	}
		public void show () {
			System.out.println("method without params");
	}
		public void show (int x) {
			System.out.println("method with int params:" + x);
	}
		public void show (String s) {
			System.out.println("method with String params:" + s);
	}
		public void show (int x,String s) {
			System.out.println("method with two params int and String:" + x +" " + s);
	}
}
