package com.net.dto;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class BulletinVO {

	/*
	 * create table bulletin(
bulletinNum number(10) NOT NULL primary key,
usernum number(10) NOT NULL ,
bulletinTitle varchar2(30) NOT NULL,
bulletinDate TIMESTAMP DEFAULT SYSTIMESTAMP,
constraint FK_USERNUM foreign key (userNum) references member(usernum)
);

	 * */
	
	int bulletinNum;
	int userNum;
	String bulletinTitle;
	Date bulletinDate;
	String bulletinContent;
}
