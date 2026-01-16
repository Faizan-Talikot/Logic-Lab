package Day4;

class Library{
	private  String title, author;
	private  boolean issued;
	public static int totalBooks=0;
	Library(String title, String author){
		this.title = title;
		this.author = author;
		totalBooks++;
		this.issued = false;
	}
	public boolean isIssued() {
		return issued;
	}
	public void issue() {
		if(!isIssued()) {
			System.out.println("Success: '" + title + "' has been issued.");
			issued = true;
		}
		else {
			System.out.println("Error: '" + title + "' is already issued.");
		}
	}
	public void returnBook() {
		if(isIssued()) {
			issued = false;
			System.out.println("Success: '" + title + "' has been returned.");
		}
		else {
			System.out.println("Error: '" + title + "' was not issued.");
		}
	}
}

public class Q11_LibraryBooksManagement {

	public static void main(String[] args) {
		Library b = new Library("1984", "Orwell");
		b.issue();
		b.issue();
		b.returnBook();

	}

}
