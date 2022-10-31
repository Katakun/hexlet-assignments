package exercise;

import java.util.List;

// BEGIN
class App {
    public static int getCountOfFreeEmails(List<String> emailsList) {
        int amount = 0;
        if (emailsList != null) {
            amount = (int) emailsList.stream()
                    .filter(mail -> !mail.endsWith("gmail.com"))
                    .filter(mail -> !mail.endsWith("yandex.ru"))
                    .filter(mail -> !mail.endsWith("hotmail.com"))
                    .count();
        }
        return emailsList.size() - amount;
    }
}
// END
