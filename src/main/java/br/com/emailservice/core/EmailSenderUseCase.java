package br.com.emailservice.core;

//Contrato que defini o comportamento da nossa aplicação.
public interface EmailSenderUseCase {
    //Contrato que defini
    void sendEmail(String toEmail, String subject, String body);
}
