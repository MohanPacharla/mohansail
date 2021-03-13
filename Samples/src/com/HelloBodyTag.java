package com;

import java.io.IOException;
import java.io.StringWriter;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class HelloBodyTag extends SimpleTagSupport {
 
	 private String message;
	 public void setMessage(String msg) {
		 this.message=msg;
		 
	   }
	 StringWriter sw=new StringWriter();
	 public void doTag() throws JspException,IOException {
		 if(message !=null) {
			           JspWriter out=getJspContext().getOut();
			 
		     }
		     else {
			        getJspBody().invoke(sw);
			        getJspContext().getOut().println(sw.toString());
			 
		 }
	 }
}
