/**
 * Activity 2.5.7
 * 
 * A MediaLib class for the MediaLibrary program
 */
public class MediaLib
{
  private Book book;
  private Movie movie;
  private Song song;
  public static String owner = "Sebastian";
  private static int numEntries;

  public void addBook(Book b)
  {
    /*if (book.equals(null))
    {
    book = b;
    numEntries++;
    }*/
    //else
    {
      System.out.println("Sorry but there is already a book in this library");
    }
  }

  public void addMovie(Movie m)
  {
    /*if (movie.equals(null))
    {
    movie = m;
    numEntries++;
    }*/
    //else
    {
      System.out.println("Sorry but there is already a movie in this library");
    }    
  }

  public void addSong(Song s)
  {
    if (song.equals(null))
    {
      song = s;
      numEntries++;
    }
    /*else
    {
      System.out.println("Sorry but there is already a song in this library");
    }*/  
  }  

  public static String getOwner()
  {
    return owner;
  }

  public static void changeOwner(String o)
  {
    owner = o;
  }

  public static int getNumEntries()
  {
    return numEntries;
  }

  public boolean equals (Book b)
  {
    if (this.title.equals(b) && this.author.equals(b))
    {
      return true;
    }
    else
    {
        return false;
    }
  }

  /*public void addMovie (movie m)
  {
    movie = m;
  }*/
  public String toString() 
  {
    /*if(movie.equals(""))
    {
      String info = "";
      info += book;
      return info;      
    }
    else if(book.equals(null))
    {
      String info = "";
      info += movie;
      return info;
    }*/
    //else
    {
      String info = "";
      info += book;
      String info2 = "";
      info2 += movie;
      String info3 = "";
      info3 += song;
      return info + " & " + info2 + " & " + info3;
    }
  }
}