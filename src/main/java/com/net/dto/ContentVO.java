package com.net.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class ContentVO {

	/*
	 * create table content(
contentNum number(5) not null primary key,
contentName varchar2(50) not null,
genre varchar2(30) not null,
actor varchar2(100) not null,
year number(4) not null,
story varchar2(1000) not null,
poster varchar2(30) not null
);
create SEQUENCE content_seq start with 1 increment by 1;
	 * */
	
	int contentNum;
	String contentName;
	String genre;
	String actor;
	int year;
	String story;
	String poster;
	
}
