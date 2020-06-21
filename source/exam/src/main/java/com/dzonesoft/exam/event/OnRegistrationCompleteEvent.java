package com.dzonesoft.exam.event;

import com.dzonesoft.exam.domain.User;
import org.springframework.context.ApplicationEvent;

/**
 * @author dzonesoft
 */
public class OnRegistrationCompleteEvent extends ApplicationEvent {


    private final User user;


    public OnRegistrationCompleteEvent(final User user) {
        super(user);
        this.user = user;
    }

    public User getUser() {
        return user;
    }

}