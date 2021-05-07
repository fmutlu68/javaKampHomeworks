package nLayeredHomeworkECommerceSystem.core.injections;

import nLayeredHomeworkECommerceSystem.core.entities.concretes.UserLoginDao;

public interface GoogleAuthService {
	void login(UserLoginDao loginDao);
}
