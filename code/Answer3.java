import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Answer3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Search occurrences of a word in a file.");
        System.out.print("Enter word: ");
        String word = scanner.nextLine();
        System.out.print("Enter file name: ");
        String fileName = scanner.nextLine();

        int count = 0;
        File file = new File(fileName);

        try (var br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String wrd : words) {
                    if (wrd.equals(word)) {
                        count++;
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.printf("Occurrences of word '%s' is: %d\n", word, count);
        scanner.close();
    }
}

