package com.dzonesoft.exam.listener;

import com.dzonesoft.exam.domain.User;
import com.dzonesoft.exam.event.OnRegistrationCompleteEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;


/**
 * @author dzonesoft
 */
@Component
public class EmailSendListener implements ApplicationListener<OnRegistrationCompleteEvent> {

    @Override
    @NonNull
    public void onApplicationEvent(OnRegistrationCompleteEvent event) {
        User user = event.getUser();
        System.out.println("User register Email sender :" + user.getUserName());
    }
}
