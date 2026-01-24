package com.aashay.alert_service.repository;

import com.aashay.alert_service.entity.Alert;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlertRepository  extends JpaRepository<Alert, Long> {
}