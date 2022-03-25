package oo.solid.dip.sample.good;

public class TestDriveManagement {

    public static void main(String[] args) {
        TestDriveDaoImpl dao = new TestDriveDaoImpl();
        TestDriveService service = new TestDriveService(dao);
        Person person = new Person("nome", "00222022002");
        Car car = new Car("Fiat", "Punto", 2009);
        service.run(person, car);
    }
}
