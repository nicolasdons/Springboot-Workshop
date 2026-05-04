package com.projetospringjava.demo.entities.enums;

public enum OrderStatus {

    Watting_Payment(1),
    Processing(2),
    Ok(3);

    private int code;

    private OrderStatus(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static OrderStatus valueOf(int code) throws IllegalAccessException {
        for (OrderStatus value : OrderStatus.values()) {
            if (value.getCode() == code) {
                return value;
            }
        }
        throw new IllegalAccessException("Invalid OrderStatus code");
    }
}