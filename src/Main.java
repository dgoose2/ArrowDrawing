import java.util.Scanner;

public class Main {

    private static int NUM = 0;
    private static String CHARACTER = "";
    private static String SYMBOL = "";

    public static void main(String[] args) {
        scanner();
        topOfTree();
        stem();
    }

    public static void draw(String s, int size){
        for (int i = 1; i <= size; i++){
            System.out.print(s);
        }
    }

    public static void topOfTree(){
        for (int line = 1; line <= NUM; line++) {
            draw(" ", -1 * line + NUM * 2);
            draw(CHARACTER, 2 * line);
            System.out.println();
        }
    }

    public static void stem(){
        for (int line = 1; line < NUM; line++){
            draw(" ", NUM + (NUM - 1));
            draw(SYMBOL, 2);
            System.out.println();
        }
    }

    public static void scanner(){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter a number greater than 2.");
        int num = userInput.nextInt();
        NUM = num;
        System.out.println("Please enter a character.");
        String character = userInput.next();
        CHARACTER = character;
        System.out.println("Please enter a symbol.");
        String symbol = userInput.next();
        SYMBOL = symbol;
    }




}
