package com.monstermarine.api.product;

import java.util.List;
import java.util.Map;

public interface ProductService {

	public Map<?, ?> getProduct(Map<String, Object> param) throws Exception;
	
	public List<?> getProductList(Map<String, Object> param) throws Exception;
	
	public void insertProudct(Map<String, Object> param) throws Exception;
	
	public void updateProduct(Map<String, Object> param) throws Exception;
	
	public void deleteProduct(Map<String, Object> param) throws Exception;
	
}
