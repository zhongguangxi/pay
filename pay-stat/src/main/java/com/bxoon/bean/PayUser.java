package com.bxoon.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="t_pay_user")
public class PayUser implements Serializable {
	/**
	 * 版本号
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private String id;
	private Integer age;
	private String name;
	private String addr;
	private String idnum;
	private String birthday;
	private String gender;


}
