public class lesson2 {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSig();
    }

    public static void printThreeWords() {
        System.out.print("Orange\n");
        System.out.print("Banana\n");
        System.out.print("Apple\n");

    }

    public static void checkSumSig() {
        int a = -20;
        int b = 8;
        int c = a + b;
        if (c >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");

        }


    }
}