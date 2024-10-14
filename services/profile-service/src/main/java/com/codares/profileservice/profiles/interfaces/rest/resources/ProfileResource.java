package com.codares.profileservice.profiles.interfaces.rest.resources;

public record ProfileResource(
        Long id,
        String fullName,
        String email,
        String streetAddress) { }