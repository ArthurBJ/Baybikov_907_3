package ru.kpfu.itis.group907.Baybikov.gameplay.helpers;

import ru.kpfu.itis.group907.Baybikov.gameplay.Client;
import ru.kpfu.itis.group907.Baybikov.screens.classes.Field;

import java.io.BufferedReader;
import java.util.concurrent.BlockingQueue;


public class CoordinatesGetThread extends Thread {
    BufferedReader bufferedReader;
    Field field;
    Client client;
    String command;
    BlockingQueue<Integer> q;

    public CoordinatesGetThread(BufferedReader bufferedReader, Field field, BlockingQueue q) {
        this.bufferedReader = bufferedReader;
        this.field = field;
        this.q = q;
    }

    public void run() {
        try {
//            command = bufferedReader.readLine();
//            if (command.equals("-10")) {
                System.out.println("\n OPPONENTS COORDINATES");
                for (int i = 0; i < 10; i++) {
                    for (int j = 0; j < 10; j++) {
//                        command = bufferedReader.readLine();
                        field.cells[j][i] = q.take();
//                        field.cells[i][j] = Integer.parseInt(command);
                        System.out.print(field.cells[j][i]);
                    }
                    System.out.println();
                }
//            }

//        } catch (IOException e) {
//            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
