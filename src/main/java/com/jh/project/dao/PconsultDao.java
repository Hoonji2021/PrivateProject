package com.jh.project.dao;

import java.util.List;

import com.jh.project.model.Pconsult;

public interface PconsultDao {

	List<Pconsult> pconsultList(Pconsult pconsult);

	int pconsultTotal();
	
}
