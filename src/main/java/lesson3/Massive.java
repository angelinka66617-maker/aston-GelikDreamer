package lesson3;

import java.util.Arrays;

public class Massive {
    public void create(){
lesson3.Product[] productsArray = new lesson3.Product[5];
        productsArray[0] = new Product("Iphone", "25.08.2025", "China","USA", 250.15, true);
        productsArray[1] = new Product("Samsung", "25.08.2025", "China","Belarus", 250.15, false);
        productsArray[2] = new Product("Xiaomi", "25.08.2025", "China","Canada", 250.15, true);
        productsArray[3] = new Product("Iphone2", "25.08.2025", "China","USA", 250.15, false);
        productsArray[4] = new Product("Iphone3", "25.08.2025", "China","USA", 250.15, true);



        for ( int i=0; i<productsArray.length; i++){
            System.out.println(productsArray[i]);
        }
    }
}
