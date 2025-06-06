package com.ricardo.scalable.ecommerce.platform.libs_common.events;

import java.time.LocalDateTime;

public class UserRegisteredEvent {

    private Long userId;

    private String email;

    private String name;

    private LocalDateTime registeredAt;

    public UserRegisteredEvent() {
    }

    public UserRegisteredEvent(Long userId, String email, String name, LocalDateTime registeredAt) {
        this.userId = userId;
        this.email = email;
        this.name = name;
        this.registeredAt = registeredAt;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getRegisteredAt() {
        return registeredAt;
    }

    public void setRegisteredAt(LocalDateTime registeredAt) {
        this.registeredAt = registeredAt;
    }

}
