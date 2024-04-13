package com.workintech.Spring2.dto;

import com.workintech.Spring2.model.Experience;

public record DeveloperResponse(String message,Integer id, String name, Double salary, Experience experience) {
}
