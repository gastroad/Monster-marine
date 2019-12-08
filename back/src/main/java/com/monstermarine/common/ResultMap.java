package com.monstermarine.common;

import java.util.HashMap;

public class ResultMap extends HashMap<String, Object> {
	
	private static final long serialVersionUID = -8915503612900969881L;

	@Override
	public Object put(String key, Object value) {

		if (Character.isUpperCase(key.charAt(0))) {
			String arrKey[] = key.toLowerCase().split("_");
			String rsKey = arrKey[0];

			for(int i=1; i < arrKey.length; i++){
				rsKey = rsKey + (arrKey[i].substring(0, 1).toUpperCase() + arrKey[i].substring(1, arrKey[i].length()));
			}

			return super.put(rsKey, value);
		}

		return super.put(key, value);
	}

}