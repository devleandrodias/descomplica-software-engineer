import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Informe o caminho absoluto do arquivo: ");
        String path = scanner.nextLine();

        try {
            FileReader file = new FileReader(path);
            BufferedReader reader = new BufferedReader(file);

            String line = reader.readLine();

            while(line != null) {
                System.out.printf("%s\n", line);
                line = reader.readLine();
            }

            file.close();
        } catch (IOException e) {
            System.out.println("Erro ao tentar abrir o arquivo: %s\n" + e.getMessage());
        }

        System.out.println();
    }
}