
import java.util.ArrayList;

import java.util.Scanner;


/**
 * Created by dosia on 09.01.2018.
 */
public class  booklist {


    ///////////some strange magic

        public static ArrayList bookshelf = new ArrayList<book>();
        public static Scanner scanner = new Scanner(System.in);

    static void addbooks(){

            System.out.print("enter author name: ");
            book.authorName = scanner.nextLine();
            bookshelf.add(book.authorName);
            System.out.print("enter book name: ");
            book.bookName = scanner.nextLine();
            bookshelf.add(book.bookName);
            listbooks();
            System.out.println("DONE! ");

    }
    public static void listbooks(){

        System.out.println(bookshelf);

    }

    public static void edit(){

        System.out.println(bookshelf);
        System.out.println("if you want to edit something, choose id");
        System.out.println("if not, type 'back' ");


    }

    public static void del(){

        System.out.println(bookshelf);
        System.out.println("choose id for remove ");
        //id = scanner.nextInt();
        //bookshelf.remove(id);
        System.out.println("Done! ");




    }

}
