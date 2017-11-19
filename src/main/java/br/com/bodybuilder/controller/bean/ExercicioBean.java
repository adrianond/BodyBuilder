package br.com.bodybuilder.controller.bean;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import br.com.bodybuilder.constantes.ConstantesUtils;
import br.com.bodybuilder.model.Exercicios;
import br.com.bodybuilder.service.impl.ExercicioBdImpl;

@ManagedBean(name = "exercicioBean")
@RequestScoped
public class ExercicioBean {
	
		
	/** variavel incluirExercicio **/
	private Exercicios incluirExercicio = null;
	
	/** Mapa de musculo **/
	private Map<String,String> mapaMusculo = null;
	
	/** Lista de exercicios incluidos **/
	private List <String> exercicioIncluido = null;
	
	/** variavel musculo **/
	private String musculo = "";
	
	/** variavel exercicio **/
	private String exercicio = "";
	
	/** variavel exercicioRetornoList **/
	private List<Exercicios> exercicioRetornoList = null;
	
	/**
	 * Construtor Padrão
	 */
	public ExercicioBean(){
		incluirExercicio = new Exercicios();
		//Lista para exibir os exercicios na tela
		exercicioRetornoList =  new ArrayList<Exercicios>();
		gerarMapa();
		
	}
    
	/**
	 * Gera o mapa de musculos
	 */
	public  void gerarMapa() {
		mapaMusculo = new HashMap<String, String>();
		mapaMusculo.put(ConstantesUtils.Peito,ConstantesUtils.Peito);
		mapaMusculo.put(ConstantesUtils.Biceps,ConstantesUtils.Biceps);
		mapaMusculo.put(ConstantesUtils.Costas,ConstantesUtils.Costas);
		mapaMusculo.put(ConstantesUtils.Triceps,ConstantesUtils.Triceps);
		mapaMusculo.put(ConstantesUtils.Ombro,ConstantesUtils.Ombro);
		mapaMusculo.put(ConstantesUtils.Perna,ConstantesUtils.Perna);
	}
	
	/**
	 * Inseri um novo exercicio na base
	 */
	public void gravar(){
		ExercicioBdImpl incluir = new ExercicioBdImpl();
		if(this.musculo.equals(ConstantesUtils.Peito)){
			incluirExercicio.setPeito(this.exercicio);
		}if(this.musculo.equals(ConstantesUtils.Biceps)){
			incluirExercicio.setBiceps(this.exercicio);
		}if(this.musculo.equals(ConstantesUtils.Costas)){
			incluirExercicio.setCostas(this.exercicio);
		}if(this.musculo.equals(ConstantesUtils.Triceps)){
			incluirExercicio.setTriceps(this.exercicio);
		}if(this.musculo.equals(ConstantesUtils.Ombro)){
			incluirExercicio.setOmbro(this.exercicio);
		}if(this.musculo.equals(ConstantesUtils.Perna)){
			incluirExercicio.setPerna(this.exercicio);
		}
		incluir.inserirExercicio(incluirExercicio);
	}
	
    /**
     * 	   
     * @param incluirExercicio
     * @return
     */
	public String listarExercicio() {
		ExercicioBdImpl seleciona = new ExercicioBdImpl();
		//Lista de exercicio cadastrado
		exercicioIncluido = new ArrayList<String>();
		exercicioIncluido =  seleciona.selecionaExercicio(musculo);
		
		exercicioRetornoList = caregarLista(exercicioIncluido);
		return "";
   }
    
	/**
	 * 
	 * @param exercicioIncluido
	 */
	private List<Exercicios> caregarLista(List <String>exercicioIncluido) {
		List<Exercicios> listRetorno = new ArrayList<Exercicios>();
		for (int i = 0; i < exercicioIncluido.size(); i++) {
		  if (musculo.equals(ConstantesUtils.Peito)) {
		  // objeto com os exercicios incluidos
		  Exercicios retorno = new Exercicios();
		  retorno.setPeito(exercicioIncluido.get(i));
		  listRetorno.add(retorno);
	      }
		  else if (musculo.equals(ConstantesUtils.Biceps)) {
		  // objeto com os exercicios incluidos
		  Exercicios retorno = new Exercicios();
		  retorno.setBiceps(exercicioIncluido.get(i));
		  listRetorno.add(retorno);
		}
	 }
		return listRetorno;
   }

	/**
	 * 
	 * @return
	 */
	public Exercicios getIncluirExercicio() {
		return incluirExercicio;
	}
    
	/**
	 * 
	 * @param musculo
	 */
	public void setIncluirExercicio(Exercicios incluirExercicio) {
		this.incluirExercicio = incluirExercicio;
	}
    
	/**
	 * 
	 * @return
	 */
	public Map<String, String> getMapaMusculo() {
		return mapaMusculo;
	}
    
	/***
	 * 
	 * @param mapaMusculo
	 */
	public void setMapaMusculo(Map<String, String> mapaMusculo) {
		this.mapaMusculo = mapaMusculo;
	}
    
	/**
	 * 
	 * @return
	 */
	public List<String> getExercicioIncluido() {
		return exercicioIncluido;
	}
    
	/**
	 * 
	 * @param exercicioIncluido
	 */
	public void setExercicioIncluido(List<String> exercicioIncluido) {
		this.exercicioIncluido = exercicioIncluido;
	}
    
	/**
	 * 
	 * @return
	 */
	public String getMusculo() {
		return musculo;
	}
    
	/**
	 * 
	 * @param musculo
	 */
	public void setMusculo(String musculo) {
		this.musculo = musculo;
	}
    
	/**
	 * 
	 * @return
	 */
	public String getExercicio() {
		return exercicio;
	}
    
	/**
	 * 
	 * @param exercicio
	 */
	public void setExercicio(String exercicio) {
		this.exercicio = exercicio;
	}
    
	/**
	 * 
	 * @return
	 */
	public List<Exercicios> getExercicioRetornoList() {
		return exercicioRetornoList;
	}
    
	/**
	 * 
	 * @param exercicioRetornoList
	 */
	public void setExercicioRetornoList(List<Exercicios> exercicioRetornoList) {
		this.exercicioRetornoList = exercicioRetornoList;
	}
}
