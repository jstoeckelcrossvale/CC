package com.crossvale.carddispute;

/**
 * This class was automatically generated by the data modeler tool.
 */

@org.kie.api.definition.type.Label("ContactMethod")
public class ContactMethod implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label("phoneNumber")
   private java.lang.String phoneNumber;
   @org.kie.api.definition.type.Label("email")
   private java.lang.String email;
   @org.kie.api.definition.type.Label("street1")
   private java.lang.String street1;
   @org.kie.api.definition.type.Label("city")
   private java.lang.String city;
   @org.kie.api.definition.type.Label("state")
   private java.lang.String state;
   @org.kie.api.definition.type.Label("street2")
   private java.lang.String street2;
   @org.kie.api.definition.type.Label("postalCode")
   private java.lang.String postalCode;
   @org.kie.api.definition.type.Label("country")
   private java.lang.String country;
   @org.kie.api.definition.type.Label("language")
   private com.crossvale.carddispute.CodeValue language;
   @org.kie.api.definition.type.Label("medium")
   private com.crossvale.carddispute.CodeValue medium;

   public ContactMethod()
   {
   }

   public java.lang.String getPhoneNumber()
   {
      return this.phoneNumber;
   }

   public void setPhoneNumber(java.lang.String phoneNumber)
   {
      this.phoneNumber = phoneNumber;
   }

   public java.lang.String getEmail()
   {
      return this.email;
   }

   public void setEmail(java.lang.String email)
   {
      this.email = email;
   }

   public java.lang.String getStreet1()
   {
      return this.street1;
   }

   public void setStreet1(java.lang.String street1)
   {
      this.street1 = street1;
   }

   public java.lang.String getCity()
   {
      return this.city;
   }

   public void setCity(java.lang.String city)
   {
      this.city = city;
   }

   public java.lang.String getState()
   {
      return this.state;
   }

   public void setState(java.lang.String state)
   {
      this.state = state;
   }

   public java.lang.String getStreet2()
   {
      return this.street2;
   }

   public void setStreet2(java.lang.String street2)
   {
      this.street2 = street2;
   }

   public java.lang.String getPostalCode()
   {
      return this.postalCode;
   }

   public void setPostalCode(java.lang.String postalCode)
   {
      this.postalCode = postalCode;
   }

   public java.lang.String getCountry()
   {
      return this.country;
   }

   public void setCountry(java.lang.String country)
   {
      this.country = country;
   }

   public com.crossvale.carddispute.CodeValue getLanguage()
   {
      return this.language;
   }

   public void setLanguage(com.crossvale.carddispute.CodeValue language)
   {
      this.language = language;
   }

   public com.crossvale.carddispute.CodeValue getMedium()
   {
      return this.medium;
   }

   public void setMedium(com.crossvale.carddispute.CodeValue medium)
   {
      this.medium = medium;
   }

   public ContactMethod(java.lang.String phoneNumber, java.lang.String email,
         java.lang.String street1, java.lang.String city,
         java.lang.String state, java.lang.String street2,
         java.lang.String postalCode, java.lang.String country,
         com.crossvale.carddispute.CodeValue language,
         com.crossvale.carddispute.CodeValue medium)
   {
      this.phoneNumber = phoneNumber;
      this.email = email;
      this.street1 = street1;
      this.city = city;
      this.state = state;
      this.street2 = street2;
      this.postalCode = postalCode;
      this.country = country;
      this.language = language;
      this.medium = medium;
   }

}