package com.shahriyar.employerinfo.converters;

import com.google.gson.Gson;
import com.shahriyar.employerinfo.pojo.Speciality;

import java.util.ArrayList;
import java.util.List;

import androidx.room.TypeConverter;

public class Converter {
    @TypeConverter
    public String listSpecialityToString(List<Speciality> specialties) {
        return new Gson().toJson(specialties);
//        JSONArray jsonArray=new JSONArray();
//        for(Specialty specialty: specialties){
//            JSONObject jsonObject=new JSONObject();
//            try {
//                jsonObject.put("specialty_id", specialty.getSpecialtyId());
//                jsonObject.put("name", specialty.getName());
//                jsonArray.put(jsonObject);
//            } catch (JSONException e) {
//                e.printStackTrace();
//            }
//        return jsonArray.toString();
//        }
    }

    @TypeConverter
    public List<Speciality> stringToListSpeciality(String specialitiesAsString) {
        Gson gson = new Gson();
        ArrayList objects = gson.fromJson(specialitiesAsString, ArrayList.class);
        ArrayList<Speciality> specialities = new ArrayList<>();
        for (Object o : objects) {
            specialities.add(gson.fromJson(o.toString(), Speciality.class));
        }
        return specialities;
    }
}
