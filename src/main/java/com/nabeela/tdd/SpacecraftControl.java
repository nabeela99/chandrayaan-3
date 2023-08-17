package com.nabeela.tdd;

import com.nabeela.tdd.model.SpacecraftStatus;

import java.util.List;

public class SpacecraftControl {

    public SpacecraftStatus controlSpacecraft(List<String> commands, String direction) {
        SpacecraftStatus status = null;
        int [] position = new int []{0,0,0};
        for (String command : commands) {
            if ("f".equals(command)) {
                this.move(1, position, direction);
                status = new SpacecraftStatus(position, direction);
            } else if ("b".equals(command)){
                this.move(-1, position, direction);
                status = new SpacecraftStatus(position, direction);
            } else if("r".equals(command)) {
                status = new SpacecraftStatus(new int[]{0,0,0}, "E");
            } else if("l".equals(command)) {
                status = new SpacecraftStatus(new int[]{0,0,0}, "W");
            } else if("u".equals(command)){
                status = new SpacecraftStatus(new int[]{0,0,0}, "U");
            } else {
                status = new SpacecraftStatus(new int[]{0,0,0}, "D");
            }
        }
        return status;
    }

    private void move(int step, int[] position, String direction) {
        if(direction.matches("E|W")){
            position[0] = position[0]+ step;
        } else if(direction.matches("S|N")){
            position[1] = position[1] + step;
        } else {
            position[2] = position[2] + step;
        }
    }
}
