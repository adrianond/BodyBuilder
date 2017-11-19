package br.com.bodybuilder.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Exercicios {
    
	@Id
	@GeneratedValue
	@Column(name = "Id", nullable = false, unique = true)
	/** variavel id **/
	private int id;
	
	@Column(name = "Biceps", nullable = true, unique = false)
	/** variavel   biceps **/
	private String biceps = null;
	
	@Column(name = "Peito", nullable = true, unique = false)
	/** variavel  peito **/
	private String peito = null;
	
	@Column(name = "Costas", nullable = true, unique = false)
	/** variavel Observacao**/
	private String costas = null;
	
	@Column(name = "Triceps", nullable = true, unique = false)
	/** variavel Observacao**/
	private String triceps = null;
	
	@Column(name = "Ombro", nullable = true, unique = false)
	/** variavel Observacao**/
	private String ombro = null;
	
	@Column(name = "Perna", nullable = true, unique = false)
	/** variavel Observacao**/
	private String perna = null;
	
	/**
	 * Cosntrutor Padrão
	 */
	public Exercicios(){
		
	}
	

    /**
     * 
     * @return
     */
	public int getId() {
		return id;
	}

    /**
     * 
     * @param id
     */
	public void setId(int id) {
		this.id = id;
	}

    /**
     * 
     * @return
     */
	public String getBiceps() {
		return biceps;
	}

    /**
     * 
     * @param biceps
     */
	public void setBiceps(String biceps) {
		this.biceps = biceps;
	}

    /**
     * 
     * @return
     */
	public String getPeito() {
		return peito;
	}

    /**
     * 
     * @param peito
     */
	public void setPeito(String peito) {
		this.peito = peito;
	}
	
	/**
	 * 
	 * @return
	 */
	public String getCostas() {
		return costas;
	}
    
	/**
	 * 
	 * @param costas
	 */
	public void setCostas(String costas) {
		this.costas = costas;
	}

    /**
     * 
     * @return
     */
	public String getTriceps() {
		return triceps;
	}

    /**
     * 
     * @param triceps
     */
	public void setTriceps(String triceps) {
		this.triceps = triceps;
	}

    /**
     * 
     * @return
     */
	public String getOmbro() {
		return ombro;
	}

    /**
     * 
     * @param ombro
     */
	public void setOmbro(String ombro) {
		this.ombro = ombro;
	}

    /**
     * 
     * @return
     */
	public String getPerna() {
		return perna;
	}

    /**
     * 
     * @param perna
     */
	public void setPerna(String perna) {
		this.perna = perna;
	}
	
	
}
