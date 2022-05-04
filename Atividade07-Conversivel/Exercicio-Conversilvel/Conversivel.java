
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Conversivel{
    public static int contaConversiveis=0;
    private String marca; //atributo encapsulado
    private double motor;
    private int  anoFabricacao;
    private int velocidadeAtual;

   //Redefinir construtor padrão
   public Conversivel(){
    marca = "novo";
    contaConversiveis++;
}

 //construtor com todos os parâmetros
 public Conversivel (String marca, double motor, int anoFabricacao) {
    this.setAnoFabricacao(anoFabricacao);
    this.setMarca(marca);
    this.setMotor(motor);
    this.velocidadeAtual = 0;
    contaConversiveis++;
}



    // métodos de acesso= getters

    public String getMarca (){
        return this.marca;

    }
    public double getMotor (){
     return this.motor;   
    }
    public int getAnoFabricacao (){
        return this.anoFabricacao;
    }

    // métodos modificadores
    public void setMarca(String marca){
        this.marca = marca ;
   }

   public void setMotor(double motor){
    if (motor >=1.0 && motor <= 4.1) {
        this.motor = 1.0;
    }   
    else {
        this.motor = motor;
    }
   
   }

   public void setAnoFabricacao(int anoFabricacao){
       Calendar calendario = new  GregorianCalendar();
       int anoAtual = calendario.get(calendario.YEAR);        
       
        if(anoFabricacao > anoAtual){
     this.anoFabricacao = anoFabricacao;
    }
    else{
        this.anoFabricacao = anoFabricacao;
    }
   }
   public void acelerar(int aceleracao){
       for (int i=1; i<=aceleracao; i++) {
           this.velocidadeAtual++ ;
           System.out.println(velocidadeAtual);
       }
       public void frear(int frenagem){
           int i=1;
           while(i<=frenagem) {
            this.velocidadeAtual--;
            System.out.println(velocidadeAtual);
            i++;
           }
       

   }
}

/*
import java.util.Calendar;
import java.util.GregorianCalendar;
public class Carro {
    //variáveis estáticas
    public static int contaCarros=0;
    //variáveis de instância ou atributos 
    private String marca; //atributos encapsulados
    private double motor;
    private int anoFabricacao;
    private int velocidadeAtual;

    //redefinir o construtor padrão
    public Carro(){
        marca = "novo";
        contaCarros++;
    }
    
    //construtor com todos os parâmetros
    public Carro (String marca, double motor, int anoFabricacao) {
        this.setAnoFabricacao(anoFabricacao);
        this.setMarca(marca);
        this.setMotor(motor);
        this.velocidadeAtual = 0;
        contaCarros++;
    }
    //métodos de acesso = getters
    public String getMarca () {
        return this.marca;
    }
    public double getMotor() {
        return this.motor;
    }
    public int getAnoFabricacao () {
        return this.anoFabricacao;
    }
    public int getVelocidadeAtual() {
        return this.velocidadeAtual;
    }
    //métodos modificadores = setters
    public void setMarca (String marca) {
        this.marca = marca;
    }
    public void setMotor (double motor) {
        if (motor >= 1.0 && motor <= 4.1) {
            this.motor = motor;
        }
        else {
            this.motor = 1.0;
        }
    }
    public void setAnoFabricacao (int anoFabricacao) {
        Calendar calendario = new GregorianCalendar();
        int anoAtual = calendario.get(calendario.YEAR);

        if (anoFabricacao > anoAtual) {
            this.anoFabricacao = 1970;
        }
        else {
            this.anoFabricacao = anoFabricacao;
        }
    }
    public void acelerar (int aceleracao) {
        for (int i=1; i<=aceleracao; i++) {
            this.velocidadeAtual++;
            System.out.println(velocidadeAtual);
        }
    }
    public void frear (int frenagem) {
        int i=1;
        while (i<=frenagem) {
            this.velocidadeAtual--;
            System.out.println(velocidadeAtual);
            i++;
        }
    }


}
      

*/ 