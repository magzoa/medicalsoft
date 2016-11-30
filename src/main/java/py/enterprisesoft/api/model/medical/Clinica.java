package py.enterprisesoft.api.model.medical;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import py.enterprisesoft.api.model.general.General;

@Entity
public class Clinica extends General {

	private String descripcion;

	private String direccion;

	private String telefono;

	private String correo;

	private Integer cuota;

	private String celular;

	private String estado;

	@OneToMany(mappedBy="clinica")
	private List<Consultorio> consultorios;
	
	@OneToMany(mappedBy="clinica")
	private List<Administrador> administradores;

	public Clinica() {
		this.descripcion = "";
		this.direccion = "";
		this.telefono = "";
		this.correo = "";
		this.cuota = 0;
		this.celular = "";
		this.estado = "";
		
		
		//No inicialize los objetos correspondiente a las relaciones
		//por que obligaria a tener registrados dicha entidad al persistir mediante hibernate
	}

	public Clinica(String descripcion, String direccion, String telefono, String correo, Integer cuota, String celular,
			String estado, List<Consultorio> consultorios, List<Administrador> administradores) {
		super();
		this.descripcion = descripcion;
		this.direccion = direccion;
		this.telefono = telefono;
		this.correo = correo;
		this.cuota = cuota;
		this.celular = celular;
		this.estado = estado;
		this.consultorios = consultorios;
		this.administradores = administradores;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public Integer getCuota() {
		return cuota;
	}

	public void setCuota(Integer cuota) {
		this.cuota = cuota;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public List<Consultorio> getConsultorios() {
		return consultorios;
	}

	public void setConsultorios(List<Consultorio> consultorios) {
		this.consultorios = consultorios;
	}

	public List<Administrador> getAdministradores() {
		return administradores;
	}

	public void setAdministradores(List<Administrador> administradores) {
		this.administradores = administradores;
	}

	@Override
	public String toString() {
		return "Clinica [descripcion=" + descripcion + ", direccion=" + direccion + ", telefono=" + telefono
				+ ", correo=" + correo + ", cuota=" + cuota + ", celular=" + celular + ", estado=" + estado + "]";
	}

	
//No realizo el toString de las listas por que
	//podria ocurrir el problema de recursividad infinita
	

	
	

}
