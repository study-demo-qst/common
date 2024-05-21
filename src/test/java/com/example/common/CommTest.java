package com.example.common;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CommTest {
    @Test
    public void test() {
        Comm comm = new Comm();
        assertEquals("Comm", comm.getComm());
    }
}
