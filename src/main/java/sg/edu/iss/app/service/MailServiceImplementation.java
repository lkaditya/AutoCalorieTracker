package sg.edu.iss.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;


@Service
public class MailServiceImplementation implements MailService {
		
	@Autowired
    JavaMailSender javaMailSender;
	
    @Autowired
    private Environment env;


	@Override
	public void sendSimpleMail(String target,String subject, String text) {
		SimpleMailMessage mailMessage = new SimpleMailMessage();
		String sender = env.getProperty("spring.mail.username");
		mailMessage.setFrom(sender);
		mailMessage.setTo(target);
		mailMessage.setSubject(subject);
		mailMessage.setText(text);
		javaMailSender.send(mailMessage);
		

	}

}
