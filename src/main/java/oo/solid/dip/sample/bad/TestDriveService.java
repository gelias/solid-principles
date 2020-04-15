package oo.solid.dip.sample.bad;

import oo.solid.dip.sample.good.TestDrive;

public class TestDriveService {

    private TestDriveDao dao;

    public TestDriveService(){
        this.dao = new TestDriveDao();
    }

    public void run(PessoaFisica pessoaFisica, Carro carro){
        dao.save(new TestDrive(pessoaFisica.getDados(), carro.getEspecificacoes()));
    }
}
