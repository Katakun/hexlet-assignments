package exercise;

import java.util.stream.Collectors;
import java.util.Arrays;

// BEGIN
class App {
//    public static void main(String[] args) throws IOException {
//        Path configPath = Paths.get("src", "test", "resources", "fixtures", "s2.conf")
//                        .toAbsolutePath().normalize();
//        String configFromFile = Files.readString(configPath).trim();
//        getForwardedVariables(configFromFile);
//    }

    public static String getForwardedVariables(String config) {
        String[] configArr = config.split("\n");
        String result = Arrays.stream(configArr)
                .filter(s -> s.startsWith("environment"))
                .map(s -> s.substring(13, s.length() - 1))
                .map(s -> s.split(","))
                .flatMap(s -> Arrays.stream(s))
                .filter(s -> s.startsWith("X_FORWARDED_"))
                .map(s -> s.substring(12))
                .collect(Collectors.joining(","));
        return result;
    }
}
//END
