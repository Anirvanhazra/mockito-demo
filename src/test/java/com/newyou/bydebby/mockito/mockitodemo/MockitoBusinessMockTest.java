package com.newyou.bydebby.mockito.mockitodemo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertEquals;
//import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class MockitoBusinessMockTest {

Logger logger = LoggerFactory.getLogger(MockitoBusinessMockTest.class);

    @Mock
    MockitoDataService mockitoDataService;

    @InjectMocks
    MockitoBusinessImpl mockitoBusiness;

    @Test
    public void testMockitoBusinessImpl_7nums() {
        logger.info("Testing method: testMockitoBusinessImpl_7nums");
        when(mockitoDataService.retrieveData()).thenReturn(new int[] {2,4,6,18,45,31,40});
        assertEquals(45,mockitoBusiness.findGreatestNumber());
    }

    @Test
    public void testMockitoBusinessImpl_3nums() {
        logger.info("Testing class: testMockitoBusinessImpl_3nums");
        when(mockitoDataService.retrieveData()).thenReturn(new int[] {56,31,76});
        assertEquals(76,mockitoBusiness.findGreatestNumber());
    }


}


