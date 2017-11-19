package br.com.bodybuilder.controller.bean;

import java.util.HashMap;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import br.com.bodybuilder.model.Aluno;

@ManagedBean(name = "cadastroAlunoBean")
@RequestScoped
public class CadastroAlunoBean {
	
	/** Map de estados **/
	private Map<String, String> estados = null;
	/** Map de sexo aluno **/
	private Map<String, String> sexoAluno = null;
   /** instância aluno**/
	private Aluno aluno = null;
	/** Map tipo de plano  **/
	private Map<String, String> plano = null;
	
	

	/**
	 * Construtor Padrão
	 */
	public CadastroAlunoBean() {
		gerarMapas();
		aluno = new Aluno();
	}
	
	/**
	 * 
	 * @return
	 */
	public String cadastarNovoAluno(){
		aluno.inserirAluno(aluno);
		return "";
	}
   
	/**
	 * Gera os mapas para preencher os componentes selectOneMenu
	 */
	private void gerarMapas() {
		estados = new HashMap<String, String>();
		sexoAluno = new HashMap<String, String>();
		plano = new HashMap<String, String>();
		estados = iniciarDadosEstados(estados);
		sexoAluno.put("Masculino", "Masculino");
		sexoAluno.put("Feminino", "Feminino");
		plano.put("Mensal", "Mensal");
		plano.put("Anual", "Anual");
	}

	
	/**
	 * 
	 * @return
	 */
	private Map<String, String> iniciarDadosEstados(Map<String, String> states) {
		states.put("São Paulo", "São Paulo");
		states.put("Rio de Janeiro", "Rio de Janeiro");
		states.put("Santa Catarina", "Santa Catarina");
		states.put("Parana", "Parana");
		states.put("Minas Gerais", "Minas Gerais");

		return states;
	}

	/**
	 * Inicia inclusão de aluno novo
	 */
	public String incluir() {

		return "";
	}
    
	/**
	 * 
	 * @return
	 */
	public Map<String, String> getEstados() {
		return estados;
	}
    
	/**
	 * 
	 * @param estados
	 */
	public void setEstados(Map<String, String> estados) {
		this.estados = estados;
	}
	
	
	/**
	 * 
	 * @return
	 */
	public Aluno getAluno() {
		return aluno;
	}
    
	/**
	 * 
	 * @param aluno
	 */
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	
	/**
	 * 
	 * @return
	 */
	public Map<String, String> getSexoAluno() {
			return sexoAluno;
	}
    
	/**
	 * 
	 * @param sexoAluno
	 */
	public void setSexoAluno(Map<String, String> sexoAluno) {
			this.sexoAluno = sexoAluno;
   }
	
   /**
    * 	
    * @return
    */
   public Map<String, String> getPlano() {
		return plano;
	}
  
  /**
   *  
   * @param plano
   */
  public void setPlano(Map<String, String> plano) {
		this.plano = plano;
	}
  
}
