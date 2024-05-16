package com.kraft.entities;

import java.io.Serializable;
import jakarta.persistence.*;


/**
 * The persistent class for the araba database table.
 * 
 */
@Entity
@Table(name="araba")
@NamedQuery(name="Araba.findAll", query="SELECT a FROM Araba a")
public class Araba implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

	private Integer fiyat;

	private Integer kapisayisi;

	private Integer kasaid;

	private Integer markaid;

	private Integer modelid;

	private Integer penceresayisi;

	public Araba() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getFiyat() {
		return this.fiyat;
	}

	public void setFiyat(Integer fiyat) {
		this.fiyat = fiyat;
	}

	public Integer getKapisayisi() {
		return this.kapisayisi;
	}

	public void setKapisayisi(Integer kapisayisi) {
		this.kapisayisi = kapisayisi;
	}

	public Integer getKasaid() {
		return this.kasaid;
	}

	public void setKasaid(Integer kasaid) {
		this.kasaid = kasaid;
	}

	public Integer getMarkaid() {
		return this.markaid;
	}

	public void setMarkaid(Integer markaid) {
		this.markaid = markaid;
	}

	public Integer getModelid() {
		return this.modelid;
	}

	public void setModelid(Integer modelid) {
		this.modelid = modelid;
	}

	public Integer getPenceresayisi() {
		return this.penceresayisi;
	}

	public void setPenceresayisi(Integer penceresayisi) {
		this.penceresayisi = penceresayisi;
	}

}