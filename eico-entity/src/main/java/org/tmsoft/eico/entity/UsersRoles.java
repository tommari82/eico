/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.tmsoft.eico.entity;

import java.io.Serializable;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Tomas
 */
@Entity
@Table(name = "USERS_ROLES", catalog = "EICO", schema = "EICO_HP14")
@XmlRootElement
public class UsersRoles implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "USERSROLESSEQ")
	@SequenceGenerator(name="USERSROLESSEQ", sequenceName = "eico_hp14.sq_users_roles", initialValue = 1,
			schema = "eico_hp14",
			allocationSize = 1)
	@Basic(optional = false)
    @Column(nullable = false)
    private Long id;
    @JoinColumn(name = "ID_USERS", referencedColumnName = "ID")
    @ManyToOne
    private Users idUsers;
    @JoinColumn(name = "ID_ROLES", referencedColumnName = "ID")
    @ManyToOne
    private Roles idRoles;

    public UsersRoles() {
    }

    public UsersRoles(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Users getIdUsers() {
        return idUsers;
    }

    public void setIdUsers(Users idUsers) {
        this.idUsers = idUsers;
    }

    public Roles getIdRoles() {
        return idRoles;
    }

    public void setIdRoles(Roles idRoles) {
        this.idRoles = idRoles;
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
        if (!(object instanceof UsersRoles)) {
            return false;
        }
        UsersRoles other = (UsersRoles) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.tmsoft.eico.entity.UsersRoles[ id=" + id + " ]";
    }
    
}
