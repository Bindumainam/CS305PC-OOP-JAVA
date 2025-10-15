import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Lab5P1{

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try{
            int x =s.nextInt();
            int y =s.nextInt();
            System.out.println(x/y);
        }catch(InputMismatchException ie){
            System.out.println(ie.getClass().getName());
        }catch(ArithmeticException ae){
            System.out.println(ae.getClass().getName()+": "+ae.getMessage());
        }  
    }
}
