package com.app.gymservices.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.app.gymservices.dao.UserRepository;
import com.app.gymservices.dto.UserDTO;
import com.app.gymservices.entity.GymDetail;
import com.app.gymservices.entity.Role;
import com.app.gymservices.entity.User;
import com.app.gymservices.util.Active;
import com.app.gymservices.util.Verified;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	public UserRepository userRepository;

	@Autowired
	private RoleService roleService;

	@Autowired
	private GymDetailService gymdetailservice;

//	@Autowired
//	private JwtTokenUtil jwtTokenUtil;

	@Override
	public List<User> findAllCustomers() {
		return userRepository.findAll();
	}

	@Override
	public ResponseEntity<UserDTO> createUserForRegistration(UserDTO userDto) {

		userRepository.save(getUserFromUserdto(userDto));

		return ResponseEntity.ok(userDto);
	}

	@Override
	public User getUserFromUserdto(UserDTO userDto) {
		User user = new User();

		user.setActive(Active.ACTIVE);
		user.setUserName(userDto.getUserName());
		user.setPassword(userDto.getPassword());
		user.setAge(userDto.getAge());
		user.setGender(userDto.getGender());
		user.setEmail(userDto.getEmail());
		user.setFullName(userDto.getFullName());
		user.setAddress(userDto.getAddress());
		user.setPhone(userDto.getPhone());
		user.setVerified(Verified.VERIFIED);
		user.setEmailVerificationCode("dfghj");
		user.setRole(getRolefromRoleId(userDto.getRoleId()));
		user.setGymDetail(getGymfromGymId(userDto.getGymId()));

		return user;
	}

	private GymDetail getGymfromGymId(int gymId) {

		return gymdetailservice.findGymById(gymId);
	}

	private Role getRolefromRoleId(int roleId) {

		return roleService.findRoleById(roleId);
	}

	@Override
	public User findUserByUserId(int id) {

		return userRepository.findById(id).orElse(null);
	}

//	@Override
//	public Optional<User> findUserByEmailId(String email) {
//		// TODO Auto-generated method stub
//		return Optional.of(userRepository.findUserByEmail(email));
//	}
	@Override
	public User findUserByTheEmailId(String email) {
		// TODO Auto-generated method stub
		return userRepository.findUserByMail(email);
	}

	@Override
	public Optional<User> findUserByEmailAndPassword(String email, String password) {
		// TODO Auto-generated method stub
		return Optional.of(userRepository.findUserByEmailAndPassword(email, password));
	}

	@Override
	public List<UserDTO> findAllusers(UserDTO userDto) {

		List<UserDTO> user = new ArrayList<UserDTO>();
		if (user != null && !user.isEmpty()) {
			user.forEach(us -> {
				UserDTO userdt = new UserDTO();
				userdt.setFullName(us.getFullName());
				userdt.setAge(us.getAge());
				userdt.setAddress(us.getAddress());
				userdt.setGender(us.getGender());
				userdt.setPhone(us.getPhone());
				userdt.setEmail(us.getEmail());

			});
			return user;
		}
		return null;
	}

	/*
	 * @Override public User getUserFromToken(String requestTokenHeader) { String
	 * username = null; String jwtToken = null; // JWT Token is in the form
	 * "Bearer token". Remove Bearer word and get // only the Token
	 * System.out.println(requestTokenHeader); if (requestTokenHeader != null &&
	 * requestTokenHeader.startsWith("Bearer ")) { jwtToken =
	 * requestTokenHeader.substring(7); try {
	 * 
	 * username = jwtTokenUtil.getUsernameFromToken(jwtToken); return
	 * userRepository.findUserByEmail(username); } catch (IllegalArgumentException
	 * e) { System.out.println("Unable to get JWT Token"); } catch
	 * (ExpiredJwtException e) { System.out.println("JWT Token has expired"); } }
	 * else { System.out.println("JWT Token does not begin with Bearer String"); }
	 * return null; }
	 */

}
