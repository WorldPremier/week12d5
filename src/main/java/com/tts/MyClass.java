package com.tts;

public class MyClass<I, D, S> {
    I ob1;
    D ob2;
    S ob3;
    //creating the constructor
    //since we don't know what are passing in to the T obj
    //we will set the constructor to MyClass(T ob)
    MyClass(I ob1, D ob2, S ob3 ){
        this.ob1 = ob1;
        this.ob2 = ob2;
        this.ob3 = ob3;
    }
    //we'll print out the actual variable type.
    void showType(){
        System.out.println(ob1.getClass().getName());
        System.out.println(ob2.getClass().getName());
        System.out.println(ob3.getClass().getName());
    }
}
