package io.schultz.dustin.todoapp.endpoint;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * TODO: Describe this class (The first line - until the first dot - will interpret as the brief description).
 */
@Component
@Endpoint(id ="readiness" )
public class ReadinessEndpoint {
    private String ready = "NOT_READY";

    @ReadOperation
    public String getReadiness() {
        return ready;
    }

    @EventListener(ApplicationReadyEvent.class)
    public void setReady() {
        this.ready = "READY";
    }
}
