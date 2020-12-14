package ru.kpfu.itis.group907.Baybikov.gameplay.helpers;

import ru.kpfu.itis.group907.Baybikov.gameplay.Player;

import java.io.IOException;


public class GenerationThread extends Thread {
    Player p;
    String command = "";

    public GenerationThread(Player p) {
        this.p = p;
    }

    public void run() {
        try {
            command = p.getIn().readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("p: " + command);
        if (command.equals("-11")) {
            int[][] cells = p.generateField();
            p.getField().cells = cells;
            for (int i = 0; i < cells.length; i++) {
                for (int j = 0; j < cells.length; j++) {
                    p.getOut().println(cells[i][j]);
                }
            }
        }

    }

}
