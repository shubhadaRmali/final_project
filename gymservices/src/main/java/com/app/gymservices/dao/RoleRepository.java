package com.app.gymservices.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.gymservices.entity.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {

}
