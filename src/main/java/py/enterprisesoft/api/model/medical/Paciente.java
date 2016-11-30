package py.enterprisesoft.api.model.medical;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import py.enterprisesoft.api.model.general.Persona;

@Entity
public class Paciente extends Persona {

	private Date fechaNacimiento;

	private String pass;

	private String estado;

	@OneToMany(mappedBy="paciente")
	private List<Cita> citas;

	public Paciente() {
		this.fechaNacimiento = new Date();
		this.pass = "";
		this.estado = "";
		
		//No inicialize los objetos correspondiente a las relaciones
		//por que obligaria a tener registrados dicha entidad al persistir mediante hibernate
	}

	public Paciente(Date fechaNacimiento, String pass, String estado, List<Cita> citas) {
		super();
		this.fechaNacimiento = fechaNacimiento;
		this.pass = pass;
		this.estado = estado;
		this.citas = citas;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public List<Cita> getCitas() {
		return citas;
	}

	public void setCitas(List<Cita> citas) {
		this.citas = citas;
	}

	@Override
	public String toString() {
		return "Paciente [fechaNacimiento=" + fechaNacimiento + ", pass=" + pass + ", estado=" + estado + "]";
	}
	
	
	
	
	
}
