import java.util.Scanner;

public  class library {
    public static void main(String[] args) {


        int add = 1;
        int edit = 2;
        int delete = 3;
        int list = 4;
        int exit = 5;


        //something like a console menu, lol
        System.out.println("Welcome to simple library. PLS choose number");
        System.out.println("1. Add book;");
        System.out.println("2. Edit book;");
        System.out.println("3. Delete book;");
        System.out.println("4. List all;");
        System.out.println("5. Exit?..;");


        //
        String[][]
                bookshelf = new String[10][3];


        bookshelf[0][0] = "1";
        bookshelf[0][1] = "Howard Lovecraft";
        bookshelf[0][2] = "Azathoth";


        Scanner scanner = new Scanner(System.in);
        int number;
        try {
            number = scanner.nextInt();

            if (add == 1) {
                System.out.println("saddsadfsdsaf");
            }else {

            }

        } catch (Throwable t) {
            System.out.println("PLS CHOOSE NUMBER (int), not WORD (String)");
        }

        if (list == 4) {

            System.out.print(bookshelf);
        } else {

        }





        //


    }}////////fin//////////





