import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            File file = new File("teste.txt");

            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("Arquivo já existe");
                System.out.println(file.getName());
                System.out.println(file.getAbsolutePath());
                System.out.println(file.canWrite());
                System.out.println(file.canRead());
                System.out.println(file.length());
            }
        } catch (IOException e) {
            System.out.println("Ops deu erro!");
            e.printStackTrace();
        }
    }
}
