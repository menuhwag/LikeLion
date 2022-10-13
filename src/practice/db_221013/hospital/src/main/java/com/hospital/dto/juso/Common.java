package com.hospital.dto.juso;

public class Common {
    private String errorMessage;
    private String countPerPage;
    private String totalCount;
    private String errorCode;
    private String currentPage;

    public String getErrorMessage() {
        return errorMessage;
    }

    public String getCountPerPage() {
        return countPerPage;
    }

    public String getTotalCount() {
        return totalCount;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public String getCurrentPage() {
        return currentPage;
    }

    @Override
    public String toString() {
        return "Common{" +
                "errorMessage='" + errorMessage + '\'' +
                ", countPerPage='" + countPerPage + '\'' +
                ", totalCount='" + totalCount + '\'' +
                ", errorCode='" + errorCode + '\'' +
                ", currentPage='" + currentPage + '\'' +
                '}';
    }
}
