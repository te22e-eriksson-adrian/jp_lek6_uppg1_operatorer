import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner tangentbord = new Scanner(System.in);
        System.out.print("Skriv ett heltal: ");
        int tal1 = tangentbord.nextInt();
        tangentbord.nextLine();
        System.out.print("Skriv ett till heltal: ");
        int tal2 = tangentbord.nextInt();
        tangentbord.nextLine();
        System.out.println("Är tal1 och tal2 samma tal?: "+(tal1==tal2));
        tangentbord.close();
    }
}
