package py.enterprisesoft.api.model.medical;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import py.enterprisesoft.api.model.general.General;

@Entity
public class Turno extends General {

	private String descripcion;// = mañana,tarde,noche

	private Date horaInicio;

	private Date horaFin;

	private String dia;

	private Integer cantidadNumero;

	private String estado;

	@ManyToOne
	private Medico medico;
	

	@ManyToOne
	private Consultorio consultorio;

	@OneToMany(mappedBy="turno")
	private List<Cita> citas;


	public Turno() {
		super();
		
		this.descripcion = "";
		this.horaInicio =new Date();
		this.horaFin =new Date();
		this.dia ="";
		this.cantidadNumero =0;
		this.estado ="";
		
		
		//No inicialize los objetos correspondiente a las relaciones
		//por que obligaria a tener registrados dicha entidad al persistir mediante hibernate
	}


	public Turno(String descripcion, Date horaInicio, Date horaFin, String dia, Integer cantidadNumero, String estado,
			Medico medico, Consultorio consultorio, List<Cita> citas) {
		super();
		this.descripcion = descripcion;
		this.horaInicio = horaInicio;
		this.horaFin = horaFin;
		this.dia = dia;
		this.cantidadNumero = cantidadNumero;
		this.estado = estado;
		this.medico = medico;
		this.consultorio = consultorio;
		this.citas = citas;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public Date getHoraInicio() {
		return horaInicio;
	}


	public void setHoraInicio(Date horaInicio) {
		this.horaInicio = horaInicio;
	}


	public Date getHoraFin() {
		return horaFin;
	}


	public void setHoraFin(Date horaFin) {
		this.horaFin = horaFin;
	}


	public String getDia() {
		return dia;
	}


	public void setDia(String dia) {
		this.dia = dia;
	}


	public Integer getCantidadNumero() {
		return cantidadNumero;
	}


	public void setCantidadNumero(Integer cantidadNumero) {
		this.cantidadNumero = cantidadNumero;
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


	public Consultorio getConsultorio() {
		return consultorio;
	}


	public void setConsultorio(Consultorio consultorio) {
		this.consultorio = consultorio;
	}


	public List<Cita> getCitas() {
		return citas;
	}


	public void setCitas(List<Cita> citas) {
		this.citas = citas;
	}


	@Override
	public String toString() {
		return "Turno [descripcion=" + descripcion + ", horaInicio=" + horaInicio + ", horaFin=" + horaFin + ", dia="
				+ dia + ", cantidadNumero=" + cantidadNumero + ", estado=" + estado + ", medico=" + medico
				+ ", consultorio=" + consultorio + "]";
	}


	

}
