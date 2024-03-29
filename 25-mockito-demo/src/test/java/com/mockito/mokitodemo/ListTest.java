package com.mockito.mokitodemo;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ListTest {
    @Test
    public void simpleTest(){
        List listMock = mock(List.class);
        when(listMock.size()).thenReturn(3);
        assertEquals(3, listMock.size());
    }

    @Test
    void multipleTest(){
        List listMock = mock(List.class);
        when(listMock.size()).thenReturn(1).thenReturn(2);
        assertEquals(1, listMock.size());
        assertEquals(2, listMock.size());
        assertEquals(2, listMock.size());
    }

    @Test
    void specificParametersTest(){
        List listMock = mock(List.class);
        when(listMock.get(0)).thenReturn("someString");
        assertEquals("someString", listMock.get(0));
        assertEquals(null, listMock.get(1));
    }

    @Test
    void genericParametersTest(){
        List listMock = mock(List.class);
        when(listMock.get(Mockito.anyInt())).thenReturn("someOtherString");
        assertEquals("someOtherString", listMock.get(0));
        assertEquals("someOtherString", listMock.get(1));
    }
}
