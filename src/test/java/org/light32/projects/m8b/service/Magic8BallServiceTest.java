package org.light32.projects.m8b.service;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * Magic8BallService unit test
 *
 * @author jwhitt 8/17/16
 */
public class Magic8BallServiceTest {
    @Test
    public void testRoll() throws Exception {
        Magic8BallService service = new Magic8BallService();

        Answer answer = service.roll();
        assertNotNull(answer);
        assertNotNull(answer.getAnswer());
    }


}