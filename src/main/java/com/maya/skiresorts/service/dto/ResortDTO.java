package com.maya.skiresorts.service.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ResortDTO {
    private long resortId;
    private String resortName;
    private Integer squareFootage;
    private Integer verticalFeet;
    private Integer numLifts;
    private Integer numRuns;
    private String mapLink;
}
