package com.enit.demo.services;

import java.util.List;

import com.enit.demo.entities.Career;

public interface CareerService {

    public String addCarr(Career career);

    public void removeCarr(String userName);

    public void updateCarr(Career career);
   

    public Career findCarByuserName(String userName);

    public List<Career> getAllCareer();
}


