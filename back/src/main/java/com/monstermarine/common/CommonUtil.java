package com.monstermarine.common;

import org.springframework.http.HttpStatus;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.*;

public class CommonUtil {

    /**
     * VO를 map형식으로 변환해서 반환
     * @param obj Object
     * @return
     * @throws Exception
     */
    public static Map convertObjectToMap(Object obj){
        Map map = new HashMap();
        Field[] fields = obj.getClass().getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {
            fields[i].setAccessible(true);
            try {
                map.put(fields[i].getName(), fields[i].get(obj));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return map;
    }

    /**
     * Map를 VO형식으로 변환해서 반환
     * @param map Map
     * @param obj Object
     * @return
     * @throws Exception
     */
    public static Object convertMapToObject(Map<String, Object> map, Object obj){
        String keyAttribute = null;
        String setMethodString = "set";
        String methodString = null;
        Iterator itr = map.keySet().iterator();

        while (itr.hasNext()) {
            keyAttribute = (String) itr.next();
            methodString = setMethodString+keyAttribute.substring(0, 1).toUpperCase() + keyAttribute.substring(1);
            Method[] methods = obj.getClass().getDeclaredMethods();
            for(int i = 0; i < methods.length; i++){
                if (methodString.equals(methods[i].getName())) {
                    try {
                        methods[i].invoke(obj, map.get(keyAttribute));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return obj;
    }

    /**
     * VO를 Map Wrapping
     * @param key String
     * @param obj Object
     * @return
     * @throws Exception
     */
    public static Map coverVoToMap(String key, Object obj) {
        Map res = new HashMap();

        if (obj != null) {
            res.put(key, convertObjectToMap(obj));
        } else {
            res.put("code", 500);
            res.put("message", isSuccessMessage(0));
        }

        return res;
    }

    /**
     * List를 Map Wrapping
     * @param key String
     * @param dataList Object
     * @return
     * @throws Exception
     */
    public static Map coverListToMap(String key, Object dataList) {
        Map res = new HashMap();
        res.put(key, dataList);
        return res;
    }

    /**
     * 등록, 수정, 삭제 후 성공여부 JSON으로 반환
     * @param code int
     * @return
     * @throws Exception
     */
    public static Map isWorkSuccess(int code) {
        Map res = new HashMap();
        res.put("code", HttpStatus.OK);
        res.put("message", CommonUtil.isSuccessMessage(code));
        return res;
    }

    /**
     * 등록, 수정, 삭제 후 성공여부 메세지 반환
     * @param code int
     * @return
     * @throws Exception
     */
    public static String isSuccessMessage(int code) {
        return (code == 1) ? "SUCCESS" : "FAILED";
    }

}
