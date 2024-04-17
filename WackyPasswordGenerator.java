import java.util.Random;

public class WackyPasswordGenerator {
    public static void main(String[] args) {
        String password = generateWackyPassword(12); // Generate a 12-character password. Feel free to adjust the length or character set to make it even wackier! 🎉
        System.out.println("Your wacky password: " + password);
    }

    public static String generateWackyPassword(int length) {
        String validChars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%^&*()_+-/.,<>?;':\"[]{}\\|`~";
        Random random = new Random();

        StringBuilder passwordBuilder = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(validChars.length());
            char randomChar = validChars.charAt(randomIndex);
            passwordBuilder.append(randomChar);
        }

        return passwordBuilder.toString();
    }
}
