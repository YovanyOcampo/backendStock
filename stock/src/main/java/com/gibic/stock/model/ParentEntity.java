package com.gibic.stock.model;

import java.io.Serializable;
import javax.persistence.*;

@MappedSuperclass
@Access(AccessType.FIELD)
public class ParentEntity implements Serializable {
	

	private static final long serialVersionUID = 5245835302524864905L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id", unique=true, nullable=false)
	private Long id;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
}
