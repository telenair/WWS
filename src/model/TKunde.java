package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;

// test123

/**
 * The persistent class for the t_kunde database table.
 * 
 */
@Entity
@Table(name="t_kunde")
@NamedQuery(name="TKunde.findAll", query="SELECT t FROM TKunde t")
public class TKunde implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="customer_id")
	private int customerId;

	private String customermatchcode;

	@Column(name="first_name")
	private String firstName;

	@Column(name="last_name")
	private String lastName;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="last_update")
	private Date lastUpdate;

	public TKunde() {
	}

	public int getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomermatchcode() {
		return this.customermatchcode;
	}

	public void setCustomermatchcode(String customermatchcode) {
		this.customermatchcode = customermatchcode;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getLastUpdate() {
		return this.lastUpdate;
	}

	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

}