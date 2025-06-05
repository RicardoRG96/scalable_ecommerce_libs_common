package com.ricardo.scalable.ecommerce.platform.libs_common.events;

import java.time.LocalDate;

public class UserBirthdayEvent {

    private Long userId;

    private LocalDate birthday;

    public UserBirthdayEvent() {
    }

    public UserBirthdayEvent(Long userId, LocalDate birthday) {
        this.userId = userId;
        this.birthday = birthday;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

}
