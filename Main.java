import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        URLShortener urlShortener = new URLShortener();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. Shorten URL");
            System.out.println("2. Expand URL");
            System.out.println("3. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            if (choice == 1) {
                System.out.println("Enter the long URL:");
                String longUrl = scanner.nextLine();
                String shortUrl = urlShortener.shortenURL(longUrl);
                System.out.println("Short URL: " + shortUrl);
            } else if (choice == 2) {
                System.out.println("Enter the short URL:");
                String shortUrl = scanner.nextLine();
                String longUrl = urlShortener.expandURL(shortUrl);
                System.out.println("Long URL: " + longUrl);
            } else {
                break;
            }
        }
        scanner.close();
    }
}
