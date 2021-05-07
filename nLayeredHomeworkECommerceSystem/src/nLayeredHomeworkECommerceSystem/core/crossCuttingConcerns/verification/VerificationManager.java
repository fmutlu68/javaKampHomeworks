package nLayeredHomeworkECommerceSystem.core.crossCuttingConcerns.verification;

import java.util.ArrayList;
import java.util.List;

import nLayeredHomeworkECommerceSystem.core.entities.concretes.VerificationMessage;

public class VerificationManager implements VerificationService{
	List<VerificationMessage> messages;

	public VerificationManager() {
		this.messages = new ArrayList<VerificationMessage>();
	}

	@Override
	public void send(VerificationMessage message) {
		if (messages.size() > 0) {
			message.setId(0);
		}else {
			message.setId(messages.size());
		}
		messages.add(message);
	}

	@Override
	public void verify(int verificaitonMessageId) {
		for(VerificationMessage message : messages) {
			if (message.getId() == verificaitonMessageId) {
				message.setVerified(true);
				break;
			}
		}
	}

	@Override
	public List<VerificationMessage> getList() {
		return messages;
	}

	@Override
	public void verifyUser(int userId) {
		for(VerificationMessage message : messages) {
			if (message.getUserId() == userId) {
				message.setVerified(true);
			}
		}
	}
}
