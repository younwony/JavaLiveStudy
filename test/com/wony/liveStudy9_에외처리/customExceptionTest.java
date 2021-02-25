package com.wony.liveStudy9_에외처리;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class customExceptionTest {

    @Test
    void customExceoption(){
        try {
            throw new customException();
        } catch (customException e) {
            e.printStackTrace();
        }
    }

}