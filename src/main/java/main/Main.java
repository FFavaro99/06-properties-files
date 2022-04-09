package main;

import config.Config;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main{
    public static void main(String[] args) {
        var c = new AnnotationConfigApplicationContext(Config.class);
        var dog = c.getBean("dog");
        System.out.println(dog.toString());
        var cat = c.getBean("cat");
        System.out.println(cat.toString());
    }
}