package com.crossvale.carddispute;

/**
 * This class was automatically generated by the data modeler tool.
 */

@org.kie.api.definition.type.Label("Customer")
public class Customer implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label("customerNr")
   private java.lang.String customerNr;
   @org.kie.api.definition.type.Label("customerName")
   private java.lang.String customerName;
   @org.kie.api.definition.type.Label("status")
   private java.lang.String status;
   @org.kie.api.definition.type.Label("id")
   private java.lang.String id;
   @org.kie.api.definition.type.Label("issuePlace")
   private java.lang.String issuePlace;
   @org.kie.api.definition.type.Label("issueDate")
   private java.util.Date issueDate;
   @org.kie.api.definition.type.Label("expirationDate")
   private java.util.Date expirationDate;

   @org.kie.api.definition.type.Label("address")
   private com.crossvale.carddispute.Address address;

   @org.kie.api.definition.type.Label("nationalityCode")
   private java.lang.String nationalityCode;

   @org.kie.api.definition.type.Label("birthDate")
   private java.util.Date birthDate;

   @org.kie.api.definition.type.Label("email")
   private java.lang.String email;

   @org.kie.api.definition.type.Label(value = "phoneNr")
   private com.crossvale.carddispute.PhoneNr phoneNr;

   public Customer()
   {
   }

   public java.lang.String getCustomerNr()
   {
      return this.customerNr;
   }

   public void setCustomerNr(java.lang.String customerNr)
   {
      this.customerNr = customerNr;
   }

   public java.lang.String getCustomerName()
   {
      return this.customerName;
   }

   public void setCustomerName(java.lang.String customerName)
   {
      this.customerName = customerName;
   }

   public java.lang.String getStatus()
   {
      return this.status;
   }

   public void setStatus(java.lang.String status)
   {
      this.status = status;
   }

   public java.lang.String getId()
   {
      return this.id;
   }

   public void setId(java.lang.String id)
   {
      this.id = id;
   }

   public java.lang.String getIssuePlace()
   {
      return this.issuePlace;
   }

   public void setIssuePlace(java.lang.String issuePlace)
   {
      this.issuePlace = issuePlace;
   }

   public java.util.Date getIssueDate()
   {
      return this.issueDate;
   }

   public void setIssueDate(java.util.Date issueDate)
   {
      this.issueDate = issueDate;
   }

   public java.util.Date getExpirationDate()
   {
      return this.expirationDate;
   }

   public void setExpirationDate(java.util.Date expirationDate)
   {
      this.expirationDate = expirationDate;
   }

   public com.crossvale.carddispute.Address getAddress()
   {
      return this.address;
   }

   public void setAddress(com.crossvale.carddispute.Address address)
   {
      this.address = address;
   }

   public java.lang.String getNationalityCode()
   {
      return this.nationalityCode;
   }

   public void setNationalityCode(java.lang.String nationalityCode)
   {
      this.nationalityCode = nationalityCode;
   }

   public java.util.Date getBirthDate()
   {
      return this.birthDate;
   }

   public void setBirthDate(java.util.Date birthDate)
   {
      this.birthDate = birthDate;
   }

   public java.lang.String getEmail()
   {
      return this.email;
   }

   public void setEmail(java.lang.String email)
   {
      this.email = email;
   }

   public com.crossvale.carddispute.PhoneNr getPhoneNr()
   {
      return this.phoneNr;
   }

   public void setPhoneNr(com.crossvale.carddispute.PhoneNr phoneNr)
   {
      this.phoneNr = phoneNr;
   }

   public Customer(java.lang.String customerNr, java.lang.String customerName,
         java.lang.String status, java.lang.String id,
         java.lang.String issuePlace, java.util.Date issueDate,
         java.util.Date expirationDate,
         com.crossvale.carddispute.Address address,
         java.lang.String nationalityCode, java.util.Date birthDate,
         java.lang.String email, com.crossvale.carddispute.PhoneNr phoneNr)
   {
      this.customerNr = customerNr;
      this.customerName = customerName;
      this.status = status;
      this.id = id;
      this.issuePlace = issuePlace;
      this.issueDate = issueDate;
      this.expirationDate = expirationDate;
      this.address = address;
      this.nationalityCode = nationalityCode;
      this.birthDate = birthDate;
      this.email = email;
      this.phoneNr = phoneNr;
   }

}