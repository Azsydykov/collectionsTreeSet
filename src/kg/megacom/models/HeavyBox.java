package kg.megacom.models;

public class HeavyBox implements Comparable<HeavyBox>{
    @Override
    public int compareTo(HeavyBox o) {
        return (o.getWeight() - this.weight);
    }

    private String name;
    private int weight;


    public HeavyBox(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "HeavyBox{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}
