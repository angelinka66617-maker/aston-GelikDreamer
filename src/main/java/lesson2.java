public class lesson2 {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSig();
        printColor();
        compareNumbers();
        checkSumRange(1, 3);
        chekNumbers(-2);
        chekLost(-5);
        printCount("Привет, мир!", 5);
        chekYears(2028);
        changeMassive();


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

    public static void printColor() {
        int value = 100;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Жёлтый");
        } else if (value > 100) {
            System.out.println("Зелёный");
        }
    }


    public static void compareNumbers() {
        int a = 30;
        int b = 100;
        if (a >= b) {
            System.out.println("a>=b");
        } else {
                System.out.println("a<b");

            }
        }


    public static boolean checkSumRange(int a, int b) {
        int sum = a + b;
        boolean d;
        if (sum >= 10 && sum <= 20){
            d= true;
        } else {
            d = false;
        }
        System.out.println(d);
        return d;

    }

    public static void chekNumbers(int a) {
        if (a >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");

        }
    }


    public static boolean chekLost(int a) {
        boolean v;
        if (a<0) {
            v = true;
        } else {
            v= false;
        }
        System.out.println(v);
        return v;
    }


    public static void printCount(String str, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(str);
        }
    }


    public static boolean chekYears(int a) {
        boolean b;
        if (a % 400 == 0 && a % 100 != 0){
            b = true;
        }
         else if (a % 4 == 0) {
            b = true;
        }
         else
    {
        b = false;
    }
        System.out.print(b+"\n");
        return b;
    }


    public static void changeMassive() {
        int [] a =  {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        for (int i=0; i< a.length; i++){
            if (a[i] == 1) {
                a[i] = 0;
            } else if (a[i]==0){
                a[i]=1;
            }
            System.out.println(a[i]);
            }

        }




    }









