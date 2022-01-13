package classes.base64;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Base64App {
    public static void main(String[] args) {
        String text = "Rifqi Muhammad Aziz";

        // Encode text to base64
        String encoded = Base64.getEncoder().encodeToString(text.getBytes());
        System.out.println(encoded);

        // Decode base64 to text
        byte[] decoded = Base64.getDecoder().decode(encoded);
        String result = new String(decoded); // convert byte[] to string
        System.out.println(result);
    }
}
