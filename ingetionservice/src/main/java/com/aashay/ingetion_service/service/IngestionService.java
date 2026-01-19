package com.aashay.ingetion_service.service;

import com.aashay.ingetion_service.dto.EnergyUsageDto;
import org.springframework.kafka.core.KafkaTemplate;

public interface IngestionService {
    public void ingestEnergyUsage(EnergyUsageDto input);
}
