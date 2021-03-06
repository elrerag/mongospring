package cl.lherrera.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Producto implements Serializable {

	private static final long serialVersionUID = 5544554267037482317L;

	@Id
	private String id;
	private String nombre;
	private String marca;
	private String precio;
	private String urlImg;

	@DBRef
	private Set<Canasta> canastas = new HashSet<>();

	public Producto(String id, String nombre, String marca, String precio, String urlImg, Set<Canasta> canastas) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.marca = marca;
		this.precio = precio;
		this.urlImg = urlImg;
		this.canastas = canastas;
	}

	public Producto() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getPrecio() {
		return precio;
	}

	public void setPrecio(String precio) {
		this.precio = precio;
	}

	public String getUrlImg() {
		return urlImg;
	}

	public void setUrlImg(String urlImg) {
		this.urlImg = urlImg;
	}

	public Set<Canasta> getCanastas() {
		return canastas;
	}

	public void setCanastas(Set<Canasta> canastas) {
		this.canastas = canastas;
	}

	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", marca=" + marca + ", precio=" + precio + ", urlImg="
				+ urlImg + ", canastas=" + canastas + "]";
	}

}
