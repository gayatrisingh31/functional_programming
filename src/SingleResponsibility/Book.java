package SingleResponsibility;

import java.util.*;
public class Book {
     private int id;
   private String name;
   private String author;
    public int getId()
    {return this.id;}

    public String getName()
    {return this.name;}

    public String getAuthor()
    {return this.author;}

    public void setId(int id)
    {this.id=id;}

    public void setName(String name)
    {this.name=name;}

    public void setAuthor(String author)
    {this.author=author;}
   public Book(){
        setId(123);
        setName("Bhagavad Gita");
        setAuthor("Vyasa");
    }

    void showDetails(){

        System.out.println("The ID of the Book is "+getId());
        System.out.println("The Name of the Book is "+getName());
        System.out.println("The Author of the Book is "+getAuthor());
    }

}

