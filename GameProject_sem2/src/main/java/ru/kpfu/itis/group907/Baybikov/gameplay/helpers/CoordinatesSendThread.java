package ru.kpfu.itis.group907.Baybikov.gameplay.helpers;

import ru.kpfu.itis.group907.Baybikov.screens.classes.Field;

import java.io.PrintWriter;
import java.util.concurrent.BlockingQueue;


public class CoordinatesSendThread extends Thread {
    PrintWriter printWriter;
    Field field;
    BlockingQueue<Integer> q;

    public CoordinatesSendThread(PrintWriter printWriter, Field field, BlockingQueue q) {
        this.printWriter = printWriter;
        this.field = field;
        this.q = q;
    }

    public void run() {
//        printWriter.println("-10");
        System.out.println("\n\nSENDING MY MAP");
        for (int i = 0; i < field.getCells().length; i++) {
            for (int j = 0; j < field.getCells().length; j++) {
                System.out.print(field.getCell(j, i));
                q.add(field.getCell(j, i));
//                printWriter.println(field.cells[i][j]);
            }
            System.out.println();
        }


    }

}

