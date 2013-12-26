/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.tmsoft.eico.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author OKAY PC
 */
@Entity
@Table(catalog = "EICO", schema = "EICO_HP14")
@XmlRootElement
public class Messages implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
	@GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "MESSAGESEQ")
	@SequenceGenerator(name="MESSAGESEQ", sequenceName = "eico_hp14.sq_messages", initialValue = 1, schema = "eico_hp14", allocationSize = 1)
	@Basic(optional = false)
    @Column(nullable = false)
    private Long id;
    @Column(length = 10240)
    private String text;
    @Temporal(TemporalType.TIMESTAMP)
    private Date instime;
    @JoinColumn(name = "ID_PERSON", referencedColumnName = "ID")
    @ManyToOne
    private Person idPerson;

    public Messages() {
    }

    public Messages(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getInstime() {
        return instime;
    }

    public void setInstime(Date instime) {
        this.instime = instime;
    }

    public Person getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(Person idPerson) {
        this.idPerson = idPerson;
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
        if (!(object instanceof Messages)) {
            return false;
        }
        Messages other = (Messages) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tmsoft.eico.entity.Messages[ id=" + id + " ]";
    }
    
}
