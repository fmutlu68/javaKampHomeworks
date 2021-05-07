package nLayeredHomeworkECommerceSystem.core.injections;

import nLayeredHomeworkECommerceSystem.core.entities.concretes.UserLoginDao;
import nLayeredHomeworkECommerceSystem.google.GoogleAuthManager;
import nLayeredHomeworkECommerceSystem.google.GoogleUserDao;

public class GoogleAuthManagerAdapter implements GoogleAuthService{
	GoogleAuthManager googleAuthManager; 
	public GoogleAuthManagerAdapter() {
		this.googleAuthManager = new GoogleAuthManager();
	}

	/// Google �le Giri� Yap�labilmesi ��in
	@Override
	public void login(UserLoginDao loginDao) {
		this.googleAuthManager.login(new GoogleUserDao(loginDao.getEmail(), loginDao.getPassword()));
	}
}
