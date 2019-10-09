package com.first;

public class Demo2 {
  private String msg;

public Demo2(String msg2) {
this.msg= msg2;
}

public String getMsg() {
	return msg;
}

public void setMsg(String msg) {
	this.msg = msg;
}
  
public String printMesage(){
	System.out.println(msg);
	return msg;
}
}
