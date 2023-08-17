package com.nabeela.tdd;

import com.nabeela.tdd.model.SpacecraftStatus;

import java.util.List;

public class SpacecraftControl {

    public SpacecraftStatus controlSpacecraft(List<String> commands, String direction) {
        SpacecraftStatus status = null;
        int [] position = new int []{0,0,0};
        for (String command : commands) {
            if ("f".equals(command)) {
                status = new SpacecraftStatus(new int [] {0,1,0}, "N");
            } else if ("b".equals(command)){
                status = new SpacecraftStatus(new int[]{0,-1,0}, "N");
            } else if("r".equals(command)) {
                status = new SpacecraftStatus(new int[]{0,0,0}, "E");
            } else {
                status = new SpacecraftStatus(new int[]{0,0,0}, "W");
            }
        }
        return status;
    }
}
