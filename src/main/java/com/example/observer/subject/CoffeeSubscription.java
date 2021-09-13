package com.example.observer.subject;

import com.example.observer.event.CoffeeEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

@Component
public class CoffeeSubscription {

    private static final String SHIPPED = "shipped";
    private static final String DELIVERED = "delivered";

    private Boolean shipped;
    private Boolean delivered;

    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    private CoffeeSubscription() {}

    public void notifyShipped(final Boolean shipped){
        applicationEventPublisher.publishEvent(new CoffeeEvent(this, SHIPPED, Boolean.TRUE));
        this.shipped = shipped;
    }

    public void notifyDelivered(final Boolean delivered){
        applicationEventPublisher.publishEvent(new CoffeeEvent(this, DELIVERED, Boolean.TRUE));
        this.delivered = delivered;
    }
}
