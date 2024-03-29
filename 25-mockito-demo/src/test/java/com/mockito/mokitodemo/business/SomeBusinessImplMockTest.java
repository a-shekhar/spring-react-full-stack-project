package com.mockito.mokitodemo.business;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class SomeBusinessImplMockTest {

    @Mock
    private DataService dataServiceMock;

    @InjectMocks
    private SomeBusinessImpl someBusinessImpl;


    @Test
    void test(){
       // DataService dataServiceMock = mock(DataService.class);
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {34,67,34,1});
       // SomeBusinessImpl someBusinessImpl = new SomeBusinessImpl(dataServiceMock);
        int result = someBusinessImpl.findTheGreatestFromAllData();
        assertEquals(67, result);
    }
}

