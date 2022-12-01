package jpabook.jpashop;

import jpabook.jpashop.domain.Member;
import jpabook.jpashop.domain.Movie;
import org.hibernate.Hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaMain {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");

        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin();

        try {
            Member member = new Member();
            member.setName("hello");

            System.out.println("========");
            em.persist(member);
            em.flush();
            em.clear();

            System.out.println("========");
            Member findMember =  em.getReference(Member.class, member.getId());
            System.out.println("findMember.getClass() = " + findMember.getClass());
            System.out.println("findMember.getId() = " + findMember.getId());

            Hibernate.initialize(findMember);

            tx.commit();
        } catch (Exception e) {
            tx.rollback();
            System.out.println(e.getMessage());
        } finally {
            em.close();
        }
        emf.close();
    }
}
