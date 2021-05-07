package com.tts;

public class MyClassIntegers extends MyClassString{
    Integer i;

    MyClassIntegers(String i) {
        super(i);
    }

    public MyClassIntegers() {
        super("Hello Franky");
    }

    void myClassIntegers(Integer i){
        this.i = i;
    }

    void printStuff(){

       System.out.println(i);
       printMessage();

    }
}
