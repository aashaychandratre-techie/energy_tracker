package com.aashay.device_service.service;

import com.aashay.device_service.dto.DeviceDto;

import java.util.List;

public interface DeviceService {
    public DeviceDto getDeviceById(Long id);

    public DeviceDto createDevice(DeviceDto input);

    public DeviceDto updateDevice(Long id, DeviceDto input);

    public void deleteDevice(Long id);

    public List<DeviceDto> getAllDevicesByUserId(Long userId);


}
