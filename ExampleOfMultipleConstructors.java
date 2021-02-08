/// package gitposting;

class Book
{
	public String bookName;
	public String author;
	public Book()
	{
		System.out.println("Enter Book-name and author's name");
	}
	public Book(String bookName)
	{
		this.bookName = bookName;
		System.out.println("Enter author's name");
	}
	public Book(String bookName,String author)
	{
		this.bookName = bookName;
		this.author = author;
		System.out.println("You entered all details");
	}
}

public class ExampleOfMultipleConstructors {
	public static void main(String[] args)
	{
		Book b1 = new Book();
		Book b2 = new Book("Lilaboti");
		Book b3 = new Book("Godfather","Mario Puzo");
	}

}
