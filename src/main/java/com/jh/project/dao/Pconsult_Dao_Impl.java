package com.jh.project.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jh.project.model.Pconsult;

@Repository
public class Pconsult_Dao_Impl implements PconsultDao {
	@Autowired
	private SqlSession session;
	
	@Override
	public List<Pconsult> pconsultList(Pconsult pconsult) {
		System.out.println("Pconsult_Dao_Impl pconsultList() start...");
		List<Pconsult> pconsultAll = session.selectList("pconsultAllInfo", pconsult);
		
		System.out.println("Pconsult_Dao_Impl pconsultList pconsultAll.size()->"+pconsultAll.size());
		return pconsultAll;
	}

	@Override
	public int pconsultTotal() {
		System.out.println("Pconsult_Dao_Impl pconsultTotal()");
		int totalCnt = session.selectOne("jhPconsultCnt");
		
		return totalCnt;
	}

	@Override
	public void pconsultInsert(Pconsult pconsult) {
		System.out.println("Pconsult_Dao_Impl pconsultInsert()");
		session.insert("Pconsult_InsertInfo", pconsult);
		System.out.println("게시판 글 입력 성공!");
		
	}

	@Override
	public Pconsult p_DetailInfo(int pnum) {
		System.out.println("Pconsult_Dao_Impl p_DetailInfo start...");
		Pconsult pconsult = session.selectOne("PconsultDetail", pnum);
		return pconsult;
	}

	@Override
	public void pconsultUpdatePro(Pconsult pconsult) {
		System.out.println("Pconsult_Dao_Impl pconsultUpdatePro() start...");
		session.update("pconsultUpdatePro", pconsult);
	}

}
