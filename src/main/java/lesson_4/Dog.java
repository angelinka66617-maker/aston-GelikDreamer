package lesson_4;

    class Dog extends Animal {
        public static int countDogs = 0;

        public Dog(int swimDistance, int runDistance, String name) {
            super(swimDistance, runDistance, name);
            countDogs++;
        }
}