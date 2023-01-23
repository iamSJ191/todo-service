package dev.captainsj.todoservice.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Version;

public record Todo(@Id Integer id, Integer userId, String title, @Version Integer version) {
}