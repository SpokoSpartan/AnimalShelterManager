package com.pwr.it.app.data.domain.dto.response;

import io.micronaut.core.annotation.Introspected;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Introspected
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class AnimalLocationResponse {

    private String fullName;
    private String phone;
    private String email;
    private String address;
    private AnimalLocationType locationType;

}
