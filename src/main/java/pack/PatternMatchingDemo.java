package pack;

import pack.model.Email;
import pack.model.SMS;
import pack.model.Sendable;
import pack.service.EmailSenderImpl;
import pack.service.Sender;
import pack.service.SmsSenderImpl;

import java.time.Instant;

public class PatternMatchingDemo {
    private final Sender<Email> emailSender = new EmailSenderImpl();
    private final Sender<SMS> smsSender = new SmsSenderImpl();

    public static void main(String[] args) {
        var patternMatchingDemo = new PatternMatchingDemo();
        patternMatchingDemo.performSend(new Email("john@foo.com", "jane@foo.com", "Greetings", "Hello John from Jane", Instant.now()));
        patternMatchingDemo.performSend(new SMS("tom@foo.com", "sam@foo.com", "Hello Tom from Sam", Instant.now()));
    }

    private void performSend(Sendable sendable) {
        switch (sendable) {
            case Email email -> emailSender.send(email);
            case SMS sms -> smsSender.send(sms);
        }
    }
}
