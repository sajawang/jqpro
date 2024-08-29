package kr.or.ddit.member.dao;

import java.util.List;

import kr.or.ddit.member.vo.MemberVO;

public interface IMemberDao {
	
	
	//service-dao-mapper의 메소드 이름이 모두 같으면 편하다
	public List<MemberVO> selectAllMember();

}
