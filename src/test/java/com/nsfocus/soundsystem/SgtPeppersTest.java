package com.nsfocus.soundsystem;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
//@ContextConfiguration(locations = {""})
public class SgtPeppersTest {

//    public static void main(String[] args) {
////        ApplicationContext context = new AnnotationConfigApplicationContext(com.nsfocus.soundsystem.CDPlayerConfig.class);
////        SgtPeppers sgtPeppers = context.getBean(SgtPeppers.class);
////        sgtPeppers.play();;
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("componentScan.xml");
//        SgtPeppers sgtPeppers = context.getBean(SgtPeppers.class);
//        sgtPeppers.play();
//        context.close();
//    }
    @Autowired
    private CompactDisc compactDisc;

    @Test
    public void cdShouldNotBeNull(){
        assertNotNull(compactDisc);
    }

}
