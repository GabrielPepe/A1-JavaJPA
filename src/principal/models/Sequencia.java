package principal.models;

import jakarta.persistence.*;

@Entity
@Table(name="TabSequencia")
public class Sequencia {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private String sequencia;
	
	//Relação Many to One:
	@ManyToOne
	private Individuo individuo;

	public Individuo getIndividuo() {
		return individuo;
	}

	public void setIndividuo(Individuo individuo) {
		this.individuo = individuo;
	}
	/////////////////////
	
	//Getters and setters: 
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSequencia() {
		return sequencia;
	}

	public void setSequencia(String sequencia) {
		this.sequencia = sequencia;
	}
	/////////////////////

	
	//Construtor:
	public Sequencia(String sequencia) {
		super();
		this.sequencia = sequencia;
	}

	public Sequencia() {
	}
	
	
}
