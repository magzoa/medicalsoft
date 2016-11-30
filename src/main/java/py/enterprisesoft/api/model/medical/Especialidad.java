package py.enterprisesoft.api.model.medical;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import py.enterprisesoft.api.model.general.General;

@Entity
public class Especialidad extends General {

	private String descripcion;

	private String obs;

	@OneToMany(mappedBy="especialidad")
	private List<Medico> medicos;

	public Especialidad() {

		this.descripcion = "";
		this.obs = "";
		
		
		//No inicialize los objetos correspondiente a las relaciones
		//por que obligaria a tener registrados dicha entidad al persistir mediante hibernate
		
	}

	
	
	public Especialidad(String descripcion, String obs, List<Medico> medicos) {
		super();
		this.descripcion = descripcion;
		this.obs = obs;
		this.medicos = medicos;
	}



	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getObs() {
		return obs;
	}

	public void setObs(String obs) {
		this.obs = obs;
	}

	public List<Medico> getMedicos() {
		return medicos;
	}

	public void setMedicos(List<Medico> medicos) {
		this.medicos = medicos;
	}

	@Override
	public String toString() {
		return "Especialidad [descripcion=" + descripcion + ", obs=" + obs + "]";
	}
	
	
	
	
	
}
