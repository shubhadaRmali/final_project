package com.app.gymservices.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.app.gymservices.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	@Query(value = "select * from users a where a.email= :email", nativeQuery = true)
	User findUserByMail(String email);

	User findUserByEmailAndPassword(String email, String password);

}
