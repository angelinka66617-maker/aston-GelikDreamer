package lesson3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Product product= new Product("Iphone", "25.08.2025", "China",
                "USA", 250.15, true);
        product.print();

       Park park1= new Park("Солнышко");
       Park.Attraktsiony attraktsion =park1.new Attraktsiony("Молот", "ПН-ВС с 09:00 до 21:00", 15.2);
       park1.printPark();
       attraktsion.print();

        Product[] productsArray = new Product[5];
        productsArray[0] = new Product("Iphone", "25.08.2025", "China","USA", 250.77, true);
        productsArray[1] = new Product("Samsung", "28.07.2025", "China","Belarus", 44.73, false);
        productsArray[2] = new Product("Xiaomi", "28.02.2025", "China","Canada", 25550.85, true);
        productsArray[3] = new Product("Iphone2", "25.08.2025", "China","USA", 2558.15, false);
        productsArray[4] = new Product("Iphone3", "23.01.2025", "China","USA", 20.45, true);

        for ( int i=0; i<productsArray.length; i++){
            System.out.println(productsArray[i]);
        }
    }
}