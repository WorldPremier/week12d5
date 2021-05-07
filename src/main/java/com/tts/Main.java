package com.tts;

public class Main {
    public static void main(String[] args) {
        MyClassIntegers myClassIntegers = new MyClassIntegers();
        myClassIntegers.printStuff();
        MyClass<Integer, Double, String> obj1 = new MyClass(100, 99.9, "100");//passing types cannot be primitive(int), only Object(Integer)
//        MyClass<String> obj3 = new MyClass("100");

        obj1.showType();
//        obj2.showType();
//        obj3.showType();
    }
}
