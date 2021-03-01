package com.wony.liveStudy11_Enum;

public enum customEnum {
    RED(1, "빨강"), BLUE(2, "파랑"), ORANGE(5, "주황"), YELLOW(6, "노랑");

    int val;
    String name;

    customEnum() {
        this.val = val;
    }

    customEnum(int val, String name) {
        this.val = val;
        this.name = name;
    }
}
