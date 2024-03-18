package com.ott.dto;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/*
 * create table bulletin(
	bulletinNum number(10) NOT NULL primary key,
	usernum number(10) NOT NULL ,
	bulletinTitle varchar2(30) NOT NULL,
	bulletinDate TIMESTAMP DEFAULT SYSTIMESTAMP,
	constraint FK_USERNUM foreign key (userNum) references member(usernum),
	bulletincontent NOT NULL VARCHAR2(1000)
	);
 */

@Setter
@Getter
@ToString
public class BulletionVO {
	
	private int bulletinNum;
	private int userNum;
	private String bulletinTitle;
	private Timestamp bulletinDate;
	private String bulletinContent;

}
