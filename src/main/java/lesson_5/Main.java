package lesson_5;

public class Main {
    public static void main(String[] args) {
        ArrayProcessor processor= new ArrayProcessor();
        System.out.println("===Запуск тестов ====\n");

        // тест 1: корректный массив
        String[][] validArray = {
                {"1","2","3","4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        try {
            int result =processor.calculateSum(validArray);
            System.out.println("Тест 1 (OK): Результат суммы = " + result + "\n");
        } catch (MyArraySizeException e) {
            System.err.println("Тест 1 (Ошибка размера): " + e.getMessage() + "\n");
        } catch (MyArrayDataException e) {
            System.err.println("Тест 1 (Ошибка данных): " + e.getMessage() + "\n");
        }
    // тест 2: неверный размер
        String[][] sizeArray = {
                {"6","2","3","1"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"}
        };

        try {
            processor.calculateSum(sizeArray);
        } catch (MyArraySizeException e) {
            System.err.println("Тест 2 (Ошибка размера): " + e.getMessage() + "\n");
        } catch (MyArrayDataException e) {
            System.err.println("Тест 2 (Ошибка данных): " + e.getMessage() + "\n");
        }
        // тест 3: неверные данные
        String[][] dataArray = {
                {"1","2","3","4"},
                {"5", "6", "7", "8"},
                {"9", "10", "aa", "12"},
                {"13", "14", "15", "16"}
        };

        try{
            processor.calculateSum(dataArray);
        } catch (MyArraySizeException e) {
            System.err.println("Тест 3 (Ошибка размера): " + e.getMessage() + "\n");
        } catch (MyArrayDataException e) {
            System.err.println("Тест 3 (Ошибка данных): " + e.getMessage() + "\n");
        }
        // тест 4: ArrayIndexOutOfBoundsException
        int[] numbers = {10,20,30};
        try {
            int value = numbers[5];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Тест 4 (ArrayIndexOutOfBounds): " + e.getMessage() + "\n");
        }
    }
}