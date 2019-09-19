package com.cg.demojpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.cg.demojpa.dto.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	EntityManagerFactory entityFactory = Persistence.createEntityManagerFactory("demojpa");
	
	@Override
	public Employee save(Employee emp) {
	
		EntityManager em=entityFactory.createEntityManager();
		EntityTransaction tran=em.getTransaction();
		tran.begin();
		em.persist(emp);
//		em.flush();
		tran.commit();
//		Transaction tran=em.getTransaction();
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		EntityManager em=entityFactory.createEntityManager();
		
		return null;
	}

	@Override
	public void remove(Integer empId) {
		EntityManager em=entityFactory.createEntityManager();
		Employee empRemove=em.find(Employee.class, empId);
		EntityTransaction tran=em.getTransaction();
		tran.begin();
		em.remove(empRemove);
		// TODO Auto-generated method stub
		tran.commit();
		
	}

	
}
