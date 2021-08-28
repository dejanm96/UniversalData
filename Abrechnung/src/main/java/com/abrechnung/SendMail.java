package com.abrechnung;

import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
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

public class SendMail {

    final String username = "admin@media-wein.de";
    final String password = "!12Staatsoper34!";

    public boolean sendMailNow() {
    	
    	boolean emailSentSuccess = false;
    	
	    Properties props = new Properties();
	
	    props.put("mail.smtp.auth", true);
	    props.put("mail.smtp.starttls.enable", true);
	    props.put("mail.smtp.host", "smtp.IONOS.de");
	    props.put("mail.smtp.port", "587");
	
	    Session session = Session.getInstance(props,
	            new javax.mail.Authenticator() {
	                protected PasswordAuthentication getPasswordAuthentication() {
	                    return new PasswordAuthentication(username, password);
	                }
	            });
	
	    try {
	
	        Message message = new MimeMessage(session);
	        message.setFrom(new InternetAddress(username));
	        message.setRecipients(Message.RecipientType.TO,
	                InternetAddress.parse("dejo96@gmail.com"));
	        message.setSubject("Testing Subject");
	        message.setText("PFA");
	        
	        
	        MimeBodyPart messageBodyPart = new MimeBodyPart();
	
	        Multipart multipart = new MimeMultipart();
	        
	        String file = "C:\\Users\\micic\\OneDrive\\Desktop\\Abrechnung\\UniversalData\\CSV\\inventur.csv";
	        String fileName = "inventur.csv";
	        DataSource source = new FileDataSource(file);
	        messageBodyPart.setDataHandler(new DataHandler(source));
	        messageBodyPart.setFileName(fileName);
	        multipart.addBodyPart(messageBodyPart);
	
	        message.setContent(multipart);
	
	        System.out.println("Sending");
	
	        Transport.send(message);
	        
	        emailSentSuccess = true;
	        System.out.println("Done");
	       
	    } catch (MessagingException e) {
	        e.printStackTrace();
	    }
	    return emailSentSuccess;
    }
  }

