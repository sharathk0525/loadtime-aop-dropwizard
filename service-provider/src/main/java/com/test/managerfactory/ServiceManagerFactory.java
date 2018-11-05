package com.test.managerfactory;

import com.test.manager.AdditionManager;
import com.test.manager.DivisionManager;
import com.test.manager.MultiplicationManager;

import java.util.List;

/**
 * Created by smallam on 10/5/2018.
 */
public class ServiceManagerFactory {

    public AdditionManager createAdditionManagerManager(int num1, int num2) {
        return new AdditionManager(num1, num2 );
    }

    public DivisionManager createDivisionManagerManager(int num1, int num2) {
        return new DivisionManager(num1, num2 );
    }

    public MultiplicationManager createMultiplicationManagerManager(int num1, int num2) {
        return new MultiplicationManager(num1, num2 );
    }
}
