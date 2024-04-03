
// Ali Eren KÖSE 03/03/2024


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Main {
    public static void main(String[] args) {
        //değerleri tanımla ve belirle
        int sum = 0;
        FileReader file;
        file = null;

        // dosya içeriğini yazdır
        System.out.println("sumFile.txt numbers is [15,26,78,91,44]");


        //dosyayı oku -> line değerinde endeksle -> ve değerleri topla
        try {
            file = new FileReader("sumFile.txt");

            BufferedReader input = new BufferedReader(file);
            String line;

            while ((line = input.readLine()) != null) {
                sum += Integer.parseInt(line);
            }

            System.out.println("Numbers Sum Result = " + sum);

            // kullanılan methodları kapat
            input.close();
            file.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
