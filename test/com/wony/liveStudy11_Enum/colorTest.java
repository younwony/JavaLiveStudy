package com.wony.liveStudy11_Enum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class colorTest {

    @Test
    void test(){
        color blue = color.BLUE;
        System.out.println(blue.ordinal());
    }

}