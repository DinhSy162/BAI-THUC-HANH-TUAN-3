import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Nhap ten: ");
            String name = scanner.nextLine();
            
            System.out.println("Hello " + name);
        }
    }
}
// nhac music