package com.springinaction.knights;

/**
 * Created by liuyang11 on 2019/1/8.
 */
public class BraveKnight implements Knight {
    private Quest quest;
//    private Minstrel minstrel;

//    public BraveKnight(Quest quest, Minstrel minstrel) {
    public BraveKnight(Quest quest) {
        //构造器注入
        this.quest = quest;
    }

    @Override
    public void embarOnQuest() {
        quest.embark();
    }
}