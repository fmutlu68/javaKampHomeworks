package nLayeredHomeworkECommerceSystem.dataAccess.concretes.memory;

import java.util.ArrayList;
import java.util.List;

import nLayeredHomeworkECommerceSystem.business.abstracts.Validator;
import nLayeredHomeworkECommerceSystem.dataAccess.abstracts.UserDao;
import nLayeredHomeworkECommerceSystem.entities.concretes.User;

public class MemoryUserDao implements UserDao {

	private List<User> memoryUsers;

	public MemoryUserDao() {
		memoryUsers = new ArrayList<User>();
	}

	@Override
	public int add(User entity) {
		if (memoryUsers.size() == 0) {
			entity.setId(0);
		}else {
			entity.setId(memoryUsers.size());
		}
		memoryUsers.add(entity);
		return entity.getId();
	}

	@Override
	public void delete(User entity) {
		memoryUsers.remove(entity);
	}

	@Override
	public void update(User entity) {
		User user = this.getById(entity.getId());
		if (user.equals(null) == false) {
			user.setEmail(entity.getEmail());
			user.setFirstName(entity.getFirstName());
			user.setLastName(entity.getLastName());
			user.setPassword(entity.getPassword());
		}
	}

	@Override
	public List<User> getList() {
		return memoryUsers;
	}

	@Override
	public User getById(int id) {
		for (User user : memoryUsers) {
			if (user.getId() == id) {
				return user;
			}
		}
		return null;
	}

	@Override
	public User getByMail(String email) {
		for (User user : memoryUsers) {
			if (user.getEmail().equals(email)) {
				return user;
			}
		}
		return null;
	}

}
