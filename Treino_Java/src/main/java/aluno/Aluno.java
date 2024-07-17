package aluno;

import java.util.Arrays;

public class Aluno {
    private String nome;
    private double[] nota;
    private double notafinal;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double[] getNota() {
        return nota;
    }

    public void addNota(int posicao, double valor) {
        if(posicao >= 0 && posicao < getNota().length){
            this.nota[posicao] = valor;
            this.notafinal += valor;
        }else{
            System.out.println("ERRO");
        }
    }

    public void setNota(double[] nota) {
        this.nota = nota;
    }
    public String notaFinal(){
        return "FINAL GRADE: "+ String.format("%.2f", this.notafinal);
    }
    public String verificaNota(){
        if(this.notafinal >= 60){
            return "PASS";
        }else{
          return "FAILED \nMISSING " + String.format("%.2f", (60 - this.notafinal)) + " POINTS";
        }
    }

}
