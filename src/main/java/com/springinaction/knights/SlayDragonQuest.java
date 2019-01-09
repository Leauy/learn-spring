package com.springinaction.knights;

import java.io.PrintStream;

/**
 * Created by liuyang11 on 2019/1/9.
 */
public class SlayDragonQuest implements Quest {
    private PrintStream printStream;

    public SlayDragonQuest(PrintStream printStream) {
        this.printStream = printStream;
    }

    @Override
    public void embark() {
        printStream.println("Embarking on quest to slay the dragon");
    }
}