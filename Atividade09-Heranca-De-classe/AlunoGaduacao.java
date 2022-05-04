public class AlunoGaduacao extends Aluno{
    private double n1;
    private double n2;
    private double nFinal;

    // construtor com parametros
    public AlunoGaduacao (String nome, int idade , int ra , double n1, double n2,double nFinal){
        super(nome , idade , ra);
        this.setN1(n1);
        this.setN2(n2);
        this.setNFinal(nFinal);
    }
    public AlunoGaduacao(){}
    public double getN1 () {
        return this.n1;
    }

    public double getN2 () {
        return this.n2;
    }

    public double getNFinal () {
        return this.nFinal;
    }

    public void setN1 (double n1) {
        this.n1 = n1;
    }
    public void setN2 (double n2) {
        this.n2 = n2;
    }
    public void setNFinal (double nFinal) {
        this.nFinal = nFinal;
    }

    @Override
    public String toString () {
     return super.toString() + "/n[" + this.n1 + ", "+ this.n2 + ", "+ this.nFinal + "]";
}
}

