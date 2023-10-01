package DragAndDrop;

import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args) {
        new MyFrame();















        // generics = enable types (classes and interfaces) to be parameters when defining: classes, interfaces and methods
        // a benefit is to eliminate the need to create multiple versions of methods or  classes for various data types.

        // Use 1 version for all reference data types

        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {5.5, 4.4, 3.3, 2.2, 1.1};
        Character[] charArray = {'H', '1', 'r'};
        String[] stringArray = {"B", "Y", "Yoo"};

        displayArray(intArray);
        displayArray(doubleArray);
        displayArray(charArray);
        displayArray(stringArray);



















        // Generic Classes 

        ArrayList <Integer> myGuy = new ArrayList<>();


        //MyIntegerClass myInt = new MyIntegerClass(2);
        //MyDoubleClass myDouble = new MyDoubleClass(3.14);
        //  MyCharacterClass myChar = new MyCharacterClass('@');
        //MyStringClass myString = new MyStringClass("Hello");

        MyGenericClass<Integer> myInt = new MyGenericClass<>(1);
        MyGenericClass<Double> myDouble = new MyGenericClass<>(1.0);
        MyGenericClass<Character> myChar = new MyGenericClass<>('e');
        MyGenericClass<String> myString = new MyGenericClass<>("Helllo");

        System.out.println(myDouble.getValue());
    }

    public static <Thing> void displayArray(Thing[] array){

        for(Thing x: array) {
            System.out.println(x+" ");
        }
        System.out.println();


    }

    public static <Thing> Thing getFirst(Thing[] array) {
        return array[0];

    }



}
