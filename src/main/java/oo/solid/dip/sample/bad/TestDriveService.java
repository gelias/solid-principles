package oo.solid.dip.sample.bad;

import oo.solid.dip.sample.good.TestDrive;

public class TestDriveService {

    private TestDriveDao dao;

    public TestDriveService(){
        this.dao = new TestDriveDao();
    }

    public void run(Person person, Car car){
        dao.save(new TestDrive(person.getInfo(), car.getSpecifications()));
    }
}
