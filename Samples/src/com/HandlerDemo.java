package com;

import java.io.IOException;
import java.util.Calendar;

import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class HandlerDemo extends TagSupport {
	public int doStartTag() {
		JspWriter out=pageContext.getOut();
		try {
			out.println("<h1 style=color:green>WELLCOME </h1><br>");
			out.println("Date: " + Calendar.getInstance().getTime());
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		return SKIP_BODY;
	}

}
