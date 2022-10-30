package exercise;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;

// BEGIN
class App {
    public static List<Map<String, String>> findWhere(List<Map<String, String>> books, Map<String, String> where) {
        List<Map<String, String>> result = new ArrayList<>();
        // цикл по книгам в списке books
        for (Map<String, String> book : books) {
            if (isBookFit(book, where)) {
                result.add(book);
            }
        }
        return result;
    }

    private static boolean isBookFit(Map<String, String> book, Map<String, String> find) {
        // цикл по искомым параметрам
        for (Map.Entry<String, String> findItem : find.entrySet()) {
            // если у книги по искомому ключу не совпадают значения с поиском
            if (!book.get(findItem.getKey()).equals(findItem.getValue())) {
                return false;
            }
        }
        return true;
    }
}
//END
