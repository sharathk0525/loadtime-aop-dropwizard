package com.test.manager;

/**
 * Created by smallam on 10/5/2018.
 */
public class DivisionManager {

    int num1;
    int num2;
    public DivisionManager(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }


    public void performOperation()   {
        System.out.println("Adding 2 numbers "+this.num1 + " "+ this.num2+ " = "+this.num1/this.num2 );
    }
}
