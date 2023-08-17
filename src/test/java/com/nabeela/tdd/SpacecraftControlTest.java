package com.nabeela.tdd;

import com.nabeela.tdd.model.SpacecraftStatus;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class SpacecraftControlTest {

    @Test
    public void shouldControl() {
        SpacecraftControl spacecraftControl = new SpacecraftControl();

        SpacecraftStatus expected1 = new SpacecraftStatus(new int[]{0,1,0}, "N");
        Assert.assertEquals(expected1, spacecraftControl.controlSpacecraft(List.of("f"),"N"));

        SpacecraftStatus expected2 = new SpacecraftStatus(new int[]{0,-1,0}, "N");
        Assert.assertEquals(expected2, spacecraftControl.controlSpacecraft(List.of("b"),"N"));

        SpacecraftStatus expected3 = new SpacecraftStatus(new int[]{0,0,0}, "E");
        Assert.assertEquals(expected3, spacecraftControl.controlSpacecraft(List.of("r"),"N"));

        SpacecraftStatus expected4 = new SpacecraftStatus(new int[]{0,0,0}, "W");
        Assert.assertEquals(expected4, spacecraftControl.controlSpacecraft(List.of("l"),"N"));

        SpacecraftStatus expected5 = new SpacecraftStatus(new int[]{0,0,0}, "U");
        Assert.assertEquals(expected5, spacecraftControl.controlSpacecraft(List.of("u"),"N"));

        SpacecraftStatus expected6 = new SpacecraftStatus(new int[]{0,0,0}, "D");
        Assert.assertEquals(expected6, spacecraftControl.controlSpacecraft(List.of("d"),"N"));

        SpacecraftStatus expected7 = new SpacecraftStatus(new int[]{1,0,0}, "E");
        Assert.assertEquals(expected7, spacecraftControl.controlSpacecraft(List.of("f"),"E"));

        SpacecraftStatus expected8 = new SpacecraftStatus(new int[]{-1,0,0}, "E");
        Assert.assertEquals(expected8, spacecraftControl.controlSpacecraft(List.of("b"),"E"));

        SpacecraftStatus expected9 = new SpacecraftStatus(new int[]{0,0,0}, "S");
        Assert.assertEquals(expected9, spacecraftControl.controlSpacecraft(List.of("r"),"E"));

        SpacecraftStatus expected10 = new SpacecraftStatus(new int[]{0,0,0}, "N");
        Assert.assertEquals(expected10, spacecraftControl.controlSpacecraft(List.of("l"),"E"));

        SpacecraftStatus expected11 = new SpacecraftStatus(new int[]{1,0,0}, "U");
        Assert.assertEquals(expected11, spacecraftControl.controlSpacecraft(List.of("f", "u"),"E"));

        SpacecraftStatus expected12 = new SpacecraftStatus(new int[]{1,0,0}, "D");
        Assert.assertEquals(expected12, spacecraftControl.controlSpacecraft(List.of("f", "d"),"E"));

        SpacecraftStatus expected13 = new SpacecraftStatus(new int[]{-1,0,1}, "S");
        Assert.assertEquals(expected13, spacecraftControl.controlSpacecraft(List.of("b","u","d","f","l"),"W"));
    }
}
