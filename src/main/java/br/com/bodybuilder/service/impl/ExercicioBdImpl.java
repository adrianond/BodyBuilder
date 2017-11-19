package br.com.bodybuilder.service.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;

import br.com.bodybuilder.database.Dao;
import br.com.bodybuilder.model.Exercicios;
import br.com.bodybuilder.service.ExercicioInterfaceBd;

public class ExercicioBdImpl extends Dao implements ExercicioInterfaceBd {
	
	
	/**
	 * String musculo
	 */
	
	public List<String> selecionaExercicio(String musculo) {
		//obtendo o EntityManager
		EntityManager em = getEntityManager();
		// begin transaction 
		em.getTransaction().begin();
		try {
		List<String> listExercicio = ((List<String>) em.createQuery("SELECT "+musculo.toLowerCase()+" from Exercicios").getResultList());
		return listExercicio;
		} catch (NoResultException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	/**
	 * Exercicios novoExercicio
	 */
	public boolean inserirExercicio(Exercicios novoExercicio) {
		//obtendo o EntityManager
		EntityManager em = getEntityManager();
		try {
		// begin transaction 
		em.getTransaction().begin();
		//faz a persistencia
		em.persist(novoExercicio);
		// flush em - save to DB
		em.flush();
		// commit transaction at all
		em.getTransaction().commit();
		//fecha banco
		em.close();
		return true;
		} catch (Exception e) {
		e.printStackTrace();
		return false;
	  }
   }
}