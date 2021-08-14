package OopsAssignment;

import java.util.Scanner;

class Book
{
private String title;
private String author;
private float price;
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}


}
class ImpBook extends Book
{
	private String category;

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
}

public class BookDetails {

	public static void main(String[] args) {
		Book book = new Book();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the title : ");
		String title = sc.nextLine();
		System.out.println("Enter name of the Author : ");
		String author = sc.nextLine();
		System.out.println("Enter the Price : ");
		float price = sc.nextInt();
		
		ImpBook b = new ImpBook();
		b.setAuthor(author);
		b.setCategory("Magic");
		b.setPrice(1200);
		b.setTitle(title);
		System.out.println("Book Details are :");
		System.out.println("\n");
		
		System.out.println("Author Name :"+b.getAuthor());
		System.out.println("Book Psrice :"+b.getPrice());
		System.out.println("Book Name :"+b.getTitle());
		System.out.println("Book Category :"+ b.getCategory());

	}

}
