package entities;

import java.util.Objects;

public class Politico {
    private Integer idPolitico;
    private String nome;
    private Integer numberOfVotes;


    public Politico(Integer idPolitico, String nome, Integer numberOfVotes) {
        this.idPolitico = idPolitico;
        this.nome = nome;
        this.numberOfVotes = numberOfVotes;
    }
    public Politico(){

    }

    public Integer getIdPolitico() {
        return idPolitico;
    }

    public void setIdPolitico(Integer idPolitico) {
        this.idPolitico = idPolitico;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumberOfVotes() {
        return numberOfVotes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Politico politico = (Politico) o;
        return Objects.equals(idPolitico, politico.idPolitico);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(idPolitico);
    }
}
