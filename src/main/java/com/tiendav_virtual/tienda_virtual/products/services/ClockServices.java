package com.tiendav_virtual.tienda_virtual.products.services;

import java.util.List;

import com.tiendav_virtual.tienda_virtual.products.models.dtos.ClockDTO;

public interface ClockServices {
    void createClock(ClockDTO clockDTO);
    List<ClockDTO> findClocks();
    void purchaseClock(long id);
}
