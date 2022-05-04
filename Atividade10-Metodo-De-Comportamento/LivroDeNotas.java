public class LivroDeNotas{
    
    //variável da instancia = atributo    
    private String nomeDaUC;

    //construtores

    public LivroDeNotas (String nomeDaUC) {
        this.nomeDaUC = nomeDaUC;


    }

    public LivroDeNotas (){
        
    }

    
    // método de acesso
    public String getNomeDaUC(){
        return nomeDaUC;
    }

    // método modificador

        public void alteraNomeDaUc(String nomeDaUC){
            this.nomeDaUC = nomeDaUC;



        }



        public void exibirNotas(){
         System.out.println(" Bem vindo ao livro de notas da uc" + nomeDaUC);   
        }


    }
