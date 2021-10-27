package com.santhosh.encryption.listener.repository;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.santhosh.encryption.listener.encryption.Encrypted;

import java.util.UUID;

@Entity
public class Phone {
    @Id
    private UUID id;

    @Column(name = "phone_number")
    @Encrypted
    private String phoneNumber;

    protected Phone() {
    }

    public Phone(String phoneNumber) {
        this.id = UUID.randomUUID();
        this.phoneNumber = phoneNumber;
    }

    public UUID getId() {
        return id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
