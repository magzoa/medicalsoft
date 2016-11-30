package py.enterprisesoft.api.model.medical;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import py.enterprisesoft.api.model.general.Persona;

@Entity
public class Medico extends Persona {

	private String pass;

	private String foto;

	private Integer puntos;

	private String estado;


	@ManyToOne
	private Especialidad especialidad;
	
	@OneToMany(mappedBy="medico")
	private List<Turno> turnos;

	@OneToMany(mappedBy="medico")
	private List<Curso> cursos;


	public Medico() {
		this.pass = "";
		this.foto = "";
		this.puntos = 0;
		this.estado = "";
		
		//No inicialize los objetos correspondiente a las relaciones
		//por que obligaria a tener registrados dicha entidad al persistir mediante hibernate
	}


	public String getPass() {
		return pass;
	}


	public void setPass(String pass) {
		this.pass = pass;
	}


	public String getFoto() {
		return foto;
	}


	public void setFoto(String foto) {
		this.foto = foto;
	}


	public Integer getPuntos() {
		return puntos;
	}


	public void setPuntos(Integer puntos) {
		this.puntos = puntos;
	}


	public String getEstado() {
		return estado;
	}


	public void setEstado(String estado) {
		this.estado = estado;
	}


	public Especialidad getEspecialidad() {
		return especialidad;
	}


	public void setEspecialidad(Especialidad especialidad) {
		this.especialidad = especialidad;
	}


	public List<Turno> getTurnos() {
		return turnos;
	}


	public void setTurnos(List<Turno> turnos) {
		this.turnos = turnos;
	}


	public List<Curso> getCursos() {
		return cursos;
	}


	public void setCursos(List<Curso> cursos) {
		this.cursos = cursos;
	}


	@Override
	public String toString() {
		return "Medico [pass=" + pass + ", foto=" + foto + ", puntos=" + puntos + ", estado=" + estado
				+ ", especialidad=" + especialidad + "]";
	}

	
	
	}
