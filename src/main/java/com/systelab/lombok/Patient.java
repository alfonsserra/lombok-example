package com.systelab.lombok;

import lombok.*;

import java.time.LocalDate;
import java.util.Set;


@Builder(builderMethodName = "newBuilder", toBuilder = true)
@Getter
@EqualsAndHashCode
@ToString
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Patient {

    @Builder.Default
    private long created = System.currentTimeMillis();

    private final Long id;

    @NonNull
    private final String surname;

    @NonNull
    private final String name;

    private LocalDate dob;

    @Singular private Set<String> emails;

}