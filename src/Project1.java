import java.util.Scanner;

public class Project1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] history = new String[10];
        int historyCount = 0;
        String lastSnippet = null;

        while (true) {
            System.out.print("jshell> ");
            String input = scanner.nextLine();

            if (input.equals("/exit")) {
                System.out.println("Goodbye.");
                break;
            } else if (input.equals("/help")) {
                System.out.println("Type a Java language expression, statement, or declaration.");
                System.out.println("Or type one of the following commands:");
                System.out.println("/list: list the source you have typed.");
                System.out.println("/exit: exit the jshell tool");
                System.out.println("/history: history of what you have typed.");
                System.out.println("/!: rerun last snippet.");
            } else if (input.equals("/history")) {
                for (int i = 0; i < historyCount; i++) {
                    System.out.println(history[i]);
                }
            } else if (input.equals("/list")) {
                int number = 1;

                for (int i = 0; i < historyCount; i++) {
                    if (history[i].indexOf("/") != 0) {
                        System.out.println(number + " : " + history[i]);
                        number++;
                    }
                }
            } else if (input.equals("/!")) {
                if (lastSnippet != null) {
                    System.out.println("Re-running '" + lastSnippet + "'.");
                }
            } else if (input.indexOf("/") == 0) {
                System.out.println("Invalid command: " + input);
                System.out.println("Type /help for help.");
            } else {
                System.out.println("Running '" + input + "'.");
                lastSnippet = input;
            }

            history[historyCount] = input;
            historyCount++;

            if (historyCount == history.length) {
                System.out.println("The history buffer is cleared.");
                history = new String[10];
                historyCount = 0;
            }
        }
    }
}