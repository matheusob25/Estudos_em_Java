package entities;

import java.util.Objects;

public class Eleitor implements Comparable<Eleitor>{

    private Integer id;
    private String nome;
    private Politico vote;


    public Eleitor(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
    }
    public Eleitor(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }
    public Politico getVote() {
        return vote;
    }
    public void setVote(Politico vote) {
        this.vote = vote;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Eleitor eleitor = (Eleitor) o;
        return Objects.equals(id, eleitor.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public int compareTo(Eleitor o) {
        return id.compareTo(o.id);
    }

    @Override
    public String toString() {
        return "Eleitor{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }
}
