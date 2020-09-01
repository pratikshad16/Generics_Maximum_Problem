package com.bridgelabz.genericsmaximumproblem;

import com.bridgelabz.genericsmaximumproblem.service.MaximumNumber;
import org.junit.Assert;
import org.junit.Test;

public class MaximumNumberTest {

    @Test
    public void givenMaxIntNumber_whenInFirstPosition_shouldReturnSame() {
        Assert.assertEquals((Integer) 3, MaximumNumber.maximumValue(3, 2, 1));
    }

    @Test
    public void givenMaxIntNumber_whenInSecondPosition_shouldReturnSame() {
        Assert.assertEquals((Integer) 3, MaximumNumber.maximumValue(2, 3, 1));
    }

    @Test
    public void givenMaxIntNumber_whenInThirdPosition_shouldReturnSame() {

        Assert.assertEquals((Integer) 3, MaximumNumber.maximumValue(2, 1, 3));
    }

    @Test
    public void givenMaxFloatNumber_whenInFirstPosition_shouldReturnSame() {

        Assert.assertEquals((Float) 2.2f, MaximumNumber.maximumValue(2.2f, 1.2f, 1.1f));
    }

    @Test
    public void givenMaxFloatNumber_whenInSecondPosition_shouldReturnSame() {
        Assert.assertEquals((Float) 2.2f, MaximumNumber.maximumValue(1.2f, 2.2f, 1.1f));
    }

    @Test
    public void givenMaxFloatNumber_whenInThirdPosition_shouldReturnSame() {
        Assert.assertEquals((Float) 2.2f, MaximumNumber.maximumValue(1.1f, 1.2f, 2.2f));
    }

    @Test
    public void givenMaxStringValue_whenInFirstPosition_shouldReturnSame() {
        Assert.assertEquals((String) "lmnop", MaximumNumber.maximumValue("lmnop", "abc", "bcde"));
    }

    @Test
    public void givenMaxStringValue_whenInSecondPosition_shouldReturnSame() {
        Assert.assertEquals((String) "lmnop", MaximumNumber.maximumValue("abc", "lmnop", "bcde"));
    }

    @Test
    public void givenMaxStringValue_whenInThirdPosition_shouldReturnSame() {
        Assert.assertEquals((String) "lmnop", MaximumNumber.maximumValue("bcde", "abc", "lmnop"));
    }
}