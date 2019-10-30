package de.thro.inf.prg3.a05.collections;

public class PlantBed <T extends Plant> {
    private SimpleList<Plant> plants = new SimpleListImpl<>();

    public void add (Plant plant){
        plants.add(plant);
    }
    public int size(){
        return plants.size();
    }
    public SimpleList<Plant> getPlantsByColor(PlantColor color){
        return plants.filter(new SimpleFilter<Plant>() {
            @Override
            public boolean include(Plant item) {
                return item.getColor()==color;
            }
        });

    }

}
