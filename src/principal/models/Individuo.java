package principal.models;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name="TabIndividuo")
public class Individuo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private String codigo;
	@Column
	private String nome;
	
	//Relação One to Many
	@OneToMany
	List <Sequencia> sequencias = new ArrayList<>();

	public List<Sequencia> getSequencias() {
		return sequencias;
	}

	public void setSequencias(List<Sequencia> listas) {
		this.sequencias = listas;
	}
	//////////

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Individuo(String codigo, String nome, List<Sequencia> listas) {
		super();
		this.codigo = codigo;
		this.nome = nome;
	}

	public Individuo() {
		
	}
	
	
	
}
