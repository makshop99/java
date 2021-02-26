package day2.reflection;

import java.lang.reflect.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Hans", "Tester");
        Class<?> personClass = person.getClass();

        System.out.println(personClass.getSimpleName());
        System.out.println(personClass.getName());

        try {
            Class<?> personClassByName = Class.forName("day2.reflection.Person");
            System.out.println(personClassByName.getName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println(Modifier.isPublic(personClass.getModifiers()));
        System.out.println(Modifier.isPublic(AbstractPerson.class.getModifiers()));
        System.out.println(Modifier.isAbstract(AbstractPerson.class.getModifiers()));

        System.out.println(new Child().getClass().getSuperclass().getName());
        System.out.println(new Parent().getClass().getSuperclass().getName());

        System.out.println(new Parent().getClass().getInterfaces()[0].getName());

        Field[] declaredFields = personClass.getDeclaredFields();
        Arrays.stream(declaredFields).forEach(f -> System.out.println(f.getName()));

        Constructor<?>[] constructors = personClass.getConstructors();
        for(Constructor<?> c: constructors) {
            System.out.println(c.getParameterCount());
        }

        try {
            Constructor<?> noArgsConstructor = personClass.getConstructor();
            Constructor<?> allArgsConstructor = personClass.getConstructor(String.class, String.class);

            Person p = (Person) allArgsConstructor.newInstance("Peter", "Reflection");
            System.out.println(p.getFirstName());
            System.out.println(p.getLastName());
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        Method[] declaredMethods = personClass.getDeclaredMethods();
        Arrays.stream(declaredMethods).forEach(m -> System.out.println(m.getName() + " / " + m.getParameterCount()));
        System.out.println("-----");
        try {
            Person testUser = new Person("Vor", "Änderung");
            Method setFirstName = testUser.getClass().getDeclaredMethod("setFirstName", String.class);
            Method getFirstName = testUser.getClass().getDeclaredMethod("getFirstName");

            setFirstName.invoke(testUser, "Nach");
            String firstName = (String) getFirstName.invoke(testUser);
            System.out.println(firstName);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }


    }
}
