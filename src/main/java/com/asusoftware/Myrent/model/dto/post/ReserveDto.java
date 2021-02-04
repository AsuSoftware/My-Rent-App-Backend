package com.asusoftware.Myrent.model.dto.post;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.UUID;

/**
 * My-rent Created by Antonio on 2/4/2021
 */
@Getter
@Setter
@ToString
public class ReserveDto {
    private UUID userId;
    @NotNull @JsonFormat(pattern="yyyy-MM-dd") private Date startDate;
    @NotNull @JsonFormat(pattern="yyyy-MM-dd") private Date endDate;
}
