import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Informe o numero de linhas do arquivo: ");
        int numberOfLines = scanner.nextInt();

        FileWriter file = new FileWriter("teste.txt");
        PrintWriter writer = new PrintWriter(file);

        for(int i = 1; i <= numberOfLines; i++) {
            writer.printf("Esta é a linha de número " + i + "%n");
        }

        file.close();
        System.out.printf("Arquivo escrito com sucesso!");
    }
}