public class MediaLibRunnerStatic
{
  public static void main(String[] args)
  {
    System.out.println(MediaLib.getOwner() + "'s Library");
    MediaLib.changeOwner("PLTW");
    System.out.println(MediaLib.getOwner());
    MediaLib.owner = "Hubert";
    System.out.println(MediaLib.owner);
    MediaLib myLib = new MediaLib();
    
    //System.out.println(myLib);
    //System.out.println(myLib.getNumEntries());
    Book newBook = new Book("Final Fantasy", "Enix");
    Movie newMovie = new Movie("Ramuh", 1.35);
    Song newSong = new Song("Big Brother");
    myLib.addBook(newBook);
    myLib.addMovie(newMovie);
    myLib.addSong(newSong);
    System.out.println(myLib);



  }
}