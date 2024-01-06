package net.dev.admir.model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Customer {
    private Long id;
    private String lastName;
    private String firstName;
    private String email;
}
