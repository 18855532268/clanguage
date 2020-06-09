package com.aust.clanguage.base.exception;

/**
 * 程序错误信息
 *
 * @author zhangjicheng
 */
public class ErrorRollbackException extends RuntimeException {
    public ErrorRollbackException(String message) {
        super(message);
    }
}
