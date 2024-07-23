import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Recipe {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(new BufferedReader(new FileReader("recipe.txt")))) {
            while (scanner.hasNextLine()) {
                System.out.println(scanner);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

}
