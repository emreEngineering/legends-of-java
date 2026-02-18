package engine;

import java.util.Scanner;

public class ConsoleIO implements GameIO{
    private final Scanner scanner = new Scanner(System.in);

    @Override
    public String readLine() {
        return scanner.nextLine();
    }

    @Override
    public void printLine(String text) {
        System.out.println(text);
    }
}
