package com.jh.project.service;

import java.util.List;

import com.jh.project.model.Pconsult;

public interface Pconsult_Ser {

	List<Pconsult> pconsultAll(Pconsult pconsult);

	int pconsultTotal();

	void pconsultInsert(Pconsult pconsult);

	Pconsult DetailInfo(int pnum);

	void pconsultUpdatePro(Pconsult pconsult);

	
	
}
