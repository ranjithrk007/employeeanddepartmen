package com.auxo.springboot.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
@Entity
@Table(name = "department")
@EntityListeners(AuditingEntityListener.class)
public class Department {
	@Id
	@Column(name = "id")
	private long dprtid;
	@Column(name = "name")
	private String role;	
	public long getDprtid() {
		return dprtid;
	}
	public void setDprtid(long dprtid) {
		this.dprtid = dprtid;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
}