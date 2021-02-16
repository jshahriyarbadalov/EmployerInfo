package com.shahriyar.employerinfo.api;


import com.shahriyar.employerinfo.pojo.EmployeeResponse;

import retrofit2.http.GET;
import io.reactivex.Observable;

public interface ApiService {
    @GET("testTask.json")
   Observable <EmployeeResponse> getEmployes();
}
