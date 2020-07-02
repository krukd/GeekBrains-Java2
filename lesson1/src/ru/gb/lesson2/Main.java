package ru.gb.lesson2;

//1. Есть строка вида: "10 3 1 2\n2 3 2 2\n5 6 7 1\n300 3 1 0"; (другими словами матрица 4x4)
//
//10 3 1 2
//2 3 2 2
//5 6 7 1
//300 3 1 0
//
//Написать метод, на вход которого подаётся такая строка, метод должен преобразовать строку в двумерный массив типа String[][];
//2. Преобразовать все элементы массива в числа типа int, просуммировать, поделить полученную сумму на 2, и вернуть результат;
//3. Ваши методы должны бросить исключения в случаях:
//Если размер матрицы, полученной из строки, не равен 4x4;
//Если в одной из ячеек полученной матрицы не число; (например символ или слово)
//4. В методе main необходимо вызвать полученные методы, обработать возможные исключения и вывести результат расчета.
public class Main {

    public static void main(String[] args) {
        String s = "10 3 1 2\n2 3 2 2\n5 6 7 1\n300 3 1 0";

        String[][] stringArray = convertStringToArray(s);
        System.out.println(calculate(stringArray));
    }

    static String[][] convertStringToArray(String s) {
        String a = s + "\n";
        for (int i = 0, space = 0, n = 0; i < a.length(); i++) {
            if (a.charAt(i) == ' ') space++;
            if (a.charAt(i) == '\n') {
                if (space == 3) space = 0;
                else throw new MyException("размер матрицы не равен 4x4");
            }
        }

        int length = s.split("\n").length;
        String[][] result = new String[length][length];
        String[] removeN = s.split("\n");

        for (int i = 0; i < length; i++) {
            String[] clearSpaces = removeN[i].split(" ");
            for (int j = 0; j < length; j++) {
                result[i][j] = clearSpaces[j];
            }
        }

        return result;
    }

    static double calculate(String[][] s) {
        int sum = 0;

        for (String[] s1 : s) {
            for (String s2 : s1) {
                try {
                    sum += Integer.parseInt(s2);
                } catch (NumberFormatException e) {
                    System.out.println("в одной из ячеек полученной матрицы не число");
                    e.printStackTrace();
                    System.exit(1);
                }
            }
        }

        return sum / 2;
    }
}
