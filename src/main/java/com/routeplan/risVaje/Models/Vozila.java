package com.routeplan.risVaje.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Vozila {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;


	private TipVozila tip;
	private String model;
	private String proizvajalec;

	public void Vozilo() {
		// TODO - implement Vozila.Vozilo
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param tip
	 * @param model
	 * @param proizvajalec
	 */
	private boolean dodajVozilo(TipVozila tip, String model, String proizvajalec) {
		// TODO - implement Vozila.dodajVozilo
		throw new UnsupportedOperationException();
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getProizvajalec() {
		return proizvajalec;
	}

	public void setProizvajalec(String proizvajalec) {
		this.proizvajalec = proizvajalec;
	}

	public TipVozila getTip() {
		return tip;
	}

	public  void setTip(TipVozila tip){
		this.tip = tip;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}