package lesson_5;

public class ArrayProcessor {

    public int calculateSum(String[][] array) throws MyArrayDataException, MyArraySizeException {
        if (array ==null){
            throw new MyArraySizeException("Массив не может быть равен нулю");
        }
        if (array.length != 4){
            throw new MyArraySizeException("Неверное количество строк. Размер должен быть равен 4");
        }
        for (int i=0; i< array.length; i++){
            if (array[i] == null || array[i].length != 4) {
                int cols = (array[i] == null) ? 0 : array[i].length;
                throw new MyArraySizeException("Неверное количество столбцов в строке " + i + ": ожидается 4, получено " + cols);
            }
        }
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Ошибка в ячейке [" + i + "][" + j + "]: значение '" + array[i][j] + "' не является целым числом.");
                }
            }
        }
        return sum;
    }
}