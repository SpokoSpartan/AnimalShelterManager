package com.pwr.it.app.data.domain.dto.response;

import io.micronaut.core.annotation.Introspected;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Introspected
@NoArgsConstructor
@AllArgsConstructor
public class StatusResponse implements Comparable<StatusResponse> {

    private String status;
    private Date statusBeginning;
    private Date statusEnd;

    @Override
    public int compareTo(StatusResponse statusResponse) {
        return this.statusBeginning.compareTo(statusResponse.statusBeginning);
    }

}
