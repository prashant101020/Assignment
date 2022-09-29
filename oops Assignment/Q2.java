import java.util.*;
class Book{
    int Bookid;
    String Title;
    String Author;
    int price;
}

public class Q2 {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    Book book=new Book();

    System.out.println("Enter BookID");
    // System.out.println(AnimalAge);
    int id=sc.nextInt();
    book.Bookid=id;
    System.out.println("Enter Title");
        String title=sc.next();
        book.Title=title;
    System.out.println("Enter Author");
    String author=sc.next();
    book.Author=author;
    System.out.println("Enter price");
    int price=sc.nextInt();
    book.price=price;
    System.out.println("Book Id ==> "+book.Bookid);
    System.out.println("Title ==> "+book.Title);
    System.out.println("Author ==> "+book.Author);
    System.out.println("price ==> "+book.price);
    sc.close();
    }
}
