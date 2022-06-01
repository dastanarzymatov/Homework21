import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter(" alfavit ");

            for (char i = 'A'; i <= 'Z'; i++) {

                for (char j = 'a'; j <= 'z'; j++) {
                    if ((j - i) == 32) {
                        fileWriter.append(i + "  " + j + "\n");
                    }

                }

            }
            for (char k = '0'; k <= '9'; k++) {
                fileWriter.append(k + "\n");
            }
            fileWriter.close();

        } catch (IOException e) {
            e.printStackTrace();


        }
        try {
            FileReader fileReader = new FileReader(" alfavit ");
            Scanner scanner = new Scanner(fileReader);
            int count=1;
            while (scanner.hasNextLine()) {
                System.out.println(count+") "+scanner.nextLine());
                count++;

            }
        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}