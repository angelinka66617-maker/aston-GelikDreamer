package lesson_4;

class Animal {
    protected String name;
    protected int runDistance;
    protected int swimDistance;
    public static int countAnimals = 0;

    public Animal(int swimDistance, int runDistance, String name) {
        this.swimDistance = swimDistance;
        this.runDistance = runDistance;
        this.name = name;
        countAnimals++;
    }

    public void run( int distance) {
        if (distance <= runDistance) {
            System.out.println(name + "пробежал" + distance + "м");
        } else {
            System.out.println(name + " не пробежал" + distance + "м");
        }
    }

    public void swim( int distance) {
        if (distance <=swimDistance) {
            System.out.println(name + "проплыл" + distance + "м");
        } else if (distance ==0) {
            System.out.println(name + "не умеет плавать");
        } else {
            System.out.println(name + "не проплыл" + distance + "м");
        }
    }
}
