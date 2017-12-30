package com.s3s.ssm.dto;

import java.util.Date;

import com.s3s.ssm.dto.AbstractCodeObject;

public class PaymentDto extends AbstractCodeObject {
  private static final long serialVersionUID = 1L;
  private Date paymentDate;
  private String staff;
  private Long amount;
  private String notes;

  public Date getPaymentDate() {
    return paymentDate;
  }

  public void setPaymentDate(Date paymentDate) {
    this.paymentDate = paymentDate;
  }

  public String getStaff() {
    return staff;
  }

  public void setStaff(String staff) {
    this.staff = staff;
  }

  public Long getAmount() {
    return amount;
  }

  public void setAmount(Long amount) {
    this.amount = amount;
  }

  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }

}
