
// Ali Eren KÖSE 03/03/2024


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Main {
    public static void main(String[] args) {
        int sum = 0;
        FileReader file;
        file = null;

        System.out.println("sumFile.txt numbers is [15,26,78,91,44]");

        try {
            file = new FileReader("sumFile.txt");

            BufferedReader input = new BufferedReader(file);
            String line;

            while ((line = input.readLine()) != null) {
                sum += Integer.parseInt(line);
            }

            System.out.println("Numbers Sum Result = " + sum);

            input.close();
            file.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
