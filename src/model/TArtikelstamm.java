package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the t_artikelstamm database table.
 * 
 */
@Entity
@Table(name="t_artikelstamm")
@NamedQuery(name="TArtikelstamm.findAll", query="SELECT t FROM TArtikelstamm t")
public class TArtikelstamm implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idartikelnummer;

	@Temporal(TemporalType.DATE)
	private Date anlegedatum;

	private String artikelbeschreibung1;

	private String artikelbeschreibung2;

	private int artikelbreite;

	private int artikelgewicht;

	private int artikellaenge;

	private String artikelmatchcode;

	private String inventurpflichtig;

	@Temporal(TemporalType.TIMESTAMP)
	private Date letzteaenderung;

	private BigDecimal umrechnungsfaktor1;

	private BigDecimal umrechnungsfaktor2;

	private BigDecimal umrechnungsfaktor3;

	private BigDecimal umrechnungsfaktor4;

	private String umrechnungsfaktorme1;

	private String umrechnungsfaktorme2;

	private String umrechnungsfaktorme3;

	private String umrechnungsfaktorme4;

	public TArtikelstamm() {
	}

	public int getIdartikelnummer() {
		return this.idartikelnummer;
	}

	public void setIdartikelnummer(int idartikelnummer) {
		this.idartikelnummer = idartikelnummer;
	}

	public Date getAnlegedatum() {
		return this.anlegedatum;
	}

	public void setAnlegedatum(Date anlegedatum) {
		this.anlegedatum = anlegedatum;
	}

	public String getArtikelbeschreibung1() {
		return this.artikelbeschreibung1;
	}

	public void setArtikelbeschreibung1(String artikelbeschreibung1) {
		this.artikelbeschreibung1 = artikelbeschreibung1;
	}

	public String getArtikelbeschreibung2() {
		return this.artikelbeschreibung2;
	}

	public void setArtikelbeschreibung2(String artikelbeschreibung2) {
		this.artikelbeschreibung2 = artikelbeschreibung2;
	}

	public int getArtikelbreite() {
		return this.artikelbreite;
	}

	public void setArtikelbreite(int artikelbreite) {
		this.artikelbreite = artikelbreite;
	}

	public int getArtikelgewicht() {
		return this.artikelgewicht;
	}

	public void setArtikelgewicht(int artikelgewicht) {
		this.artikelgewicht = artikelgewicht;
	}

	public int getArtikellaenge() {
		return this.artikellaenge;
	}

	public void setArtikellaenge(int artikellaenge) {
		this.artikellaenge = artikellaenge;
	}

	public String getArtikelmatchcode() {
		return this.artikelmatchcode;
	}

	public void setArtikelmatchcode(String artikelmatchcode) {
		this.artikelmatchcode = artikelmatchcode;
	}

	public String getInventurpflichtig() {
		return this.inventurpflichtig;
	}

	public void setInventurpflichtig(String inventurpflichtig) {
		this.inventurpflichtig = inventurpflichtig;
	}

	public Date getLetzteaenderung() {
		return this.letzteaenderung;
	}

	public void setLetzteaenderung(Date letzteaenderung) {
		this.letzteaenderung = letzteaenderung;
	}

	public BigDecimal getUmrechnungsfaktor1() {
		return this.umrechnungsfaktor1;
	}

	public void setUmrechnungsfaktor1(BigDecimal umrechnungsfaktor1) {
		this.umrechnungsfaktor1 = umrechnungsfaktor1;
	}

	public BigDecimal getUmrechnungsfaktor2() {
		return this.umrechnungsfaktor2;
	}

	public void setUmrechnungsfaktor2(BigDecimal umrechnungsfaktor2) {
		this.umrechnungsfaktor2 = umrechnungsfaktor2;
	}

	public BigDecimal getUmrechnungsfaktor3() {
		return this.umrechnungsfaktor3;
	}

	public void setUmrechnungsfaktor3(BigDecimal umrechnungsfaktor3) {
		this.umrechnungsfaktor3 = umrechnungsfaktor3;
	}

	public BigDecimal getUmrechnungsfaktor4() {
		return this.umrechnungsfaktor4;
	}

	public void setUmrechnungsfaktor4(BigDecimal umrechnungsfaktor4) {
		this.umrechnungsfaktor4 = umrechnungsfaktor4;
	}

	public String getUmrechnungsfaktorme1() {
		return this.umrechnungsfaktorme1;
	}

	public void setUmrechnungsfaktorme1(String umrechnungsfaktorme1) {
		this.umrechnungsfaktorme1 = umrechnungsfaktorme1;
	}

	public String getUmrechnungsfaktorme2() {
		return this.umrechnungsfaktorme2;
	}

	public void setUmrechnungsfaktorme2(String umrechnungsfaktorme2) {
		this.umrechnungsfaktorme2 = umrechnungsfaktorme2;
	}

	public String getUmrechnungsfaktorme3() {
		return this.umrechnungsfaktorme3;
	}

	public void setUmrechnungsfaktorme3(String umrechnungsfaktorme3) {
		this.umrechnungsfaktorme3 = umrechnungsfaktorme3;
	}

	public String getUmrechnungsfaktorme4() {
		return this.umrechnungsfaktorme4;
	}

	public void setUmrechnungsfaktorme4(String umrechnungsfaktorme4) {
		this.umrechnungsfaktorme4 = umrechnungsfaktorme4;
	}

}