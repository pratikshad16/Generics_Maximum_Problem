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
        Integer maximum = maximumValue.maximumValue(new Integer[]{3,1,2});
        Assert.assertEquals((Integer)3,maximum);
    }

    @Test
    public void givenMaxIntNumber_whenInSecondPosition_shouldReturnSame() {
        Integer maximum = maximumValue.maximumValue(new Integer[]{1,3,2});
        Assert.assertEquals((Integer)3,maximum);
    }

    @Test
    public void givenMaxIntNumber_whenInThirdPosition_shouldReturnSame() {
        Integer maximum = maximumValue.maximumValue(new Integer[]{2,1,3});
        Assert.assertEquals((Integer)3,maximum);
    }
    @Test
    public void givenMaxFloatNumber_whenInFirstPosition_shouldReturnSame() {
        Float maximum = maximumValue.maximumValue(new Float[]{2.2f,1.2f,1.1f});
        Assert.assertEquals((Float)2.2f,maximum);
    }
    @Test
    public void givenMaxFloatNumber_whenInSecondPosition_shouldReturnSame() {
        Float maximum = maximumValue.maximumValue(new Float[]{1.2f,2.2f,1.1f});
        Assert.assertEquals((Float)2.2f,maximum);
    }
    @Test
    public void givenMaxFloatNumber_whenInThirdPosition_shouldReturnSame() {
        Float maximum = maximumValue.maximumValue(new Float[]{1.1f,1.2f,2.2f});
        Assert.assertEquals((Float)2.2f,maximum);
    }
    @Test
    public void givenMaxStringValue_whenInFirstPosition_shouldReturnSame() {
        String maximum = maximumValue.maximumValue(new String[]{"lmnop","bcde","abc"});
        Assert.assertEquals((String)"lmnop",maximum);
    }
    @Test
    public void givenMaxStringValue_whenInSecondPosition_shouldReturnSame() {
        String maximum = maximumValue.maximumValue(new String[]{"abc","lmnop","bcde"});
        Assert.assertEquals((String)"lmnop",maximum);
    }
    @Test
    public void givenMaxStringValue_whenInThirdPosition_shouldReturnSame() {
        String maximum = maximumValue.maximumValue(new String[]{"abc","bcde","lmnop"});
        Assert.assertEquals((String)"lmnop",maximum);
    }
}
