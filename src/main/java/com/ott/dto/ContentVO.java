package com.ott.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/*
create table content(
contentNum number(5) not null primary key,
contentName varchar2(50) not null,
genre varchar2(30) not null,
actor varchar2(100) not null,
year number(4) not null,
story varchar2(1000) not null,
poster varchar2(30) not null
);

 */
@Setter
@Getter
@ToString

public class ContentVO {
private int contentNum;
private String contentName;
private String genre;
private String actor;
private int year;
private String story;
private String poster;
}
