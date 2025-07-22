package com.eazybytes.accounts.Dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Schema(
        name = "Account",
        description = "Account details of the Customer"
)
@Data
public class AccountDto {

    @Schema(
            description = "Account number of the Customer",
            example = "1234567890"
    )
    @NotEmpty(message = "Account number should not be empty")
    @Pattern(regexp = "[0-9]{10}", message = "Account number should be 10 digits")
    private Long accountNumber;

    @Schema(
            description = "Account type of the Customer",
            example = "Savings Account"
    )
    @NotEmpty(message = "Account type should not be empty")
    private String accountType;

    @Schema(
            description = "Branch address of the Customer",
            example = "123 Main Street, New York"
    )
    @NotEmpty(message = "Branch address should not be empty")
    private String branchAddress;
}
