package com.instana.pairing;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class TestMain {
    @Test
    public void should_fail() {
        assertThat("1 is not equal to 2", 1, is(equalTo(2)));
    }
}