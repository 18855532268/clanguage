package com.aust.clanguage.base.exception;

/**
 * 程序错误信息
 *
 * @author zhangjicheng
 */
public class ErrorMessageException extends RuntimeException {
    public ErrorMessageException(String message) {
        super(message);
    }
}
