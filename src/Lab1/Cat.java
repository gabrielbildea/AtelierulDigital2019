package Lab1;

public class Cat extends Animal {
    static void classMethod() {System.out.println("static method in Cat"); }
    void instanceMethod() {System.out.println("instance method in Cat"); }
    public static void main(String[] args) {
        Cat mycat = new Cat();
        Animal myanimal = mycat;
        myanimal.instanceMethod();
        Animal.classMethod();
    }
}
