import java.io.RandomAccessFile; 
import java.io.IOException; 
public class RandomAccessFileDemo { 
private static final String FILE_NAME = "raf_data.txt"; 
public static void main(String[] args) { 
try (RandomAccessFileraf = new RandomAccessFile(FILE_NAME, "rw")) { 
System.out.println("‐‐‐ Initial Write ‐‐‐"); 
raf.writeUTF("Hello World"); raf.writeInt(100);  
raf.writeDouble(3.14159);                 
long intPosition = raf.getFilePointer() ‐ 8 ‐ 4;            
System.out.println("File pointer is at: " + raf.getFilePointer()); 
// ‐‐‐ Read Operation ‐‐‐ 
System.out.println("\n‐‐‐ Sequential Read ‐‐‐"); 
// Go back to the beginning 
System.out.println("Read String: " + raf.readUTF()); 
System.out.println("Read Int: " + raf.readInt()); 
System.out.println("Read Double: " + raf.readDouble());             
// ‐‐‐ Random Read Operation ‐‐‐ 
System.out.println("\n‐‐‐ Random Access Read (Reading Int 100) ‐‐
"); 
raf.seek(intPosition);  
// Seek to the position of the integer 
int readInt = raf.readInt(); 
System.out.println("Read Int at " + intPosition + ": " + readInt); 
// ‐‐‐ Write Operation (Update) ‐‐‐ 
System.out.println("\n‐‐‐ Random Access Write (Updating Int) ‐‐‐"); 
raf.seek(intPosition);  
raf.writeInt(999);  
// Overwrite 100 with 999 
raf.seek(0);  
System.out.println("Int updated to 999 at " + intPosition);             
// ‐‐‐ Verify Update ‐‐‐ 
System.out.println("\n‐‐‐ Verification ‐‐‐"); 
raf.seek(intPosition); 
System.out.println("Verified Int: " + raf.readInt()); 
} catch (IOException e) { 
e.printStackTrace(); 
} 
} 
} 
