package nLayeredHomeworkECommerceSystem;

import nLayeredHomeworkECommerceSystem.business.abstracts.AuthService;
import nLayeredHomeworkECommerceSystem.business.concretes.AuthManager;
import nLayeredHomeworkECommerceSystem.business.concretes.UserManager;
import nLayeredHomeworkECommerceSystem.business.validationRules.UserValidator;
import nLayeredHomeworkECommerceSystem.core.crossCuttingConcerns.logging.EmailLogger;
import nLayeredHomeworkECommerceSystem.core.crossCuttingConcerns.verification.VerificationManager;
import nLayeredHomeworkECommerceSystem.core.entities.concretes.UserLoginDao;
import nLayeredHomeworkECommerceSystem.core.entities.concretes.UserRegisterDao;
import nLayeredHomeworkECommerceSystem.core.injections.GoogleAuthManagerAdapter;
import nLayeredHomeworkECommerceSystem.dataAccess.concretes.memory.MemoryUserDao;

public class Main {

	public static void main(String[] args) {
		/*
		 * GoogleAuthManagerAdapter adapter = new GoogleAuthManagerAdapter();
		 * adapter.login(new UserLoginDao("Deneme", "Deneme"));
		 */
		
//		AuthService authService = new AuthManager(
//				new UserManager(
//						new MemoryUserDao(), 
//						new UserValidator(),
//						new EmailLogger(),
//						new VerificationManager()
//				)
//		);
//		authService.register(new UserRegisterDao("dedede@example.com", "123456", "Furkan", "Mutlu"));
//		authService.verifyUser(0);
//		authService.login(new UserLoginDao("dedede@example.com","123456"));
	}

}
