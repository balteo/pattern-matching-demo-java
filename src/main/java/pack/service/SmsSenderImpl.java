package pack.service;

import pack.model.SMS;

public class SmsSenderImpl implements Sender<SMS> {

    @Override
    public void send(SMS sms) {
        //Do something with the SMS
        System.out.println(sms);
    }
}
