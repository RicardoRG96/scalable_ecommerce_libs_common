package com.ricardo.scalable.ecommerce.platform.libs_common.events;

import java.time.LocalDate;

public class UserBirthdayEvent {

    private Long userId;

    private String name;

    private String email;

    private LocalDate birthday;

    public UserBirthdayEvent() {
    }

    public UserBirthdayEvent(Long userId, String name, String email, LocalDate birthday) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.birthday = birthday;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

}
