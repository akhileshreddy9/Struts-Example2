/**
 * 
 */
package com.demo.struts;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author Akhil
 *
 */
public class HelloAction extends ActionSupport {
	public String execute()
	{
		System.out.println("Hey its working");
		return SUCCESS;		  
	}

}
