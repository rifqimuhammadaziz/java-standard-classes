package classes.uuid;

import java.util.UUID;

/**
 * UUID (Universally Unique Identifier)
 * Auto generate random unique ID (example: for primaryKey)
 */

public class UUIDApp {
    public static void main(String[] args) {
        for (var i = 0; i < 100; i++) {
            UUID uuid = UUID.randomUUID(); // get UUID
            String key = uuid.toString(); // convert to string

            System.out.println(key);
        }
    }
}
