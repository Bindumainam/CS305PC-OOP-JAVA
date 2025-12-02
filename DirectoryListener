import java.io.File; 
public class DirectoryLister { 
public static void main(String[] args) { 
// Specify the directory path here 
File rootDir = new File("/path/to/your/directory");  
if (!rootDir.exists() || !rootDir.isDirectory()) { 
System.out.println("Invalid directory path."); 
return; 
} 
System.out.println("Listing files in: " + rootDir.getAbsolutePath()); 
listAllFiles(rootDir); 
} 
public static void listAllFiles(File dir) { 
File[] files = dir.listFiles(); 
if (files != null) { 
for (File file : files) { 
if (file.isDirectory()) { 
System.out.println("Directory: " + file.getAbsolutePath()); 
// Recursive call for subdirectories 
listAllFiles(file); 
} else { 
System.out.println("File: " + file.getAbsolutePath()); 
} 
} 
} 
} 
} 
