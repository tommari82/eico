/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.tmsoft.eico.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * @author Tomas
 */
@Entity
@Table(catalog = "EICO", schema = "EICO_HP14")
@XmlRootElement
public class Person implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PERSONSEQ")
	@SequenceGenerator(name = "PERSONSEQ", sequenceName = "eico_hp14.sq_person", initialValue = 1, schema = "eico_hp14", allocationSize = 1)

	@Basic(optional = false)
	@Column(nullable = false)
	private Long id;
	@Column(length = 32)
	private String firstname;
	@Column(length = 32)
	private String surname;
	@Column(length = 32)
	private String nickname;
	@Column(length = 2)
	private String type;
	private Integer points;
	@JoinColumn(name = "ID_COLAGE", referencedColumnName = "ID")
	@ManyToOne
	private Colage idColage;
	@OneToMany(mappedBy = "idPerson")
	private List<Messages> messagesList;

	public Person() {
	}

	public Person(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getPoints() {
		return points;
	}

	public void setPoints(Integer points) {
		this.points = points;
	}

	public Colage getIdColage() {
		return idColage;
	}

	public void setIdColage(Colage idColage) {
		this.idColage = idColage;
	}

	@XmlTransient
	public List<Messages> getMessagesList() {
		return messagesList;
	}

	public void setMessagesList(List<Messages> messagesList) {
		this.messagesList = messagesList;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (id != null ? id.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof Person)) {
			return false;
		}
		Person other = (Person) object;
		if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "org.tmsoft.eico.entity.Person[ id=" + id + " ]";
	}

}
