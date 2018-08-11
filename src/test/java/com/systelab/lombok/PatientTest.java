package com.systelab.lombok;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PatientTest {

    @Test
    public void testStrings() {
        Patient mario = Patient.newBuilder().name("Mario").surname("Fusco").email("mfusco@gmail.it").dob(LocalDate.of(1966,1,1)).build();
        assertEquals("Mario", mario.getName());
    }
}
