package com.systelab.lombok;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class PatientTest {

    @Test
    public void basicAssignationTest() {
        Patient mario = Patient.newBuilder().name("Mario").surname("Fusco").email("mfusco@gmail.it").dob(LocalDate.of(1966, 1, 1)).build();
        assertEquals("Mario", mario.getName());
    }

    @Test
    public void patientWithoutSurnameTest() {

        Executable closureContainingCodeToTest = () -> {
            Patient mario = Patient.newBuilder().name("Mario").build();
        };
        assertThrows(NullPointerException.class, closureContainingCodeToTest, "surname is marked @NonNull but is null");
    }

    @Test
    public void multipleEmailTest() {
        Patient mario = Patient.newBuilder().name("Mario").surname("Fusco").email("mfusco@gmail.it").email("mfusco@hotmail.it").dob(LocalDate.of(1966, 1, 1)).build();
        assertTrue(mario.getEmails().contains("mfusco@gmail.it") && mario.getEmails().contains("mfusco@hotmail.it"));
    }
}
