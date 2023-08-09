package org.example;

import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
//        Human human = new Human();
//        ExClass exClass = new ExClass();
//        System.out.println(ClassToJsonConverter.convertObjectToJson(human));

        ClassToJsonConverter classToJsonConverter = new ClassToJsonConverter();
        classToJsonConverter.run();
    }

}