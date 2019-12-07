package com.monstermarine.api.notice;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.monstermarine.api.common.CommonService;

@Service
public class NoticeServiceImpl extends CommonService implements NoticeService {

	@Override
	public Map<?, ?> getNotice(Map<String, Object> param) throws Exception {
		return super.commonDAO.select("notice.getNotice", param);
	}

	@Override
	public List<?> getNoticeList(Map<String, Object> param) throws Exception {
		return super.commonDAO.list("notice.getNoticeList", param);
	}

	@Override
	public Map<?, ?> insertNotice(Map<String, Object> param) throws Exception {
		Map<String, Object> result = new HashMap<String, Object>();

		System.out.println("========================Service");
		System.out.println(param.get("title"));
		System.out.println(param.get("contents"));
		
		int success = super.commonDAO.insert("notice.insertNotice", param);
		if (success == 1) {
			result.put("SUCCESS", true);
		} else {
			result.put("SUCCESS", false);
		}
		
		return result;
	}

	@Override
	public Map<?, ?> updateNotice(Map<String, Object> param) throws Exception {
		Map<String, Object> result = new HashMap<String, Object>();
		
		int success = super.commonDAO.update("notice.updateNotice", param);
		if (success == 1) {
			result.put("SUCCESS", true);
		} else {
			result.put("SUCCESS", false);
		}
		
		return result;
	}

	@Override
	public  Map<?, ?> deleteNotice(Map<String, Object> param) throws Exception {
		Map<String, Object> result = new HashMap<String, Object>();
		
		int success = super.commonDAO.update("notice.deleteNotice", param);
		if (success == 1) {
			result.put("SUCCESS", true);
		} else {
			result.put("SUCCESS", false);
		}
		
		return result;
		
	}

}
