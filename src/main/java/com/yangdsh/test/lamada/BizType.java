package com.yangdsh.test.lamada;


/**
 * <p>订单类型</p>
 */
public enum BizType {
    FUNDIN("I", "入款"),

    REFUND("B", "退款"),

    FUNDOUT("O", "出款");

    /** 代码 */
    private final String code;
    /** 信息 */
    private final String message;

    /**
     * 构造
     * @param code
     * @param message
     */
    BizType(String code, String message) {
        this.code = code;
        this.message = message;
    }


    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

}
