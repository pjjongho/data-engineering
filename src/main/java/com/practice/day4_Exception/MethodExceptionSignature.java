package com.practice.day4_Exception;

import com.practice.day4_Quiz.Runnable;

public class MethodExceptionSignature {
    static void methodThrowsException() throws Exception {

    }

    static void methodThrowsRuntimeException() throws RuntimeException {

    }

    public static void main(String[] args) {
        methodThrowsRuntimeException();
        try {
            methodThrowsException();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
