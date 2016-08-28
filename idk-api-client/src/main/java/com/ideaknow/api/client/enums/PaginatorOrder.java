package com.ideaknow.api.client.enums;

public enum PaginatorOrder {

    ASC("asc"), DESC("desc"), NFC("nfc");

    private final String value;

    /**
     * Constructor
     *
     * @param value
     */
    private PaginatorOrder(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
