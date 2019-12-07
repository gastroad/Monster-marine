package com.monstermarine.api.notice;

import java.util.List;
import java.util.Map;

public interface NoticeService {
	
	public Map<?, ?> getNotice(Map<String, Object> param) throws Exception;
	
	public List<?> getNoticeList(Map<String, Object> param) throws Exception;
	
	public Map<?, ?> insertNotice(Map<String, Object> param) throws Exception;
	
	public Map<?, ?> updateNotice(Map<String, Object> param) throws Exception;
	
	public  Map<?, ?> deleteNotice(Map<String, Object> param) throws Exception;

}
