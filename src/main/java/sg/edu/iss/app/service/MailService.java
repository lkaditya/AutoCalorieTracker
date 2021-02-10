package sg.edu.iss.app.service;

import org.springframework.mail.SimpleMailMessage;

public interface MailService {

	void sendSimpleMail(String target, String subject, String text);

	void sendEmail(SimpleMailMessage email);
}
