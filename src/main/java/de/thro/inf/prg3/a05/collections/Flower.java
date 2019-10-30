package de.thro.inf.prg3.a05.collections;

public class Flower extends Plant {

    private PlantColor c;

    public Flower(Double height, String name, String family, PlantColor color){
        super(height, name, family);

        if (color == PlantColor.GREEN)
            throw new IllegalArgumentException("Blumen sind nicht Grün");

        this.c = color;
    }


    @Override
    public PlantColor getColor() {
        return c;
    }
}
