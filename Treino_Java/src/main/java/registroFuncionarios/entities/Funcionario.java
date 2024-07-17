package registroFuncionarios.entities;

public class Funcionario {
    private Integer id;
    private String nome;
    private Double salario;

    public Funcionario(Integer id, String nome, Double salario){
        this.id = id;
        this.nome = nome;
        this.salario = salario;

    }

    public int getId() {
        return id;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }
    public void aumento(Double aumento){
        salario +=  salario * aumento / 100.0;
    }

    @Override
    public String toString() {
        return
                id +
                ", " + nome +
                ", " + String.format("%.2f", salario);
    }
}
