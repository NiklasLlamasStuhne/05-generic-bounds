package de.thro.inf.prg3.a05.collections;


public abstract class Plant implements Comparable<Plant> {
    private double heigth;
    private String family;
    private String name;

    public Plant(double h, String f,String n){
        heigth = h;
        family = f;
        name = n;
    }

    public double getHeigth() {
        return heigth;
    }

    public String getFamily() {
        return family;
    }

    public String getName() {
        return name;
    }

    public abstract PlantColor getColor();

    @Override
    public int compareTo(Plant o) {
        //return Double.compare(this.heigth, o.getHeigth())
        if (this.getHeigth()<o.getHeigth()){
            return -1;
        }
        if (this.getHeigth() == (o.getHeigth())){
            return 0;
        }

            return 1;

    }
}
