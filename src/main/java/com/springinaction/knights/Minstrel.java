package com.springinaction.knights;

import java.io.PrintStream;

/**
 * Created by liuyang11 on 2019/1/9.
 */
public class Minstrel {
    private PrintStream printStream;

    public Minstrel(PrintStream printStream) {
        this.printStream = printStream;
    }

    public void singBeforeQuest(){
        printStream.println("fa lala, the knight is so brave!");
    }

    public void singAfterQuest(){
        printStream.println("tee hee hee, the brave knight, did embark on quest");
    }
}