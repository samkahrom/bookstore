package bookstore.domain;

public class Book {

	
	public long Id;
	public String Title;
	public String Author;
	public int Year;
	public String ISBN;
	public double Price;
	public Book(long id, String title, String author, int year, String iSBN, double price) {
		super();
		Id = id;
		Title = title;
		Author = author;
		Year = year;
		ISBN = iSBN;
		Price = price;
	}
	
	public Book() {
		
		
		
	}

	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public String getAuthor() {
		return Author;
	}

	public void setAuthor(String author) {
		Author = author;
	}

	public int getYear() {
		return Year;
	}

	public void setYear(int year) {
		Year = year;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public double getPrice() {
		return Price;
	}

	public void setPrice(double price) {
		Price = price;
	}
	
	
}
