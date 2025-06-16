package com.eazybytes.accounts.Dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Schema(
        name = "Customer",
        description = "Schema for Customer and Account Details"
)
public class CustomerDto {

    @Schema(
            description = "Name of the Customer",
            example = "John Doe"
    )
    @NotEmpty(message = "Name should not be empty")
    @Size(min = 5, max = 20, message = "Name should be between 5 and 20 characters")
    private String name;

    @Schema(
            description = "Email of the Customer",
            example = "0tZ0H@example.com"
    )
    @NotEmpty(message = "Email should not be empty")
    @Email(message = "Email should be valid")
    private String email;

    @Schema(
            description = "Mobile number of the Customer",
            example = "1234567890"
    )
    @NotEmpty(message = "Mobile number should not be empty")
    @Pattern(regexp = "[0-9]{10}", message = "Mobile number should be 10 digits")
    private String mobileNumber;

    @Schema(
            description = "Account details of the Customer"
    )
    private  AccountDto accountDto;
}
