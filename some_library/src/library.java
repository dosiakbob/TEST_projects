
import java.util.InputMismatchException;
import java.util.Scanner;


public  class library {

public static   void main(String[] args) {



/////Start here
    System.out.println("welcome to some_library.  PLS choose number ");

try {
    mainMenu();

}

//if something wrong
catch (InputMismatchException inp){
        System.out.println("PLS SET ONLY NUMBER, because next time program will be closed!!!!!!!!!!!");
    mainMenu();
    }

}

    private static   String mainMenu (){

//something like a console menu, lol
        System.out.println("1. Add book;");
        System.out.println("2. Edit book;");
        System.out.println("3. Delete book;");
        System.out.println("4. List all;");
        System.out.println("5. Exit?..;");


        Scanner scanner = new Scanner(System.in);
        int number;
        number = scanner.nextInt();

        ////choose your number

        if (number == 1) {

            booklist.addbooks();
            return mainMenu();
            }

        if (number == 2) {
            booklist.edit();
            return mainMenu();
            }

        if (number == 3) {
            booklist.del();

            }
        if (number == 4) {
            booklist.listbooks();
            return mainMenu();
            }

        if (number == 5) {
            System.exit(0);
            } else {

                System.out.println("must been chosen between 1-5");
                return mainMenu();
            }


        return null;
    }}////////fin//////////





