
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.RunnableFuture;

public class main2 {
    String title;
    Runnable action;

    public main2(String title, Runnable action) {
        this.title = title;
        this.action = action;
    }

    public String getTitle() {
        return this.title;
    }

    public Runnable getAction() {
        return this.action;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<Integer, main2> main2 = new HashMap<>();

        main2.put(1, new main2("Matrix", () -> Matrix.main(null)));
        main2.put(2, new main2("IntByReference", () -> IntByReference.main(null)));

        System.out.println("main2:");
        for (Map.Entry<Integer, main2> pair : main2.entrySet()) {
            System.out.println(pair.getKey() + " ==> " + pair.getValue().getTitle());
        }
        Boolean temp = true;
        while (temp = true) {
            try {
                int input = sc.nextInt();
                main2 m = main2.get(input);
                m.getAction().run();
            } catch (Exception e) {
                System.out.println("Exiting...");
                return;
            }
        }
    }

}



