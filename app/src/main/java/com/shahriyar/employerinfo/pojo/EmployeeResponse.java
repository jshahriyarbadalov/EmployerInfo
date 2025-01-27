package com.shahriyar.employerinfo.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class EmployeeResponse {
    @SerializedName("response")
    @Expose
    private List<Employee> response = null;

    public List<Employee> getEmployees() {
        return response;
    }

    public void setResponse(List<Employee> response) {
        this.response = response;
    }
}
