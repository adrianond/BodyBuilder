package br.com.bodybuilder.service.impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

import br.com.bodybuilder.database.Dao;
import br.com.bodybuilder.model.Aluno;
import br.com.bodybuilder.model.Exercicios;
import br.com.bodybuilder.service.BodyBuilderInterfaceBD;

public class BodyBuilderBD extends Dao implements BodyBuilderInterfaceBD {
	
	//EntityManagerFactory emf = Persistence.createEntityManagerFactory("bodyBuilder");
    //EntityManager em = emf.createEntityManager();
    
    /**
     * Default constructor. 
     */
    public BodyBuilderBD() {
    	
       
    }

	  
	
     /**
	 * Retorna lista com a sÃ©rie de treino do aluno
	 */
	
	//public List<?> consultarTreino(AlunoEjb alunoEjb) {
		/** Variavel connect **//*
		Connection connect = null;
		*//** Variavel de conexão **//*
		ObterConexaoDB conexao = new ObterConexaoDB();
		
		
		connect = conexao.getConnection();

		if (!alunoEjb.getNome().equals(CosntantesUtils.STRING_VAZIA)) {
			// select através do nome + data - Senão informar nome completo e houver mais de um nome igual, abre uma grid para selecionar o nome do aluno
		} else if (!alunoEjb.getCPF().equals(CosntantesUtils.STRING_VAZIA)) {
			// select através do cpf
		} else {
			// select através do numero de matricula + data
		}
		try {
			connect.close();
		} catch (SQLException e) {
			System.out.println(e);
			e.printStackTrace();
		}*/
		
		//return null;
	//}


    /**
     * Aluno aluno
     */
	@Override
	public boolean inserirNovoAluno(Aluno aluno) {
		//obtendo o EntityManager
		EntityManager em = getEntityManager();
		try {
			// begin transaction 
		    em.getTransaction().begin();
			//faz a persistencia
			em.persist(aluno);
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
	
	
	/**
     * Aluno aluno
     */
	@Override
	public Exercicios obterExercicioIncluido(String musculo, String exercicio) {
		//obtendo o EntityManager
		EntityManager em = getEntityManager();
		try {
			Exercicios newExercise = (Exercicios) em.createQuery("SELECT u from Exercicios u where u.musculo = :musculo and u.exercicio = :exercicio")
			.setParameter("musculo", musculo)
			.setParameter("exercicio", exercicio).getSingleResult();
			return newExercise;
		} catch (NoResultException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	/**
     * IncluirExercicioModel novoExercicio
     */
	@Override
	public boolean inserirNovoExercicio(Exercicios novoExercicio) {
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
