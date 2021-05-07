package nLayeredHomeworkECommerceSystem.google;

public class GoogleAuthManager {
	public void login(GoogleUserDao userDao) {
		System.out.println("Google Ýle Giriþ Ýþlemi Baþarýlý: " + userDao.getEmail());
	}
}
