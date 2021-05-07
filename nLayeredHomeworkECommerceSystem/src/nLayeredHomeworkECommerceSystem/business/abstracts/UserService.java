package nLayeredHomeworkECommerceSystem.business.abstracts;

import java.util.List;

import nLayeredHomeworkECommerceSystem.entities.concretes.User;

public interface UserService {
	void add(User user);
	void delete(User user);
	void update(User user);
	List<User> list();
	User getById(int id);
	User getByMail(String email);
	void verifyUser(int userId);
}
