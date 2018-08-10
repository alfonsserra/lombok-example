package com.systelab.lombok;

import java.time.LocalDate;

public class LombokExample {
    public static void main(String[] args) {
        Patient mario = Patient.newBuilder().name("Mario").surname("Fusco").email("mfusco@gmail.it").dob(LocalDate.of(1966,1,1)).build();
    }
}
