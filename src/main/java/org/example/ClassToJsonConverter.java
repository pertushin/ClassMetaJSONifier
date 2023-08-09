package org.example;

import org.json.JSONObject;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;
import java.util.Set;


public class ClassToJsonConverter {

    public void run() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        String run;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter class name from [org.classeslist.*] package to convert: ");
            String className = scanner.next();
            System.out.println("=============================================");

            try {
                Class clazz = Class.forName("org.classeslist." + className);
                Object instance = clazz.getDeclaredConstructor().newInstance();
                System.out.println(convertObjectToJson(instance));
            } catch (ClassNotFoundException e) {
                System.out.println("No such class in the package =( ");
            }

            System.out.println("=============================================");
            System.out.println("Do you want to convert another class? (y/n)");
            run = scanner.next();
        } while (run.equals("y"));
    }

    public static String convertObjectToJson(Object object) {
        Class clazz = object.getClass();
        Field[] fields = clazz.getDeclaredFields();
        JSONObject json = new JSONObject();


        for (Field field: fields) {
            switch (field.getType().getSimpleName()) {
                case "Map":

                    break;
                default:
                    json.put(field.getName(), field.getType().getSimpleName());
            }
        }
        return json.toString(4);
    }

}
