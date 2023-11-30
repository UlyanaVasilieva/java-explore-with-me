package ru.practicum.category.dto;

import lombok.*;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.*;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CategoryDto {
    private Long id;
    @NotNull
    @NotBlank
    @Length(min = 1, max = 50)
    private String name;
}