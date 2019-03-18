package Lab1;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");
        Book b = new Book(5);
        System.out.println("Price is: " + b.getPrice());
        //displayMethods(b);
        Cat myCat = new Cat();
        Animal myAnimal = myCat;
        myAnimal.instanceMethod();
        Animal.classMethod();
    }

    public static void displayMethods(Book b) {
        Class c = b.getClass();
        Method[] allMethods = c.getMethods();
        for(Method m:allMethods) {
            System.out.println(m);
        }
    }
}
