package de.thro.inf.prg3.a05.tests.collections;


import de.thro.inf.prg3.a05.collections.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestPlant {

    @BeforeEach
    public void setup() {

        Shrub s = new Shrub(1.8, "Strauch", "Sträucher");


    }

    @Test
    void TestColor() {



    assertThrows(IllegalArgumentException.class,new Executable(){
        @Override
                public void execute()throws Throwable{
            Flower f = new Flower(1.2, "Gänseblümchen", "Wiesenblumen", PlantColor.GREEN);
        }

        });

    }

    @Test
    void TestFilter(){
        Flower f = new Flower(1.2, "Gänseblümchen", "Wiesenblumen", PlantColor.BLUE);
        Flower f2 = new Flower(1.2, "Gänseblümchen", "Wiesenblumen", PlantColor.YELLOW);
        Flower f3 = new Flower(1.2, "Gänseblümchen", "Wiesenblumen", PlantColor.BLUE);

        PlantBed bed = new PlantBed();

        bed.add(f);
        bed.add(f2);
        bed.add(f3);

        assertEquals(2,bed.getPlantsByColor(PlantColor.BLUE).size());

    }

}
