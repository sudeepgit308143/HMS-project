package com.nareshit.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.nareshit.bean.DoctorBean;
import com.nareshit.domain.Doctor;


public interface DoctorService {

	public DoctorBean saveDoctor(DoctorBean hosp);
	public List<DoctorBean> getAllDoctors();
	public DoctorBean getDoctorById(int id);
	public DoctorBean updateDoctor(DoctorBean doctbean);
	void deleteDoctor(int id);
}
