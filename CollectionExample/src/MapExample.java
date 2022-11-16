
import java.util.*;    
class Book {    
int id;    
String name,author,publisher;    
int quantity;    
public Book(int id, String name, String author, String publisher, int quantity) {    
    this.id = id;    
    this.name = name;    
    this.author = author;    
    this.publisher = publisher;    
    this.quantity = quantity;    
    
    
}

@Override
public String toString() {
	return "Book [id=" + id + ", name=" + name + ", author=" + author + ", publisher=" + publisher + ", quantity="
			+ quantity + "]";
}   


}    
public class MapExample {    
public static void main(String[] args) {    
    //Creating map of Books    
    Map<Integer,Book> map=new TreeMap<Integer,Book>();    
    //Creating Books    
    Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);    
    Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);    
    Book b3=new Book(103,"Operating System","Galvin","Wiley",6);    
    //Adding Books to map   
    map.put(1,b2);  
    map.put(1,b1);  
    map.put(1,b3); 
   // map.put(null, b3);
    //map.put(null, b3);
    
    
    System.out.println( map.size());
    
    
    System.out.println( map.get(1));
      
	/*
	 * //Traversing map for(Map.Entry<Integer, Book> entry:map.entrySet()){ int
	 * key=entry.getKey(); // System.out.println(key); Book b=entry.getValue();
	 * System.out.println(key+" Details:");
	 * System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.
	 * quantity); }
	 */  
}    
}    
