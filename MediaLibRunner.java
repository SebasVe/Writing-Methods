/*
 * Activity 2.5.7
 * 
 * The runner for the MediaLibrary program
 */
public class MediaLibRunner
{
  public static void main(String[] args)
  {
    System.out.println("Welcome to your Media Library");
    MediaLib myLib = new MediaLib();
    Book myBook = new Book("The Lord of the Rings", "Tolkien");
    System.out.println("Book created " + myBook);
    myLib.addBook(myBook);
    System.out.println("Library:\n" + myLib + "\n");
    int myRating = 5;
    myBook.adjustRating(myRating);
    System.out.println(myBook);
    myBook.setTitle("Magic School Bus");
    System.out.println("Book: " + myBook);
    System.out.println("Library: " + myLib);

    /*
    * Activity 2.5.7
    */
    System.out.println("You have a NEW Library");
    MediaLib myLib2 = new MediaLib();

    Book newBook = new Book("To Kill a Mockingbird", "Lee");
    myLib2.addBook(newBook);
    System.out.println(myLib2);
    newBook = new Book("1984", "Orwell");
    System.out.println(myLib2);
    Book book3 = new Book("Harry Potter", "Rowling");
    System.out.println(newBook.equals(book3));
    Movie newMovie = new Movie("Ramuh", 1.35);
    myLib2.addMovie(newMovie);
    System.out.println(myLib2);
  }
}