package com.eazybytes.loans.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.AllArgsConstructor;
import lombok.Data;

@Schema(
    description = "Schema for loan details"
)
@Data @AllArgsConstructor
public class LoansDto {

    @NotEmpty(message = "Mobile Number cannot be empty or null")
    @Pattern(regexp = "[0-9]{10}", message = "Mobile Number should be 10 digits")
    @Schema(
            description = "Mobile Number of customer",
            example = "1234567890"
    )
    private String mobileNumber;

    @NotEmpty(message = "Loan Number cannot be empty or null")
    @Pattern(regexp = "[0-9]{12}", message = "Loan Number should be 12 digits")
    @Schema(
            description = "Loan Number of customer",
            example = "123456789012"
    )
    private String loanNumber;

    @NotEmpty(message = "Loan Type cannot be empty or null")
    @Schema(
            description = "Loan Type of customer",
            example = "Home Loan"
    )
    private String loanType;

    @Positive(message = "Total Loan should be greater than 0")
    @Schema(
            description = "Total Loan of customer",
            example = "100000"
    )
    private int totalLoan;

    @PositiveOrZero(message = "Amount Paid should be greater than or equal to 0")
    @Schema(
            description = "Amount Paid by customer",
            example = "50000"
    )
    private int amountPaid;

    @PositiveOrZero(message = "Outstanding Amount should be greater than or equal to 0")
    @Schema(
            description = "Outstanding Amount of customer",
            example = "50000"
    )
    private int outstandingAmount;
}
