package com.example.maven_common;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.example.maven_common.Comm;

public class CommTest {
    @Test
    public void test() {
        Comm comm = new Comm();
        assertEquals("Comm", comm.getComm());
    }
}
