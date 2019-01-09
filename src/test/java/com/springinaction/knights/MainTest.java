package com.springinaction.knights;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by liuyang11 on 2019/1/9.
 */
public class MainTest {
    public static void main(String[] args) {
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("knight.xml");
//        Knight knight = context.getBean(Knight.class);
//        knight.embarOnQuest();
//        context.close();
        ApplicationContext context = new AnnotationConfigApplicationContext(com.springinaction.knights.config.KnightConfig.class);
        Knight knight = context.getBean(Knight.class);
        knight.embarOnQuest();

    }
}