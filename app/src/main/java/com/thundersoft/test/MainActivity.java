package com.thundersoft.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


    public Dog dog = new Dog();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        System.out.println(dog.i);


    }
}

class Dog{
    public int i = 0;

    static Dog dog = new Dog();

    Dog(){
        System.out.println("11111");
    }

    public int getNum(){
        System.out.println("22222");
        return i;
    }
}