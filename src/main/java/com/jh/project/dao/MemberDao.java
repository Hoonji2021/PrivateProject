package com.jh.project.dao;

import com.jh.project.model.Member;

public interface MemberDao {

	int memberJoin(Member member);

	int memberIdChk(Member member);

	Member memberUpdateForm(String id);

	int memberUpdatePro(Member member);

	int memberDelete(String id);

}
