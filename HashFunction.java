import java.util.Random;

public class HashFunction {
    private static final String CHARACTERS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    private static final int LENGTH = 6;
    private Random random;

    public HashFunction() {
        random = new Random();
    }

    public String generateHash(String input) {
        StringBuilder hash = new StringBuilder();
        for (int i = 0; i < LENGTH; i++) {
            hash.append(CHARACTERS.charAt(random.nextInt(CHARACTERS.length())));
        }
        return hash.toString();
    }
}
