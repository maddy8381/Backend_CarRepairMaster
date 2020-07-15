package com.maddy8381.CarRepairMaster.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maddy8381.CarRepairMaster.model.Users;

public interface UsersRepo extends JpaRepository<Users, Integer>{
	
	Users findByUserId(int id_users);

}
