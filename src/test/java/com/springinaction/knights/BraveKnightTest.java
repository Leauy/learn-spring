package com.springinaction.knights;

import org.junit.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

/**
 * Created by liuyang11 on 2019/1/8.
 */
public class BraveKnightTest {

    @Test
    public void testBraveKnight(){
        Quest quest = mock(Quest.class);
        BraveKnight braveKnight = new BraveKnight(quest);
        braveKnight.embarOnQuest();
        verify(quest, times(1)).embark();
    }


}