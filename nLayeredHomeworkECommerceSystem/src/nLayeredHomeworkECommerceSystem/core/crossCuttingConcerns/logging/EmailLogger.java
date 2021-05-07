package nLayeredHomeworkECommerceSystem.core.crossCuttingConcerns.logging;

public class EmailLogger implements Logger{
	@Override
	public void log(String message) {
		System.out.println("Emaile Loglandý: " + message);
	}
	
}