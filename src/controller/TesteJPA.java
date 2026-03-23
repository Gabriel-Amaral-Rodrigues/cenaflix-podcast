package controller;

import javax.persistence.EntityManager;
import model.Podcast;
import util.JPAUtil;

public class TesteJPA {

    public static void main(String[] args) {

        EntityManager em = JPAUtil.getEntityManager();

        Podcast p = new Podcast();
        p.setProdutor("Teste");
        p.setNomeEpisodio("Ep 1");
        p.setNumeroEpisodio(1);
        p.setDuracao("10:00");
        p.setUrlRepositorio("http://teste.com");

        em.getTransaction().begin();
        em.persist(p);
        em.getTransaction().commit();

        em.close();

        System.out.println("salvou");
    }
}