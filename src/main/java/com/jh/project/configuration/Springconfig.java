package com.jh.project.configuration;

import javax.persistence.EntityManager;
import javax.sql.DataSource;

import org.springframework.context.annotation.Configuration;

@Configuration
public class Springconfig {
	private DataSource ds;
	private EntityManager em;
	
	public Springconfig(DataSource ds, EntityManager em) {
		super();
		this.ds = ds;
		this.em = em;
	}
	
	
}
