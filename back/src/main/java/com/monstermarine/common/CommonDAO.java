package com.monstermarine.common;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
public class CommonDAO {

	@Autowired
	@Qualifier("sqlSessionTemplate")
	private SqlSession sqlsession;

	public List<Map<String, Object>> list(String statement, Map<String, Object> map) {
		return this.sqlsession.selectList(statement, map);
	}

	public Map<String, Object> select(String statement, Map<String, Object> map) {
		return this.sqlsession.selectOne(statement, map);
	}
	
	public int count(String statement, Map<String, Object> map) {
		return (Integer)this.sqlsession.selectOne(statement, map);
	}

	public int update(String statement, Map<String, Object> map) {
		return this.sqlsession.update(statement, map);
	}

	public int delete(String statement, Map<String, Object> map) {
		return this.sqlsession.delete(statement, map);
	}

	/** selectKey로 반환할 경우 map에서 꺼내쓰면 됨, 이때 파라미터의 map이 null이 아니어야 반환 가능(null일 경우 exception) */
	public int insert(String statement, Map<String, Object> map) {
		int result = this.sqlsession.insert(statement, map);
		return result;
		//		/* insert된 row가 있을 경우 selectKey로 반환된 map를 돌려주고, insert되지 않았을 경우 null을 돌려줌 */
		//		if (result == 0) {
		//			return null;
		//		}
		//
		//		return map;
	}
}
