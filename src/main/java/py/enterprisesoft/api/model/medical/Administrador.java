package py.enterprisesoft.api.model.medical;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import py.enterprisesoft.api.model.general.Persona;

@Entity
public class Administrador extends Persona {

	private String estado;

	private String pass;

	@ManyToOne
	private Clinica clinica;

	public Administrador() {
		
		this.estado = "";
		this.pass = "";
		//No inicialize los objetos correspondiente a las relaciones
	//por que obligaria a tener registrados dicha entidad al persistir mediante hibernate

	}

	
	
	public Administrador(String estado, String pass, Clinica clinica) {
		super();
		this.estado = estado;
		this.pass = pass;
		this.clinica = clinica;
	}



	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public Clinica getClinica() {
		return clinica;
	}

	public void setClinica(Clinica clinica) {
		this.clinica = clinica;
	}

	@Override
	public String toString() {
		return "Administrador [estado=" + estado + ", pass=" + pass + ", clinica=" + clinica + "]";
	}
	
	
	
}
