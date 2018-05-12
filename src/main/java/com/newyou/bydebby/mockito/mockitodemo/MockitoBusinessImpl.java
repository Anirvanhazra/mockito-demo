package com.newyou.bydebby.mockito.mockitodemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by anirv on 5/1/2018.
 */
public class MockitoBusinessImpl {
    private MockitoDataService mockitoDataService;
    Logger logger = LoggerFactory.getLogger(MockitoBusinessImpl.class);

    public MockitoBusinessImpl (MockitoDataService mds){
        super();
        this.mockitoDataService = mds;
    }
    
    public int findGreatestNumber() {
        int[] numberList = mockitoDataService.retrieveData();
        int greatestNum = Integer.MIN_VALUE;
        logger.info("Initial greatestNum: {}",greatestNum);
        for (int i:numberList) {
            if (i>greatestNum)
                greatestNum = i;
            logger.info("Current greatestNum: {}",greatestNum);
        }
        logger.info("Final greatestNum: {}",greatestNum);
        return greatestNum;
    }
}
