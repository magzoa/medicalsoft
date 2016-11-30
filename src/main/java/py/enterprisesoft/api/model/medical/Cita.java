package py.enterprisesoft.api.model.medical;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import py.enterprisesoft.api.model.general.General;

@Entity
public class Cita extends General {

	private Date fechaHora;

	private String estado;// = cancelado-pendiente-confirmado

	private Integer ordenAtencion;

	@ManyToOne
	private Paciente paciente;

	@ManyToOne
	private Turno turno;

	public Cita() {
		this.fechaHora = new Date();
		this.estado = "";
		this.ordenAtencion = 0;
		
		//No inicialize los objetos correspondiente a las relaciones
		//por que obligaria a tener registrados dicha entidad al persistir mediante hibernate
		
	}

	public Cita(Date fechaHora, String estado, Integer ordenAtencion, Paciente paciente, Turno turno) {
		super();
		this.fechaHora = fechaHora;
		this.estado = estado;
		this.ordenAtencion = ordenAtencion;
		this.paciente = paciente;
		this.turno = turno;
	}

	public Date getFechaHora() {
		return fechaHora;
	}

	public void setFechaHora(Date fechaHora) {
		this.fechaHora = fechaHora;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Integer getOrdenAtencion() {
		return ordenAtencion;
	}

	public void setOrdenAtencion(Integer ordenAtencion) {
		this.ordenAtencion = ordenAtencion;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public Turno getTurno() {
		return turno;
	}

	public void setTurno(Turno turno) {
		this.turno = turno;
	}

	@Override
	public String toString() {
		return "Cita [fechaHora=" + fechaHora + ", estado=" + estado + ", ordenAtencion=" + ordenAtencion
				+ ", paciente=" + paciente + ", turno=" + turno + "]";
	}

	
	

}
