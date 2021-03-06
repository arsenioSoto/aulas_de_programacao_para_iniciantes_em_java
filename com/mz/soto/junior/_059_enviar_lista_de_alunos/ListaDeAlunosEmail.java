package com.mz.soto.junior._059_enviar_lista_de_alunos;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class ListaDeAlunosEmail {
	
	static void enviar(String para, String assunto, String msg) throws EmailException {
		Email email = new SimpleEmail();
		email.setHostName("smtp.gmail.com");
		email.setSmtpPort(465);
		email.setAuthenticator(new DefaultAuthenticator("ProgramacaoCodigos", "sword2@14"));
		email.setSSLOnConnect(true);
		email.setFrom("Programacao Para Iniciantes <programacao.codigos@gmail.com>");
		email.setSubject(assunto);
		email.setMsg(msg);
		email.addTo(para); 
		email.send();
	}

}
