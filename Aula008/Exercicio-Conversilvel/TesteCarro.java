public class TesteCarro {
    public static void main(String[] args) {
        Conversivel carro1= new Conversivel();
        //instanciando o objeto carro1, da classe Carro, chamando o construtor padrão Carro()

        carro1.setMotor(5.0);
        System.out.println("teste da regra do setMotor:\nmotor do carro1" + carro1.getMotor());
        carro1.setAnoFabricacao(2025);
        System.out.println("testeda regra setAnoFabricacao:\nano de fabricação do carro 1: " carro1.getAnoFabricacao());
    }
    
}

/* carro1 = new Carro();
        //instanciando o objeto carro1, da classe Carro, chamando o construtor padrão Carro()
        //não funciona, pois os atributos são encapsulados
        //carro1.anoFabricacao = 2015;
        //System.out.println(carro1.marca);

        System.out.println("carro 1 depois de construido com o construtor padrao:\nmarca: " + carro1.getMarca() + "\nmotor: " + carro1.getMotor() + "\nano de fabricacao: " + carro1.getAnoFabricacao());

        carro1.setMotor(5.0);
        System.out.println("teste da regra setMotor:\nmotor do carro 1: " + carro1.getMotor());
        carro1.setAnoFabricacao(2025);
        System.out.println("teste da regra setAnoFabricacao:\nano de fabricacao do carro 1: " + carro1.getAnoFabricacao());

        Carro carro2 = new Carro("conversivel", 3.0, 2010);

        if (carro2.getVelocidadeAtual() == 0) {
            System.out.println(carro2.getMarca() + " esta parado");
        }
        else {
            System.out.println(carro2.getMarca() + " esta andando");
        }
        carro2.acelerar(100);
        System.out.println(carro2.getMarca() + " esta a " + carro2.getVelocidadeAtual() + " Km/h");
        carro2.acelerar(10);
        System.out.println(carro2.getMarca() + " esta a " + carro2.getVelocidadeAtual() + " Km/h");
        carro2.frear(20);
        System.out.println(carro2.getMarca() + " esta a " + carro2.getVelocidadeAtual() + " Km/h");
    }
}
*/ 