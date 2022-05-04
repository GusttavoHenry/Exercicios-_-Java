public class TesteSobreCarga{
    public static void main(String[] args){
        //declarar e insanciar uma Calculadora

        Calculadora c = new Calculadora();
        //declarar as variáveis simples com os valores para teste
        int x = 5, y = 8, z= 12;
        double v1= 3.4, v2 = 5.6;
        String s1= "50", s2 = "30";
        
        //teste do método sobrecarregado de somar
        System.out.println("soma de dois inteiros:"+ c.soma(x,y));
        System.out.println("soma de tres inteiros:"+ c.soma(x,y,z));
        System.out.println("soma de dois reais:"+ c.soma(v1,v2));
        System.out.println("soma das duas strings:"+ c.soma(s1,s2));

        


    }
}

