package nLayeredHomeworkECommerceSystem.dataAccess.abstracts;

import nLayeredHomeworkECommerceSystem.entities.concretes.User;

public interface UserDao extends GenericDao<User>{
	User getByMail(String email);
}
