package kr.or.ddit.member.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.or.ddit.member.vo.MemberVO;
import kr.or.ddit.mybatis.config.MybatisUtil;

public class MemberDaoImpl implements IMemberDao {

	//mapper수행을 위한 SqlSession
	private SqlSession sql;
	
	//생성자
	private MemberDaoImpl() {}
	
	//싱글톤
	private static IMemberDao dao;
	public static IMemberDao getDao() {
		if(dao==null) dao = new MemberDaoImpl();
		return dao;
	}
	
	
	@Override
	public List<MemberVO> selectAllMember() {
		//sql실행할때마다 마이바티스에서 얻어와주세요
		sql = MybatisUtil.getSqlSession();
		
		//결과를 얻어서 리턴 할 변수 선언
		//메소드의 리턴타입과 같게!!
		List<MemberVO> list = null;
		
		try {
			//mapper수행
			//namespace . id(메소드 이름과 같게 해서 편하게)
			list = sql.selectList("member.selectAllMember");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//커밋과 클로스도 해주세요 - 공식 문서에 보면 TRY, finally안에서 close하게 되어있음
			sql.commit();
			sql.close();
		}
		
		//결과값 service로 리턴
		return list;
	}

}





























