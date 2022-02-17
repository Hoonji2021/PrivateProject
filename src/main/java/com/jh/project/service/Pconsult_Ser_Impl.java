package com.jh.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jh.project.dao.PconsultDao;
import com.jh.project.model.Pconsult;

@Service
public class Pconsult_Ser_Impl implements Pconsult_Ser {
	
	@Autowired
	private PconsultDao pdao;
	
	@Override
	public List<Pconsult> pconsultAll(Pconsult pconsult) {
		System.out.println("Pconsult_Ser_Impl pconsultAll");
		List<Pconsult> pconsult1 =  pdao.pconsultList(pconsult);
		
		return pconsult1;
	}

	@Override
	public int pconsultTotal() {
		System.out.println("Pconsult_Ser_Impl pconsultTotal()");
		int pconsultCnt = pdao.pconsultTotal();
		return pconsultCnt;
	}

	@Override
	public void pconsultInsert(Pconsult pconsult) {
		System.out.println("Pconsult_Ser_Impl pconsultInsert() start...");
		pdao.pconsultInsert(pconsult);
		
	}

	@Override
	public Pconsult DetailInfo(int pnum) {
		System.out.println("Pconsult_Ser_Impl DetailInfo() start...");
		Pconsult pconsult = pdao.p_DetailInfo(pnum);
		return pconsult;
	}

}
