package oo.solid.dip.sample.good;

public class TestDriveDaoImpl implements BaseDao<TestDrive> {

    @Override
    public void save(TestDrive test) {
        System.out.println(test.getData());
        System.out.println(test.getSpecifications());
    }
}
