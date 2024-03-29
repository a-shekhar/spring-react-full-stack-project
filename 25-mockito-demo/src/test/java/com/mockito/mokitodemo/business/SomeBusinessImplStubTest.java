package com.mockito.mokitodemo.business;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SomeBusinessImplStubTest {
    @Test
    void test(){
        DataServiceStub stub = new DataServiceStub();
        SomeBusinessImpl someBusinessImpl = new SomeBusinessImpl(stub);
        int result = someBusinessImpl.findTheGreatestFromAllData();
        assertEquals(67, result);
    }
}

class DataServiceStub implements DataService{
    @Override
    public int[] retrieveAllData(){
        return new int[] {21,3,14,67,33};
    }
}
