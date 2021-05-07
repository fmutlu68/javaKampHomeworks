package nLayeredHomeworkECommerceSystem.business.abstracts;

import nLayeredHomeworkECommerceSystem.core.entities.concretes.UserLoginDao;
import nLayeredHomeworkECommerceSystem.core.entities.concretes.UserRegisterDao;

public interface AuthService {
	void login(UserLoginDao loginDao);
	void register(UserRegisterDao registerDao);
	void verifyUser(int userId);
}
