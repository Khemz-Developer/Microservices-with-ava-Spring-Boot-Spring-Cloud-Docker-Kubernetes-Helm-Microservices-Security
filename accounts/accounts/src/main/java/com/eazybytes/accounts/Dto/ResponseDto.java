package com.eazybytes.accounts.Dto;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;

@Schema(
    name = "Response",
        description = "Schema for Response"
)
@Data @AllArgsConstructor
public class ResponseDto {

    @Schema(
            description = "Status code of the Response"

    )
    private String statusCode;

    @Schema(
            description = "Status message of the Response"

    )
    private String statusMsg;

}
