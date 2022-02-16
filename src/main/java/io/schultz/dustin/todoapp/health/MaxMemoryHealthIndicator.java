package io.schultz.dustin.todoapp.health;


import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.boot.actuate.health.Status;
import org.springframework.stereotype.Component;

/**
 * TODO: Describe this class (The first line - until the first dot - will interpret as the brief description).
 */
@Component
public class MaxMemoryHealthIndicator implements HealthIndicator {
    @Override
    public Health getHealth(boolean includeDetails) {
        final boolean invalid = Runtime.getRuntime().maxMemory() < (100 * 1024 * 1024);
        Status status = invalid ? Status.DOWN : Status.UP;
        return Health.status(status).build();
    }

    @Override
    public Health health() {
        return null;
    }
}
