package pack.service;

import pack.model.Email;

public class EmailSenderImpl implements Sender<Email> {

    @Override
    public void send(Email email) {
        //Do something with the email
        System.out.println(email);
    }
}
