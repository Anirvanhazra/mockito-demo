package com.newyou.bydebby.mockito.mockitodemo;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runner.RunWith;

public class MockitoBusinessStubTest {


    @Test
    public void testMockitoBusinessImpl() {
        MockitoBusinessImpl mockitoBusiness = new MockitoBusinessImpl(new MockitoDataImpl());
        int greatestNumberTest = mockitoBusiness.findGreatestNumber();
        assertEquals(76,greatestNumberTest);
    }


}


class MockitoDataImpl implements MockitoDataService {

    @Override
    public int[] retrieveData(){
        int[] numberToReturn = new int[]{6,8,12,76,2,3};
        return numberToReturn;
    }
}
