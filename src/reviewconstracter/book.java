package reviewconstracter;

public class book {

	String Author;

	String Title;

	String Type;

	double Price;

	public book(String Author) {
		this.Author = Author;

	}

	public book(String Author, String Title) {
		this.Author = Author;
		this.Title = Title;

	}

	public book(String Author, String Title, String Type) {
		this.Author = Author;
		this.Title = Title;
		this.Type = Type;

	}

	public book(String Author, String Title, String Type, double Price) {
		this.Author = Author;
		this.Title = Title;
		this.Type = Type;
		this.Price = Price;
	}

	public void setBookInformation(String Author, String Title, String Type, double Price) {

	}

	public book() {
		System.out.println("no arg constructor ");
	}

}
