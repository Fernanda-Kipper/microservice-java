package com.kipper.eventsmicroservice.dtos;

public record EmailRequestDTO(String to, String subject, String body) {
}
