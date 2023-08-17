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
        if (direction.equals("E") && command.equals("r") || direction.equals("W") && command.equals("l") || direction.equals("U") && command.equals("r") || direction.equals("D") && command.equals("l")) {
            return "S";
        } else if (direction.equals("E") && command.equals("l") || direction.equals("W") && command.equals("r") || direction.equals("U") && command.equals("l") || direction.equals("D") && command.equals("r")) {
            return "N";
        } else if (direction.equals("N") && command.equals("r") || direction.equals("S") && command.equals("l")) {
            return "E";
        } else if (direction.equals("N") && command.equals("l") || direction.equals("S") && command.equals("r")) {
            return "W";
        } else if (command.equals("u")) {
            return "U";
        } else if (command.equals("d")) {
            return "D";
        }
        return "U";
    }
}
