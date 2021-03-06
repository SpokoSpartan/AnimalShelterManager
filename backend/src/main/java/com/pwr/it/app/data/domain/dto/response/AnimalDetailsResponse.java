package com.pwr.it.app.data.domain.dto.response;

import io.micronaut.core.annotation.Introspected;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.Set;

@Getter
@Introspected
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class AnimalDetailsResponse {

    private Long id;
    private String name;
    private String species;
    private String race;
    private String status;
    private String description;
    private Date birthDate;
    private String sex;
    private String imageUrl;
    private Boolean sterilized;
    private Date shelterJoinDate;
    private Boolean archived;
    private AnimalLocationResponse animalLocation;
    private Set<TreatmentHistoryResponse> treatmentHistories;
    private AdoptionResponse adoption;

}
