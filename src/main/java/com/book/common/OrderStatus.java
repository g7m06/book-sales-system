package com.book.common;

public final class OrderStatus {

    public static final int PENDING_PAYMENT = 0;
    public static final int PAID = 1;
    public static final int SHIPPED = 2;
    public static final int COMPLETED = 3;
    public static final int CANCELLED = 4;

    private OrderStatus() {
    }
}
