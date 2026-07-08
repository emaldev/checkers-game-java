package LibraryManager;
import java.util.ArrayList;

public class Library {
    public static void main(String[] args){
        ArrayList<Book> mArrayList = new ArrayList<>();
        mArrayList.add(new Book(1234, "Java core", "Emal Hasanzada", "Java-Book1"));
        mArrayList.add(new Book(1235, "C++ array", "Milad Azimi", "C++-Book-ST"));
    }
   
}
