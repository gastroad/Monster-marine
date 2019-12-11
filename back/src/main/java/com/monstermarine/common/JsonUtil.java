package com.monstermarine.common;

import org.json.simple.JSONObject;

import java.util.List;

public class JsonUtil {

    public static Object covertList(String name, List<?> list) {
        return new JSONObject().put(name, list);
    }

}
