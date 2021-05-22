package com.hexor;

import java.util.Date;

public class ErrorDetails {
Date date;
String msg;

public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}
public String getMsg() {
	return msg;
}
public void setMsg(String msg) {
	this.msg = msg;
}
public ErrorDetails() {
	super();
}
public ErrorDetails(Date date, String msg) {
	super();
	this.date = date;
	this.msg = msg;
}

}
