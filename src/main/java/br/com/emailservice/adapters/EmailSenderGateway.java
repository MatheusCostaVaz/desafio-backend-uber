package br.com.emailservice.adapters;


//Contrato para que a nossa aplicação interja com serviços de fora,
// que no caso vai ser a AWS SES ou SendGrid
public interface EmailSenderGateway {
    void sendEmail(String toEmail, String subject, String body);
}
