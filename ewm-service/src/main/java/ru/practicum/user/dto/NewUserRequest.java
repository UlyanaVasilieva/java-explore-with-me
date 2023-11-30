package ru.practicum.user.dto;

import lombok.*;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.*;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class NewUserRequest {
    @NotNull
    @NotBlank
    @Length(min = 2, max = 250)
    private String name;
    @Email
    @NotNull
    @NotBlank
    @Length(min = 6, max = 254)
    private String email;
}