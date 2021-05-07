package nLayeredHomeworkECommerceSystem.business.concretes;

import java.util.List;

import nLayeredHomeworkECommerceSystem.business.abstracts.UserService;
import nLayeredHomeworkECommerceSystem.business.abstracts.Validator;
import nLayeredHomeworkECommerceSystem.core.crossCuttingConcerns.logging.Logger;
import nLayeredHomeworkECommerceSystem.core.crossCuttingConcerns.verification.VerificationService;
import nLayeredHomeworkECommerceSystem.core.entities.concretes.VerificationMessage;
import nLayeredHomeworkECommerceSystem.dataAccess.abstracts.UserDao;
import nLayeredHomeworkECommerceSystem.entities.concretes.User;

public class UserManager implements UserService{
	
	private UserDao userDao; 
	private Validator<User> userValidator;
	private Logger logger;
	private VerificationService verifyService;
	
	public UserManager(UserDao userDao) {
		this.userDao = userDao;
	}
	
	public UserManager(UserDao userDao, Validator<User> userValidator, Logger logger, VerificationService verifyService) {
		this.userDao = userDao;
		this.userValidator = userValidator;
		this.logger = logger;
		this.verifyService = verifyService;
	}

	@Override
	public void add(User user) {
		System.out.println("Kullanýcý Ekleniyor...");
		if (userValidator.runValidators(user)) {
			int userId = userDao.add(user);
			logger.log("Kullanýcý Ekleme Ýþlemi Baþarýlý: " + user.getEmail() + " Emailinize Gelen Linke Týklayýp Hesabýnýzý Aktif Etmeniz Gerekmektedir.");
			verifyService.send(new VerificationMessage("Hesabýnýzý Etkinleþtirmek Ýçin Linke Týklamanýz Gerekmektedir.","Doðrulama Linki",false, userId));
		}
	}

	@Override
	public void delete(User user) {
		userDao.delete(user);
	}

	@Override
	public void update(User user) {
		if (userValidator.runValidators(user)) {
			userDao.update(user);
		}
	}

	@Override
	public List<User> list() {
		return userDao.getList();
	}

	@Override
	public User getById(int id) {
		return userDao.getById(id);
	}

	@Override
	public User getByMail(String email) {
		return userDao.getByMail(email);
	}

	@Override
	public void verifyUser(int userId) {
		verifyService.verifyUser(userId);
		User user = userDao.getById(userId);
		user.setStatus(true);
		userDao.update(user);
	}
	
}
