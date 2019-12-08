package com.monstermarine.api.product;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.monstermarine.common.CommonService;

@Service
public class ProductServiceImpl extends CommonService implements ProductService {

	@Override
	public Map<?, ?> getProduct(Map<String, Object> param) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<?> getProductList(Map<String, Object> param) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertProudct(Map<String, Object> param) throws Exception {
		super.commonDAO.insert("notice.insertNotice", param);
	}

	@Override
	public void updateProduct(Map<String, Object> param) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteProduct(Map<String, Object> param) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
