package com.wsl.mycat.error;

public class ApplicationErrorException extends Exception {
    private final ErrorCode errorCode;
    private final Object[] params;

    public ApplicationErrorException(ErrorCode code, Object... params) {
        this.errorCode = code;
        this.params = params;
    }

    int getErrorCode() {
        return errorCode.getCode();
    }

    @Override
    public String getMessage() {
        StringBuilder sb = new StringBuilder(errorCode.getErrorStringFormat());
        for (Object obj : params) {
            sb.append(" | " + obj.toString());
        }
        return sb.toString();
    }
}
