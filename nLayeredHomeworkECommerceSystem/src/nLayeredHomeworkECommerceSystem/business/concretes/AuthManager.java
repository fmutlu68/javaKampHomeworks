package nLayeredHomeworkECommerceSystem.business.concretes;

import nLayeredHomeworkECommerceSystem.business.abstracts.AuthService;
import nLayeredHomeworkECommerceSystem.business.abstracts.UserService;
import nLayeredHomeworkECommerceSystem.core.entities.concretes.UserLoginDao;
import nLayeredHomeworkECommerceSystem.core.entities.concretes.UserRegisterDao;
import nLayeredHomeworkECommerceSystem.entities.concretes.User;

public class AuthManager implements AuthService{

	private UserService userService;
	
	public AuthManager(UserService userService) {
		super();
		this.userService = userService;
	}

	@Override
	public void login(UserLoginDao loginDao) {
		var user = userService.getByMail(loginDao.getEmail());
		if (user == null) {
			System.out.println("Hesap Bulunmadý.");
		}else if (user.isStatus() == false) {
			System.out.println("Hesap Doðrulanmamýþ");
		}else {
			if (user.getPassword().equals(loginDao.getPassword())) {
				System.out.println("Giriþ Baþarýlý.");
			}else {
				System.out.println("Þifre Yanlýþ");
			}
		}
	}

	@Override
	public void register(UserRegisterDao registerDao) {
		var user = userService.getByMail(registerDao.getEmail());
		if (user == null) {
			var newUser = new User(registerDao.getEmail(), registerDao.getPassword(), registerDao.getFirstName(),registerDao.getLastName() , false);
			userService.add(newUser);
		}else {
			System.out.println("Bu Kullanýcý Sistemde Zaten Mevcut.");
		}
	}

	@Override
	public void verifyUser(int userId) {
		userService.verifyUser(userId);
	}

}
