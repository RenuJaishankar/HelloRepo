package HelloWorld;


public class HelloWorld {

    public static void main(String[] args) {
        MyClass myclass = new MyClass();
        Cat garfield = new Cat();
        String myString = new String();
        Dog Rover = new Dog();
        Fruit NewFruit = new Fruit();
         int z= myclass.addNum(5,3);
         System.out.println(z);
        int x = 5;
        String otherNum = "Five";
        String  str= "600";
        //String myString = "Hello";
        System.out.println(myString);
        System.out.println(garfield.doPurr());
        System.out.println(Rover.bark());
        System.out.println(NewFruit.FruitName());

    }
}
