package org.example.ktpm_20116031_votandat_lab6.backend.services;

import jakarta.jms.Message;

public interface OrderProcess {
    void processOrder(Message message);
}
