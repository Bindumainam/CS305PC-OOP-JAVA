import java.util.LinkedList; 
public class DoublyLinkedListDemo { 
public static void main(String[] args) { 
LinkedList<Integer> list = new LinkedList<>(); 
System.out.println("‐‐‐ i. Create (Insertion using add/addLast) ‐‐‐"); 
list.add(10);  
list.addLast(20); 
list.addFirst(5); 
list.add(2, 15); 
System.out.println(list); 
System.out.println("\n‐‐‐ ii. Delete a given element (Removal) ‐‐‐"); 
int elementToDelete = 20; 
booleanwasRemoved = list.remove(Integer.valueOf(elementToDelete));  
if(wasRemoved) { 
System.out.println("Deleted element: " + elementToDelete); 
} else { 
System.out.println("Element " + elementToDelete + " not found."); 
} 
System.out.println(list); 
list.removeFirst(); 
System.out.println("Deleted head element."); 
System.out.println("\n‐‐‐ iii. Display after Deletion ‐‐‐"); 
System.out.println(list); 
System.out.println("\n‐‐‐ Deleting non‐existent element ‐‐‐"); 
list.remove(Integer.valueOf(100)); 
System.out.println("Element 100 was not found for deletion."); 
System.out.println(list); 
} 
} 
