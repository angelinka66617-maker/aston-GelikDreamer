package lesson_4;

public class Main {
    public static void main(String[] args) {
        Dog bobik = new Dog(5, 150, "Бобик");
        bobik.run(150);
        bobik.swim(5);
        Bowl bowl = new Bowl(10);
        Cat[] cats = new Cat[3];
        cats[0] = new Cat(2, 200, "Кузя");
        cats[1] = new Cat(0, 200, "Мурзик");
        cats[2] =new Cat(0, 200, "Пушок");
        cats[1].swim(5);
        cats[0].run(300);
        for (Cat cat: cats) {
            cat.eat(bowl,5);
        }
        bowl.addFood(7);
        bowl.addFood(-100);
        System.out.println(bowl.getFood());
        for (Cat cat: cats) {
            cat.eat(bowl,5);
        }
        System.out.println("Всего животных:" + Animal.countAnimals);
        System.out.println("Всего котов:" + Cat.countCats);
        System.out.println("Всего собак:" + Dog.countDogs);


        Shape circle = new Circle(5.0, "Yellow", "Black");
        Shape rectangle;
        rectangle = new Rectangle(5.0, 4.0, "Blue", "Green");
        Shape triangle = new Triangle(3.0, "White", "Red", 5.0, 4.0);
        circle.printInfo("Круг");
        rectangle.printInfo("Прямоугольник");
        triangle.printInfo("Треугольник");
    }
    }
