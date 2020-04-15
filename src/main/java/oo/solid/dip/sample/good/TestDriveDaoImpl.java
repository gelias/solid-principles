package oo.solid.dip.sample.good;

import oo.solid.dip.sample.bad.TestDriveDao;

public class TestDriveDaoImpl implements EntidadeBaseDao<TestDrive>{

    @Override
    public void save(TestDrive entidade) {
        System.out.println(entidade.getDados());
        System.out.println(entidade.getEspecificacoes());
    }
}
