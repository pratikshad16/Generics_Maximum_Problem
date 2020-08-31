package com.bridgelabz.genericsmaximumproblem;

import com.bridgelabz.genericsmaximumproblem.service.MaximumNumber;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MaximumNumberTest {
    MaximumNumber maximumValue = null;

    @Before
    public void createObject()
    {
        maximumValue = new MaximumNumber();
    }
    @Test
    public void givenMaxNumber_whenInFirstPosition_shouldReturnSame() {
        Integer maximum = maximumValue.maximumValue(3,2,1);
        Assert.assertEquals((Integer)3,maximum);
    }

    @Test
    public void givenMaxNumber_whenInSecondPosition_shouldReturnSame() {
        Integer maximum = maximumValue.maximumValue(2,3,1);
        Assert.assertEquals((Integer)3,maximum);
    }

    @Test
    public void givenMaxNumber_whenInThirdPosition_shouldReturnSame() {
        Integer maximum = maximumValue.maximumValue(2,1,3);
        Assert.assertEquals((Integer)3,maximum);
    }
}
