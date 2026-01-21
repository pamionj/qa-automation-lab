package utils;

public class EnvUtils {

    public static String getEnv(String key) {
        String value = System.getenv(key);

        if (value == null || value.isEmpty()) {
            throw new RuntimeException(
                    "La variable de entorno '" + key + "' no está definida"
            );
        }

        return value;
    }
}
