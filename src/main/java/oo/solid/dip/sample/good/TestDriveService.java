package oo.solid.dip.sample.good;

import oo.solid.dip.sample.bad.Carro;
import oo.solid.dip.sample.bad.PessoaFisica;

public class TestDriveService {

    private EntidadeBaseDao dao;

    public TestDriveService(EntidadeBaseDao dao){
        this.dao = dao;
    }

    public void run(Pessoa pessoa, Veiculo carro){
        dao.save(new TestDrive(pessoa.getDados(), carro.getEspecificacoes()));
    }
}
