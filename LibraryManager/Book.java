package LibraryManager;

public class Book {
    public String name;
    public int id;
    public String title;
    public String author;

    public Book(int id, String title, String author, String name){
        this.id = id;
        this.title = title;
        this.author = author;
        this.name = name;
    }

    public void displayInfo(){
        System.out.println("Name: " 
        + name + ", ID: " + id + 
        ", Title: " + title + 
        ", Author: " + author);
    }
}
