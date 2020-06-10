package com.aust.clanguage.base.interceptor;


public class UserHolder {

    private UserHolder(){}

    private static final ThreadLocal<String> LOCAL = new ThreadLocal<>();

    public static void put(String userId) {
        LOCAL.set(userId);
    }

    public static String get() {
        return LOCAL.get();
    }

    public static void clear() {
        LOCAL.remove();
    }
}
