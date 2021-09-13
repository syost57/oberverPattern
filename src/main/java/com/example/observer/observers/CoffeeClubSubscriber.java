package com.example.observer.observers;

import com.example.observer.event.CoffeeEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class CoffeeClubSubscriber {

    private static final String SHIPPED = "shipped";
    private static final String DELIVERED = "delivered";

    @EventListener
    public void propertyChange(final CoffeeEvent notification) {
        if(SHIPPED.equals(notification.getEventType()) && notification.getEventValue()){
            System.out.println("Your coffee was shipped!");
        }
        if(DELIVERED.equals(notification.getEventType()) && notification.getEventValue()){
            System.out.println("Your coffee was delivered!");
        }
    }

}
