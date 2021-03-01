package com.wony.liveStudy11_Enum;

import org.junit.jupiter.api.Test;

import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class customEnumTest {
    
    @Test
    void useEunm(){
        customEnum red = customEnum.RED;
        System.out.println(red);
        System.out.println(red.val);
    }
    @Test
    void valuesEnum(){
        customEnum[] values = customEnum.values();
        for (customEnum value : values) {
            System.out.println(value);
        }
    }

    @Test
    void ordinalEnum(){
        int ordinal = customEnum.YELLOW.ordinal();
        System.out.println(ordinal);
    }

    @Test
    void valueOfEnum(){
        customEnum yellow = customEnum.valueOf("YELLOW");
        System.out.println(yellow);
    }
    @Test
    void useEunm2(){
        customEnum red = customEnum.YELLOW;
        System.out.println(red.name());
    }

    @Test
    void setEnum(){
        /* 전체 상수가 있는 Enum Set 생성 */
        EnumSet<customEnum> allOf = EnumSet.allOf(customEnum.class);
        System.out.println("EnumSet.allOf => " + allOf);

        /* 복사본 생성 */
        EnumSet<customEnum> clone = allOf.clone();
        System.out.println("clone => " + clone);

        /* EnumSet을 이용한 복사본 생성 */
        EnumSet<customEnum> copyOf = EnumSet.copyOf(allOf);
        System.out.println("copyOf => " + copyOf);

        /* 특정 상수만 생성 */
        EnumSet<customEnum> enumOf = EnumSet.of(customEnum.BLUE, customEnum.RED);
        System.out.println("EnumSet.of => " + enumOf);

        /* 특정 상수 제외하고 생성 */
        EnumSet<customEnum> complementOf = EnumSet.complementOf(enumOf);
        System.out.println("EnumSet.complementOf = > " + complementOf);

        /* 빈 Enum Set 생성 */
        EnumSet<customEnum> noneOf = EnumSet.noneOf(customEnum.class);
        System.out.println("EnumSet.noneOf => " + noneOf);

        /* 특정 범위 생성*/
        EnumSet<customEnum> range = EnumSet.range(customEnum.BLUE, customEnum.YELLOW);
        System.out.println("EnumSet.range => " + range);
    }

    @Test
    void tewst(){
        String[] test = new String[]{"1","2"};
        String[] clone = test.clone();
        System.out.println(test.hashCode() == clone.hashCode());

        Set<String> strings = new HashSet<>();
        strings.add("test");

        Object clone1 = ((HashSet<String>) strings).clone();
        strings.clear();
        System.out.println(strings);
        System.out.println(clone1);
        System.out.println(clone1.hashCode() == strings.hashCode());
    }

}