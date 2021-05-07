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
			System.out.println("Hesap Bulunmad�.");
		}else if (user.isStatus() == false) {
			System.out.println("Hesap Do�rulanmam��");
		}else {
			if (user.getPassword().equals(loginDao.getPassword())) {
				System.out.println("Giri� Ba�ar�l�.");
			}else {
				System.out.println("�ifre Yanl��");
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
			System.out.println("Bu Kullan�c� Sistemde Zaten Mevcut.");
		}
	}

	@Override
	public void verifyUser(int userId) {
		userService.verifyUser(userId);
	}

}
