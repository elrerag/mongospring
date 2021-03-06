package cl.lherrera.dto;

import java.io.IOException;
import java.io.Serializable;

public class AbstractDto<T, O> implements Serializable {

	private static final long serialVersionUID = -2468811679876395830L;

	public static final String SAVE_MSJ = "Ingresado o actualizado";
	public static final String DELETE_MSJ = "Eliminado";

	public static final Integer SAVE_CODE = 201;
	public static final Integer DELETE_CODE = 202;
	public static final Integer OK_CODE = 200;

	private Integer statusCode;
	private O auxData;
	private T data;
	private String menssaje;

	public AbstractDto(Integer statusCode, T data, O auxData, String menssaje) {
		super();
		this.statusCode = statusCode;
		this.data = data;
		this.auxData = auxData;
		this.menssaje = menssaje;
	}

	public AbstractDto() {
	}

	/**
	 * se controla la serjialización de los tipo T, O
	 */
	private void writeObject(java.io.ObjectOutputStream out) throws IOException {
	}

	/**
	 * se controla la serjialización de los tipo T, O
	 */
	private void readObject(java.io.ObjectInputStream in) throws IOException, ClassNotFoundException {
	}

	@Override
	public String toString() {
		return "AbstractDto [statusCode=" + statusCode + ", data=" + data + ", auxData=" + auxData + ", menssaje="
				+ menssaje + "]";
	}

	public Integer getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(Integer statusCode) {
		this.statusCode = statusCode;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public O getAuxData() {
		return auxData;
	}

	public void setAuxData(O auxData) {
		this.auxData = auxData;
	}

	public String getMenssaje() {
		return menssaje;
	}

	public void setMenssaje(String menssaje) {
		this.menssaje = menssaje;
	}

}
