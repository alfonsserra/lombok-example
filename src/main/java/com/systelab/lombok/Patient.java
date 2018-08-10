package com.systelab.lombok;

import lombok.*;

import java.time.LocalDate;
import java.util.Date;

@Builder(builderMethodName = "newBuilder",toBuilder = true)
@Getter
@EqualsAndHashCode
@ToString
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Patient {

    @Builder.Default
    private long created = System.currentTimeMillis();

    private Long id;

    private String surname;

    private String name;

    private String email;

    private LocalDate dob;

}