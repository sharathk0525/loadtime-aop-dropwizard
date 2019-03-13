package com.test.facade;

import com.test.manager.AdditionManager;
import com.test.manager.DivisionManager;
import com.test.manager.MultiplicationManager;
import com.test.managerfactory.ServiceManagerFactory;


public final class ServiceProviderFacade {

    private static ServiceManagerFactory serviceManagerFactory = new ServiceManagerFactory();

    public static void doMultiplication(int num1, int num2){
        MultiplicationManager multiplicationManager = serviceManagerFactory.createMultiplicationManagerManager(num1, num2);
        multiplicationManager.performOperation();
    }

    public static void doDivison(int num1, int num2){
        DivisionManager divisionManager = serviceManagerFactory.createDivisionManagerManager(num1, num2);
        divisionManager.performOperation();
    }

    public static void doAddition(int num1, int num2){
        AdditionManager additionManager = serviceManagerFactory.createAdditionManagerManager(num1, num2);
        additionManager.performOperation();
    }
}
