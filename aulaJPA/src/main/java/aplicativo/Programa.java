package aplicativo;

import dominio.Pessoa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Programa {
    public static void main(String[] args) {


        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
        EntityManager em = emf.createEntityManager();

        // como eu busquei essa pessoa no banco de dados, o código de delete funciona
        Pessoa pessoa = em.find(Pessoa.class, 1);
        em.getTransaction().begin();
        em.remove(pessoa);
        em.getTransaction().commit();

        // por mais que o código de id seja o mesmo pra esse objeto pessoa que eu criei, o JPA n me permite excluir por não ter referência ao banco
//        Pessoa pessoa2 = new Pessoa(1, null, null);
//        em.remove(pessoa2);


        System.out.println("pronto");
        em.close();
        emf.close();
    }
}
