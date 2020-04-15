package oo.solid.dip.sample.good;

public class TestDriveManagement {

    public static void main(String[] args) {
        TestDriveDaoImpl dao = new TestDriveDaoImpl();
        TestDriveService service = new TestDriveService(dao);
        PessoaFisica pessoaFisica = new PessoaFisica("nome", "00222022002");
        Carro carro = new Carro("Fiat", "Punto", 2009);
        service.run(pessoaFisica, carro);
    }
}
