package com.company;

public class Customer {

  int customerId;

  String customername;

  long customerContact;

  Address customerAddress;

  public Address getCustomerAddress() {

    return this.customerAddress;
  }

  public void setCustomerAddress(Address customerAddress) {

    this.customerAddress = customerAddress;
  }

  public int getCustomerId() {

    return this.customerId;
  }

  public void setCustomerId(int customerId) {

    this.customerId = customerId;
  }

  public String getCustomername() {

    return this.customername;
  }

  public void setCustomername(String customername) {

    this.customername = customername;
  }

  public long getCustomerContact() {

    return this.customerContact;
  }

  public void setCustomerContact(long customerContact) {

    this.customerContact = customerContact;
  }

  @Override
  public String toString() {

    return "Customer [customerId=" + this.customerId + ", customername=" + this.customername + ", customerContact="
        + this.customerContact + ", customerAddress=" + this.customerAddress + "]";
  }

  public void customerData() {

    System.out.println("CustomerId=" + this.customerId + "customername=" + this.customername + "customerContact="
        + this.customerContact);
    System.out.println(this.customerAddress);

  }

}
