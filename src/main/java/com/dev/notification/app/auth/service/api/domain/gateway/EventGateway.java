package com.dev.notification.app.auth.service.api.domain.gateway;

import com.dev.notification.app.auth.service.api.domain.entity.Event;

public interface EventGateway {
    void save(final Event event);
}
