package com.jh.project.dao;

import java.util.List;

import com.jh.project.model.Pconsult;

public interface PconsultDao {

	List<Pconsult> pconsultList(Pconsult pconsult);

	int pconsultTotal();

	void pconsultInsert(Pconsult pconsult);

	Pconsult p_DetailInfo(int pnum);

	void pconsultUpdatePro(Pconsult pconsult);
	
}
