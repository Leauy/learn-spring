package com.nsfocus.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @author liuyang
 */
@Component
@Aspect
public class TrackCounter {
    private Map<Integer, Integer> trackCountMap = new HashMap<Integer, Integer>();

//    @Pointcut("execution(* com.nsfocus.aspect.CompactDiscDemo.playTrack(..)) && " +
//            "args(trackNumber)")
    public void trackPlayed(int trackNumber) {

    }

//    @After("trackPlayed(trackNumber)")
    public void countTrack(int trackNumber) {
        int currentCount = getTrackCount(trackNumber);
        trackCountMap.put(trackNumber, currentCount +1);
    }


    public int getTrackCount(Integer trackNumber){
        return trackCountMap.containsKey(trackNumber) ? trackCountMap.get(trackNumber):
                0;
    }
}
