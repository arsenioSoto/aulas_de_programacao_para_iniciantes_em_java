package com.mz.soto.junior._058_usando_codigos_de_terceiros;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class UsandoBibliotecaDeEmail {

	public static void main(String[] args) throws EmailException {
		
		Email email = new SimpleEmail();
		email.setHostName("smtp.gmail.com");
		email.setSmtpPort(465);
		email.setAuthenticator(new DefaultAuthenticator("ProgramacaoCodigos", "sword2@14"));
		email.setSSLOnConnect(true);
		email.setFrom("programacao.codigos@gmail.com");
		email.setSubject("Enviando email do Eclipse");
		email.setMsg("caso tenha recebido, entao funcionou!");
		email.addTo("sotosword@gmail.com");
		email.send();
		System.out.println("...Fim.....");
		
	}

}
