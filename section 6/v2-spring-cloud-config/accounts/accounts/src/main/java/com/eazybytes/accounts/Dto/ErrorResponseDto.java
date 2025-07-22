package com.eazybytes.accounts.Dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;
@Data
@AllArgsConstructor
@Schema(name = "ErrorResponseDto", description = "Schema for Error Response")
public class ErrorResponseDto {

    @Schema(description = "Path of the API", example = "/accounts/1234")
    private String apiPath;
    @Schema(description = "Status code of the Response")
    private HttpStatus errorCode;
    @Schema(description = "Status message of the Response")
    private String errorMessage;
    @Schema(description = "Time of the Error", example = "2023-01-01T00:00:00")
    private LocalDateTime errorTime;
}
