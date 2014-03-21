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
 *
 * @author Tomas
 */
@Entity
@Table(catalog = "EICO", schema = "EICO_HP14")
@XmlRootElement
public class Roles implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "ROLESSEQ")
	@SequenceGenerator(name="ROLESSEQ", sequenceName = "eico_hp14.sq_roles", initialValue = 1,
			schema = "eico_hp14",
			allocationSize = 1)

	@Basic(optional = false)
    @Column(nullable = false)
    private Long id;
    @Column(length = 10)
    private String code;
    @Column(length = 30)
    private String name;
    @OneToMany(mappedBy = "idRoles")
    private List<UsersRoles> usersRolesList;

    public Roles() {
    }

    public Roles(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlTransient
    public List<UsersRoles> getUsersRolesList() {
        return usersRolesList;
    }

    public void setUsersRolesList(List<UsersRoles> usersRolesList) {
        this.usersRolesList = usersRolesList;
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
        if (!(object instanceof Roles)) {
            return false;
        }
        Roles other = (Roles) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tmsoft.eico.entity.Roles[ id=" + id + " ]";
    }
    
}
