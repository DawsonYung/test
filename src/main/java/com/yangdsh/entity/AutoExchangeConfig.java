package com.yangdsh.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class AutoExchangeConfig implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 自动换汇配置ID
     */
    private Long id;

    /**
     * 会员ID
     */
    private String memberId;

    /**
     * 换汇币种
     */
    private String exchCurrency;

    /**
     * 目标币种
     */
    private String targCurrency;

    /**
     * 预留金额
     */
    private BigDecimal reserveAmount;

    /**
     * 扩展信息
     */
    private String extension;

    /**
     * 初始创建人
     */
    private String creator;

    /**
     * 最后修改人
     */
    private String updator;

    /**
     * 备注
     */
    private String memo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getExchCurrency() {
        return exchCurrency;
    }

    public void setExchCurrency(String exchCurrency) {
        this.exchCurrency = exchCurrency;
    }

    public String getTargCurrency() {
        return targCurrency;
    }

    public void setTargCurrency(String targCurrency) {
        this.targCurrency = targCurrency;
    }

    public BigDecimal getReserveAmount() {
        return reserveAmount;
    }

    public void setReserveAmount(BigDecimal reserveAmount) {
        this.reserveAmount = reserveAmount;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getUpdator() {
        return updator;
    }

    public void setUpdator(String updator) {
        this.updator = updator;
    }


    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    @Override
    public String toString() {
        return "AutoExchangeConfig{" +
                "id=" + id +
                ", memberId='" + memberId + '\'' +
                ", exchCurrency='" + exchCurrency + '\'' +
                ", targCurrency='" + targCurrency + '\'' +
                ", reserveAmount=" + reserveAmount +
                ", extension='" + extension + '\'' +
                ", creator='" + creator + '\'' +
                ", updator='" + updator + '\'' +
                ", memo='" + memo + '\'' +
                '}';
    }
}
