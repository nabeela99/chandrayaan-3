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
                direction = this.turn(command, direction);
                status = new SpacecraftStatus(position, direction);
            } else if("l".equals(command)) {
                direction = this.turn(command, direction);
                status = new SpacecraftStatus(position, direction);
            } else if("u".equals(command)){
                direction = this.turn(command, direction);
                status = new SpacecraftStatus(position, direction);
            } else {
                direction = this.turn(command, direction);
                status = new SpacecraftStatus(position, direction);
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

    public String turn(String command, String direction) {
        String newDirection = null;
        if ("E".equals(direction) && "r".equals(command)){
            newDirection = "S";
        } else if ("N".equals(direction) && "r".equals(command)){
            newDirection = "E";
        } else if ("E".equals(direction) && "l".equals(command)){
            newDirection = "N";
        } else if ("N".equals(direction) && "l".equals(command)){
            newDirection = "W";
        } else if ("u".equals(command)){
            newDirection = "U";
        } else {
            newDirection = "D";
        }
        return newDirection;
    }
}
