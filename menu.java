import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class menu {

    String title = "";
    String method = "";

    public menu(String title, String method){
        this.title = title;
        this.method = method;

    }



    public static void main(String[] args) {
        new ArrayList<String>();
        menu IntByReference = new menu("IntByReference", "test");
        menu Matrix = new menu("Matrix", "test2");
        Scanner PG = new Scanner(System.in);
        System.out.println("What program to run?");
        int program = parseInt(PG.nextLine());
        String tester = "";
        try {
            program = parseInt(String.valueOf(program));
            if (program == 0){
                return;
            }
            try{

                Matrix.main(args);

            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }

}
