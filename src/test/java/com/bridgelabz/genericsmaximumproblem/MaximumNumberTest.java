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
    public void givenMaxIntNumber_whenInFirstPosition_shouldReturnSame() {
        Integer maximum = maximumValue.maximumIntegerValue(3,2,1);
        Assert.assertEquals((Integer)3,maximum);
    }

    @Test
    public void givenMaxIntNumber_whenInSecondPosition_shouldReturnSame() {
        Integer maximum = maximumValue.maximumIntegerValue(2,3,1);
        Assert.assertEquals((Integer)3,maximum);
    }

    @Test
    public void givenMaxIntNumber_whenInThirdPosition_shouldReturnSame() {
        Integer maximum = maximumValue.maximumIntegerValue(2,1,3);
        Assert.assertEquals((Integer)3,maximum);
    }
    @Test
    public void givenMaxFloatNumber_whenInFirstPosition_shouldReturnSame() {
        Float maximum = maximumValue.maximumFloatValue(2.2f,1.3f,1.1f);
        Assert.assertEquals((Float)2.2f,maximum);
    }
    @Test
    public void givenMaxFloatNumber_whenInSecondPosition_shouldReturnSame() {
        Float maximum = maximumValue.maximumFloatValue(1.3f,2.2f,1.1f);
        Assert.assertEquals((Float)2.2f,maximum);
    }
    @Test
    public void givenMaxFloatNumber_whenInThirdPosition_shouldReturnSame() {
        Float maximum = maximumValue.maximumFloatValue(1.3f,1.1f,2.2f);
        Assert.assertEquals((Float)2.2f,maximum);
    }
    @Test
    public void givenMaxStringValue_whenInFirstPosition_shouldReturnSame() {
        String maximum = maximumValue.maximumStringValue("banana","peach","abc");
        Assert.assertEquals((String)"banana",maximum);
    }
    @Test
    public void givenMaxStringValue_whenInSecondPosition_shouldReturnSame() {
        String maximum = maximumValue.maximumStringValue("peach","banana","abc");
        Assert.assertEquals((String)"banana",maximum);
    }
    @Test
    public void givenMaxStringValue_whenInThirdPosition_shouldReturnSame() {
        String maximum = maximumValue.maximumStringValue("peach","abc","banana");
        Assert.assertEquals((String)"banana",maximum);
    }
}
