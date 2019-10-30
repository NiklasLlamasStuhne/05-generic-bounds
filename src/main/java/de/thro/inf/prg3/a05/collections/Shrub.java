package de.thro.inf.prg3.a05.collections;

public class Shrub extends Plant {

    private PlantColor color;

    public Shrub(Double height, String name, String family){
        super(height,name,family);
        this.color = PlantColor.GREEN;
    }

    @Override
    public PlantColor getColor() {
        return PlantColor.GREEN;
    }
}

