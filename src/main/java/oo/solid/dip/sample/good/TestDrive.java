package oo.solid.dip.sample.good;

public class TestDrive {

    private String data;
    private String specifications;

    public TestDrive(String data, String specifications) {
        this.data = data;
        this.specifications = specifications;
    }

    public String getData() {
        return data;
    }

    public String getSpecifications() {
        return specifications;
    }
}
