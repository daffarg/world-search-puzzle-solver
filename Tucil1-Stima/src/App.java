import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String filename = scanner.nextLine();
        WordSearchPuzzle x = new WordSearchPuzzle(filename);
    }
}
