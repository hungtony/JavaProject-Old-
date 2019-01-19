package com.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class JsonUtil {

    private static final ObjectMapper OM = new ObjectMapper();

    private JsonUtil() {
    }

    public static String convertObjectToJson(final Object obj) {
        try {
            return OM.writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static <T> T convertJsonToObject(final String json, final Class<T> clazz) {
        try {
            return OM.readValue(json, clazz);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static ObjectMapper getObjectMapper() {
        return OM;
    }

}
