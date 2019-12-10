package com.monstermarine.common;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;

public class CommonUtil {

    /**
     * int -> boolean 변환
     */
    public static void intToBoolean(Map<String, Object> data, String key) {
        data.put(key, data.get(key).equals(1) ? true : false);
    }

    /**
     * int -> boolean 변환 (리스트)
     */
    public static List<Map<String, Object>> intToBoolean(List<?> list, String key) {

        List<Map<String, Object>> mapList  = new ArrayList<>();

        for (Object data : list) {
            Map<String, Object> mapData = CommonUtil.ConvertObjectToMap(data);
            mapData.put(key, mapData.get(key).equals(1) ? true : false);
            mapList.add(mapData);
        }

        return mapList;
    }

    /**
     * Object -> Map으로 변환
     */
    public static Map ConvertObjectToMap(Object obj) {
        try {
            //Field[] fields = obj.getClass().getFields();
            // private field는 나오지 않음.
            Field[] fields = obj.getClass().getDeclaredFields();
            Map resultMap = new HashMap();
            for(int i=0; i<=fields.length-1;i++){
                fields[i].setAccessible(true);
                resultMap.put(fields[i].getName(), fields[i].get(obj));
            }
            return resultMap;
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        return null;
    }

    /**
     * Map -> Object으로 변환
     */
    public static Object convertMapToObject(Map map, Object objClass) {
        String keyAttribute = null;
        String setMethodString = "set";
        String methodString = null;
        Iterator itr = map.keySet().iterator();
        while (itr.hasNext()) {
            keyAttribute = (String) itr.next();
            methodString = setMethodString+keyAttribute.substring(0,1).toUpperCase() + keyAttribute.substring(1);
            try {
                Method[] methods = objClass.getClass().getDeclaredMethods();
                for (int i=0; i<=methods.length-1; i++) {
                    if (methodString.equals(methods[i].getName())) {
                        System.out.println("invoke : "+methodString);
                        methods[i].invoke(objClass, map.get(keyAttribute));
                    }
                }
            } catch (SecurityException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        }

        return objClass;
    }


}
