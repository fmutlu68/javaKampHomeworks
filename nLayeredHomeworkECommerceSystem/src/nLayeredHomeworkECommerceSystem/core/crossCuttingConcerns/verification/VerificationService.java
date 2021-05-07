package nLayeredHomeworkECommerceSystem.core.crossCuttingConcerns.verification;

import java.util.List;

import nLayeredHomeworkECommerceSystem.core.entities.concretes.VerificationMessage;

public interface VerificationService {
	void send(VerificationMessage message);
	void verify(int verificaitonMessageId);
	void verifyUser(int userId);
	List<VerificationMessage> getList();
}
