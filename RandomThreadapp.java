 import java.util.Random; 
class GeneratorThread extends Thread { 
@Override 
public void run() { 
Random random = new Random(); 
try { 
for (int i = 0; i< 5; i++) {  
int randomNumber = random.nextInt(100);  
System.out.println("Random Number Generated: " + randomNumber); 
if (randomNumber % 2 == 0) { 
new SquareThread(randomNumber).start(); 
} else { 
new CubeThread(randomNumber).start(); 
} 
Thread.sleep(1000); 
} 
} catch (InterruptedException e) { 
System.out.println("Generator thread interrupted."); 
} 
} 
} 
class SquareThread extends Thread { 
private int number; 
public SquareThread(int number) { 
this.number = number; 
} 
@Override 
public void run() { 
long square = (long) number * number; 
System.out.println("  Square Thread: " + square); 
} 
} 
13 
class CubeThread extends Thread { 
private int number; 
public CubeThread(int number) { 
this.number = number; 
} 
@Override 
public void run() { 
long cube = (long) number * number * number; 
System.out.println("  Cube Thread: " +cube);      
} 
} 
public class RandomThreadApp { 
public static void main(String[] args) { 
new GeneratorThread().start(); 
} 
} 
