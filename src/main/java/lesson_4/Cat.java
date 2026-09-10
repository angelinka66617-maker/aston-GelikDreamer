package lesson_4;

    public class Cat extends Animal {
        public static int countCats = 0;
        private boolean isFull;

        public Cat(int swimDistance, int runDistance, String name) {
            super(swimDistance, runDistance, name);
            this.isFull = false;
            countCats++;
        }

        public void eat(Bowl bowl,int n) {
                if (isFull == true){
                    System.out.println(name + " решил не есть. Он сыт");
                 } else {
                    if (bowl.getFood() -n <0) {
                        isFull = false;
                        System.out.println(name + " решил не есть. Мало еды");
                    } else {
                        bowl.decreaseFood(n);
                        isFull = true;
                        System.out.println(name + " покушал и сыт.");
                    }
                    }
        }
    }