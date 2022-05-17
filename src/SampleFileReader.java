import java.io.File;
import java.util.Scanner;

public class SampleFileReader {
    public static void main(String[] args) throws Exception{
        //TODO Replace file path
        File myFile = new File("/Users/vrbethi/Documents/personal-git/bdpa/week-nine/ECommerceInventoryModule/src/books-inventory.txt");
        Scanner scanner = new Scanner(myFile);
        while(scanner.hasNextLine()) {
            String line  = scanner.nextLine();
            System.out.println(line);
        }
        scanner.close();
    }
}
