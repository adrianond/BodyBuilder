package br.com.bodybuilder.service;

import java.util.List;

import br.com.bodybuilder.model.Exercicios;

public interface ExercicioInterfaceBd {
	
	/**
     * Inseri novoExercicio na base
     * @param novoExercicio
     * @return
     */
    public boolean inserirExercicio(Exercicios novoExercicio);
    
    
    
	/**
	 * 
	 * @param musculo
	 * @return
	 */
	public List <String> selecionaExercicio(String musculo);

}
