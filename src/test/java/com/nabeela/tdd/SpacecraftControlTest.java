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
    }
}
