package oo.solid.dip.sample.good;

public class TestDriveService {

    private BaseDao dao;

    public TestDriveService(BaseDao dao){
        this.dao = dao;
    }

    public void run(Individual individual, Vehicle vehicle){
        dao.save(new TestDrive(individual.getInfo(), vehicle.getSpecifications()));
    }
}
