package com.dzmitry.servlets;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.time.LocalDateTime;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class DataCalculatorTest {
    @Spy
    private DataCalculator dataCalculator;

    @Test
    public void shouldAddDaysToCurrentDate() {
        LocalDateTime currentLocalDateTime = LocalDateTime.of(2019, 1, 1, 1, 1);
        LocalDateTime expectedLocalDateTime = LocalDateTime.of(2019, 1, 6, 1, 1);
        doReturn(currentLocalDateTime).when(dataCalculator).getCurrentDate();
        LocalDateTime actualLocalDateTime = dataCalculator.addDaysToCurrentDate(5);
        verify(dataCalculator).getCurrentDate();
        assertEquals(expectedLocalDateTime, actualLocalDateTime);
    }
}