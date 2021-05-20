package com.nareshit.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nareshit.domain.Doctor;
import com.nareshit.domain.User;

@Repository
public class DoctorDaoImpl implements DoctorDao {

	@Autowired
	private SessionFactory sf;

	@Override
	public Doctor addDoctor(Doctor doct) {
		Session ses = sf.openSession();
		ses.save(doct);
		ses.beginTransaction().commit();
		ses.close();
		return doct;
	}

	@Override
	public Doctor getDoctorByid(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Doctor> getAllDoctors() {
		Session ses = sf.openSession();
		String getAllDoctors = "from Doctor d";
		Query q = ses.createQuery(getAllDoctors);
		return q.list();
	}

	@Override
	public List<Doctor> searchDoctor(String name, String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Doctor getDoctorById(int id) {
		Session ses = sf.openSession();
		return ses.get(Doctor.class, id);
	}

	@Override
	public Doctor updateDoctor(Doctor doctor) {
		Session ses = sf.openSession();
		ses.update(doctor);
		ses.beginTransaction().commit();
		ses.close();
		return doctor;

	}

	@Override
	public void deleteDoctor(int id) {
		Session ses = sf.openSession();
		Doctor doc = ses.get(Doctor.class, id);
		ses.delete(doc);
		ses.beginTransaction().commit();
		ses.close();
	}

}
