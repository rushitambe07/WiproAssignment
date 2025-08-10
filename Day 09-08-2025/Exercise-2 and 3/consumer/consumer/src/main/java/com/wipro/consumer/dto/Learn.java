package com.wipro.consumer.dto;

import java.io.Serializable;

public class Learn implements Serializable {
    private String subjectCode;
    private String subjectValue;

    public String getSubjectCode() { return subjectCode; }
    public void setSubjectCode(String subjectCode) { this.subjectCode = subjectCode; }

    public String getSubjectValue() { return subjectValue; }
    public void setSubjectValue(String subjectValue) { this.subjectValue = subjectValue; }
    
    @Override
    public String toString() {
        return "Learn{" +
               "subjectCode='" + subjectCode + '\'' +
               ", subjectValue='" + subjectValue + '\'' +
               '}';
    }

}
