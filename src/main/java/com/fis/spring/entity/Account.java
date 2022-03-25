package com.fis.spring.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "account")
public class Account {
 @Id
 @GeneratedValue(strategy = GenerationType.AUTO)

 private Long accountId;

 private String accountNo;

 private String cardNo;

 private String fullname;

 private Long amount;

 private Date issuedDate;


}
