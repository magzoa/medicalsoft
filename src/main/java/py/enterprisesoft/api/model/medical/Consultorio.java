package py.enterprisesoft.api.model.medical;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import py.enterprisesoft.api.model.general.General;

@Entity
public class Consultorio extends General {

	private Integer numero;

	private String obs;

	private String estado;

	@ManyToOne
	private Clinica clinica;

	@OneToMany(mappedBy="consultorio")
	private List<Turno> turnos;

	public Consultorio() {

		super();
		this.numero = 0;
		this.obs = "";
		this.estado = "";
		//No inicialize los objetos correspondiente a las relaciones
		//por que obligaria a tener registrados dicha entidad al persistir mediante hibernate
	}

	public Consultorio(Integer numero, String obs, String estado, Clinica clinica, List<Turno> turnos) {
		super();
		this.numero = numero;
		this.obs = obs;
		this.estado = estado;
		this.clinica = clinica;
		this.turnos = turnos;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getObs() {
		return obs;
	}

	public void setObs(String obs) {
		this.obs = obs;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Clinica getClinica() {
		return clinica;
	}

	public void setClinica(Clinica clinica) {
		this.clinica = clinica;
	}

	public List<Turno> getTurnos() {
		return turnos;
	}

	public void setTurnos(List<Turno> turnos) {
		this.turnos = turnos;
	}

	@Override
	public String toString() {
		return "Consultorio [numero=" + numero + ", obs=" + obs + ", estado=" + estado + ", clinica=" + clinica + "]";
	}

	
	





	

}
