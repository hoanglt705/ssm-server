package com.s3s.ssm.dto;

import java.util.Date;

public class InvoiceDto extends AbstractCodeObject {
  private static final long serialVersionUID = 1L;
  private String foodTable;
  private EmployeeDto staff;
  private Date createdDate;
  private Date endedDate;
  private Long totalAmount = 0L;
  private Long totalReturnAmount = 0L;
  private Long totalPaymentAmount = 0L;
  private Long discount = 0L;
  private Long vatTax = 0L;
  private int vatPercent = 0;
  private Long income;
  private InvoiceStatus invoiceStatus;

  public Long getTotalAmount() {
    return totalAmount;
  }

  public void setTotalAmount(Long totalAmount) {
    this.totalAmount = totalAmount;
  }

  public Long getTotalReturnAmount() {
    return totalReturnAmount;
  }

  public void setTotalReturnAmount(Long totalReturnAmount) {
    this.totalReturnAmount = totalReturnAmount;
  }

  public Long getTotalPaymentAmount() {
    return totalPaymentAmount;
  }

  public void setTotalPaymentAmount(Long totalPaymentAmount) {
    this.totalPaymentAmount = totalPaymentAmount;
  }

  public Long getDiscount() {
    return discount;
  }

  public void setDiscount(Long discount) {
    this.discount = discount;
  }

  public Long getVatTax() {
    return vatTax;
  }

  public void setVatTax(Long vatTax) {
    this.vatTax = vatTax;
  }

  public Date getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(Date createdDate) {
    this.createdDate = createdDate;
  }


  public Date getEndedDate() {
    return endedDate;
  }

  public void setEndedDate(Date endedDate) {
    this.endedDate = endedDate;
  }

  public InvoiceStatus getInvoiceStatus() {
    return invoiceStatus;
  }

  public void setInvoiceStatus(InvoiceStatus invoiceStatus) {
    this.invoiceStatus = invoiceStatus;
  }

  public String getFoodTable() {
    return foodTable;
  }

  public void setFoodTable(String foodTable) {
    this.foodTable = foodTable;
  }

  public EmployeeDto getStaff() {
    return staff;
  }

  public void setStaff(EmployeeDto staff) {
    this.staff = staff;
  }

  public Long getIncome() {
    return income;
  }

  public void setIncome(Long income) {
    this.income = income;
  }

  public int getVatPercent() {
    return vatPercent;
  }

  public void setVatPercent(int vatPercent) {
    this.vatPercent = vatPercent;
  }

}
