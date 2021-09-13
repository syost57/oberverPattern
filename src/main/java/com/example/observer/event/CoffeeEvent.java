package com.example.observer.event;

import lombok.Getter;
import lombok.Setter;
import org.springframework.context.ApplicationEvent;


public class CoffeeEvent extends ApplicationEvent {

    private @Getter @Setter String eventType;
    private @Getter @Setter Boolean eventValue;

    public CoffeeEvent(final Object source, final String eventType, final Boolean eventValue) {
        super(source);
        this.eventType = eventType;
        this.eventValue = eventValue;
    }
}
