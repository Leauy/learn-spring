package com.aspect;

import com.nsfocus.aspect.CompactDiscDemo;
import com.nsfocus.aspect.TrackCounter;
import com.nsfocus.aspect.TrackCounterConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ImportResource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes = TrackCounterConfig.class)
@ContextConfiguration(locations = "classpath*:trackcounter.xml")
public class TrackCounterTest {
    @Autowired
    private CompactDiscDemo compactDiscDemo;

    @Autowired
    private TrackCounter trackCounter;

    @Test
    public void testTrackCounter(){

        compactDiscDemo.playTrack(1);
        compactDiscDemo.playTrack(1);
        compactDiscDemo.playTrack(1);
        compactDiscDemo.playTrack(1);
        compactDiscDemo.playTrack(2);
        compactDiscDemo.playTrack(2);
        compactDiscDemo.playTrack(3);
        compactDiscDemo.playTrack(4);


        assertEquals(4, trackCounter.getTrackCount(1));
        assertEquals(2,trackCounter.getTrackCount(2));
        assertEquals(1,trackCounter.getTrackCount(3));


    }
}
