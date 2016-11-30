package py.enterprisesoft.api.model.medical;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import py.enterprisesoft.api.model.general.General;

@Entity
public class Curso extends General {

	private String descripcion;

	private Date fechaInicio;

	private Date fechaFin;

	private String institucion;

	private String direccion;
	
	private String estado;
	
	@ManyToOne
	private Medico medico;

	public Curso() {

		this.descripcion = "";
		this.fechaInicio = new Date();
		this.fechaFin = new Date();
		this.institucion ="";
		this.direccion ="";
		this.estado="";
		//No inicialize los objetos correspondiente a las relaciones
		//por que obligaria a tener registrados dicha entidad al persistir mediante hibernate
		
	}

	
	
	public Curso(String descripcion, Date fechaInicio, Date fechaFin, String institucion, String direccion,
			String estado, Medico medico) {
		super();
		this.descripcion = descripcion;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.institucion = institucion;
		this.direccion = direccion;
		this.estado = estado;
		this.medico = medico;
	}



	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Date getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}

	public String getInstitucion() {
		return institucion;
	}

	public void setInstitucion(String institucion) {
		this.institucion = institucion;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	@Override
	public String toString() {
		return "Curso [descripcion=" + descripcion + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin
				+ ", institucion=" + institucion + ", direccion=" + direccion + ", estado=" + estado + ", medico="
				+ medico + "]";
	}
	
	

	

}
