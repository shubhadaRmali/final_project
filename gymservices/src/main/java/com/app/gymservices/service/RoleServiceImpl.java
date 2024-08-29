package com.app.gymservices.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.gymservices.dao.RoleRepository;
import com.app.gymservices.entity.Role;

@Service
public class RoleServiceImpl implements RoleService {

	@Autowired
	private RoleRepository roleRepository;

	@Override
	public Role findRoleById(int roleId) {
		return roleRepository.findById(roleId).orElse(null);
	}
}
