
public class Books {
	public static void main(String[] args) {
		Book book = new Book();
		Book.Biography bio = book.new Biography();
		bio.print();
	}
}
class Book {
	// Nested inner class
  String type = "Nonfiction";
	class Biography {
  String type = "Biography";
  
   public Biography(){
    print();
   }
  
   public void print(){
    System.out.println(type);
    System.out.println(Book.this.type);
   }
	}
}

