package com.UserTable.UserTableCrudApp.user;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {
	@Autowired private UserRepository repo;
	
	public List<User> listAll(){
		return (List<User>) repo.findAll(); 
	}

	public void save(User user) {
		repo.save(user);		
	}
	
	public User get(Integer id) {
	    Optional<User> result = repo.findById(id);
	    return result.orElseThrow(() -> new UserNotFoundException("Could not find any users with ID " + id));
	}
	
	public void delete(int id) {
		Long count = repo.countById(id);
		if (count == null || count == 0) {
		    throw new UserNotFoundException("Could not find any users with ID " + id);

		}
		repo.deleteById(id);
	}

}