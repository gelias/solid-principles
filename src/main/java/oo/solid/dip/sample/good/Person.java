package oo.solid.dip.sample.good;

public class Person implements Individual {
    private String name;
    private String id;

    public Person(String name, String id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String getInfo() {
        return String.format("Name: %s, Id: %s",this.name, this.id);
    }
}
