package org.runner;

import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {

        ClassToJsonConverter classToJsonConverter = new ClassToJsonConverter();
        classToJsonConverter.run();
    }

}