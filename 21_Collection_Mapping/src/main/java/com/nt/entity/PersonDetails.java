package com.nt.entity;

import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapKeyColumn;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PersonDetails {

	@Id
	@GeneratedValue
	private Integer pid;
	private String pname;
	@ElementCollection
	@CollectionTable(name = "friendlist",joinColumns = @JoinColumn(name = "bridge",referencedColumnName = "pid"))
	
	private List<String> friendlist;
	@ElementCollection
	@CollectionTable(name="Mobiledata",joinColumns = @JoinColumn(name =   "bridge",referencedColumnName = "pid"))
	private Set<Long> mobNo;
	@ElementCollection
	@CollectionTable(name="IDDetials",joinColumns = @JoinColumn(name = "bridge",referencedColumnName = "pid"))
	@MapKeyColumn(name = "IDproofname")
	private Map<String,String> iddetails;
}
