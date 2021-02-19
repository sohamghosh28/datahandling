/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Soham
 */
import java.io.IOException;
import java.util.Properties;
import javax.mail.internet.AddressException;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

/*import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;*/



class sendmail {

	public static void send(String recepient)throws Exception{
		 System.out.println("preparing to send mail");
		final String username = "seamanifestoofficial@gmail.com";
		final String password = "$eaManifesto4";
		String fromEmail = "seamanifestoofficial@gmail.com";
		String toEmail = "sohughosh41@gmail.com";
		String toEmail1 = "sohampayments@gmail.com";
                
		Properties properties = new Properties();
		properties.put("mail.smtp.auth", "true");
		properties.put("mail.smtp.starttls.enable", "true");
		properties.put("mail.smtp.host", "smtp.gmail.com");
		properties.put("mail.smtp.port", "587");
		
		Session session = Session.getInstance(properties, new javax.mail.Authenticator() {
                    //@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username,password);
			}
		});
		Message message= prepareMessage(session,username,recepient);
                Transport.send(message);
                System.out.println("Message sent Successfully");
		/*MimeMessage msg = new MimeMessage(session);
		try {
			msg.setFrom(new InternetAddress(fromEmail));
			msg.addRecipient(Message.RecipientType.TO, new InternetAddress(toEmail));
                        msg.addRecipient(Message.RecipientType.CC, new InternetAddress(toEmail1));
			msg.setSubject("Network Diagram");
			
			Multipart emailContent = new MimeMultipart();
			
			
			MimeBodyPart textBodyPart = new MimeBodyPart();
			textBodyPart.setText("Hello!! sending you the pdf of network diagram");
			
			
			MimeBodyPart pdfAttachment = new MimeBodyPart();
			pdfAttachment.attachFile("C:/Users/Soham/Desktop/Sea Manifesto.pdf");
			
			
			emailContent.addBodyPart(textBodyPart);
			emailContent.addBodyPart(pdfAttachment);
			
			
			msg.setContent(emailContent);
			
			Transport.send(msg);
			System.out.println("Sent message");
		} catch (MessagingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}*/
}
        private static Message prepareMessage(Session session,String username,String recepient){
            try{
                Message message= new MimeMessage(session);
            message.setFrom(new InternetAddress(username));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(recepient));
            message.setRecipient(Message.RecipientType.CC, new InternetAddress(recepient));
            message.setSubject("Network Diagram");
            message.setText("Hello this is soham");
            return message;
            } catch (Exception ex)
            {
                Logger.getLogger(sendmail.class.getName()).log(Level.SEVERE, null, ex);
            }
            return null;
        }
            
        }