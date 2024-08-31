package kr.or.ddit.member.service;

import java.util.List;

import kr.or.ddit.member.dao.IMemberDao;
import kr.or.ddit.member.dao.MemberDaoImpl;
import kr.or.ddit.member.vo.MemberVO;
import kr.or.ddit.member.vo.ZipVO;

public class MemberServiceImpl implements IMemberService {

	//dao메소드를 호출하기 위한 객체
	private IMemberDao dao;
	
	//생성자
	private MemberServiceImpl() {
		dao = MemberDaoImpl.getDao();
	}

	//싱글톤(자신의 객체를 
	//자기 자신의 변수, private static으로 가지고 있는다.
	private static MemberServiceImpl service;
	
	public static MemberServiceImpl getService() {
		if(service==null) service = new MemberServiceImpl();
		
		return service;
	}
	
	@Override
	public List<MemberVO> selectAllMember() {
		//서비스 메소드 호출
		/*
		 * List<MemberVO> list = null;
		 * 
		 * list = dao.selectAllMember();
		 * 
		 * return list;
		 */
		return dao.selectAllMember();
	}

	@Override
	public String idCheck(String id) {
		// TODO Auto-generated method stub
		return dao.idCheck(id);
	}

	@Override
	public List<ZipVO> selectByDong(String dong) {
		// TODO Auto-generated method stub
		return dao.selectByDong(dong);
	}

	@Override
	public int insertMember(MemberVO vo) {
		// TODO Auto-generated method stub
		return dao.insertMember(vo);
	}

}
