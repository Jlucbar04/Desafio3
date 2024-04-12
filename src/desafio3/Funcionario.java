package desafio3;

//Atributos
public class Funcionario {



    private String nome;

    private double salarioBruto;

    private double taxa;

    //Construtores
    public Funcionario() {

    }

    public Funcionario(String nome, double salarioBruto, double taxa) {
        this.nome = nome;
        this.salarioBruto = salarioBruto;
        this.taxa = taxa;
    }

    //Métodos da classe
    public String getNomeDoFuncionario() {

        return nome;
    }

    public double getSalarioBruto() {

        return salarioBruto;
    }

    public double getTaxa() {

        return taxa;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }


    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }
    public double obterSalarioLiquido() {
        return salarioBruto - taxa;
    }
    public void aumentoSalario(double porcetagem) {
        salarioBruto *= ((100 + porcetagem) / 100);
    }

    @Override
    public String toString() {
        return "Funcionarios: " +
                "nome: "  + nome + '\'' +
                ", salarioBruto: R$" + salarioBruto +
                ", taxa: R$" + taxa
                ;
    }
}