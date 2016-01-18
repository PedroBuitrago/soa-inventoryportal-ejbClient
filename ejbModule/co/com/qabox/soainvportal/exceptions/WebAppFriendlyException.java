package co.com.qabox.soainvportal.exceptions;

public class WebAppFriendlyException extends Exception {

    private static final long serialVersionUID = 8874059455324526664L;

	public WebAppFriendlyException(String message) {
        super(message);
    }

    public WebAppFriendlyException(String message, Throwable throwable) {
        super(message, throwable);
    }

}
