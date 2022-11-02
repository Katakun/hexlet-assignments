package exercise;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// BEGIN
class App {
    public static String[][] enlargeArrayImage(String[][] image) {
        int row = image.length * 2;
        int col = image[0].length * 2;
        String[][] result = new String[row][col];

        String[] arrStr = Arrays.stream(image)
                .flatMap(i -> Arrays.stream(i))
                .toArray(String[]::new);



        String[] arr2x = Arrays.stream(arrStr)
                .map(i -> i + "-" + i)
                .map(i -> i.split("-"))
                .flatMap(i -> Arrays.stream(i))
                .toArray(String[]::new);


        int count = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                result[i][j] = arr2x[count];
//                System.out.println("row: " + i + ", col: " + j + ", count: " + count);
                count++;
                // если счетчик на последней колонке и ряд нечетный
                if (count % col == 0 && i % 2 != 1) {
                    // отнимаем от счетчика один ряд
                    count -= col;
                }
            }
        }

//        for (String[] line : result) {
//            for (String ch: line) {
//                System.out.print(ch + " ");
//            }
//            System.out.println();
//        }



        return result;
    }

    public static void main(String[] args) {
        String[][] image = {
                {"*", "*", "*", "*"},
                {"*", " ", " ", "*"},
                {"*", " ", " ", "*"},
                {"*", "*", "*", "*"},
        };
        enlargeArrayImage(image);
        System.out.println(Arrays.deepToString(enlargeArrayImage(image)));
    }
}

// END
