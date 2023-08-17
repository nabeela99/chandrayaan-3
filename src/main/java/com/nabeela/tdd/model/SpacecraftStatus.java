package com.nabeela.tdd.model;

import java.util.Arrays;
import java.util.Objects;

public class SpacecraftStatus {

    private final int [] finalPosition;

    private final String finalDirection;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SpacecraftStatus that = (SpacecraftStatus) o;
        return Arrays.equals(finalPosition, that.finalPosition) && Objects.equals(finalDirection, that.finalDirection);
    }

    public SpacecraftStatus(int[] finalPosition, String finalDirection) {
        this.finalPosition = finalPosition;
        this.finalDirection = finalDirection;
    }

    public int[] getFinalPosition() {
        return finalPosition;
    }

    public String getFinalDirection() {
        return finalDirection;
    }
}
