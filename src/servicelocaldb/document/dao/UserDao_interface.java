package servicelocaldb.document.dao;

import servicelocaldb.document.models.User;

public interface UserDao_interface {
	public User save(User user);
	public User update(User user);
	public User delete(User user); 
	
	public User getUserById(Long id);
	public User getUserByAuthentication(String mail, String password);
}
