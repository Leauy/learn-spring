package com.aspect;

import com.nsfocus.aspect.AspectConfig;
import com.nsfocus.aspect.Audience;
import com.nsfocus.aspect.Performance;
import com.nsfocus.aspect.PerformanceDemo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {AspectConfig.class})
public class AspectTest {

    @Test
    public void testAspect(){
        Performance performance = new PerformanceDemo();
        performance.perform();
    }
}
