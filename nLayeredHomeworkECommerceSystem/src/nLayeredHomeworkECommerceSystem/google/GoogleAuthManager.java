package nLayeredHomeworkECommerceSystem.google;

public class GoogleAuthManager {
	public void login(GoogleUserDao userDao) {
		System.out.println("Google �le Giri� ��lemi Ba�ar�l�: " + userDao.getEmail());
	}
}
