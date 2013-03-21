package com.mybillr.db.struts.forms;

import java.math.*;
import java.text.*;
import org.apache.struts.action.*;
import javax.servlet.http.HttpServletRequest;
import com.mybillr.db.dto.*;

public class FriendsFindByUser2Form extends ActionForm
{
	protected String friendsWith;

	protected String crudMethod;

	/** 
	 * Sets the value of friendsWith
	 */
	public void setFriendsWith(String friendsWith)
	{
		this.friendsWith = friendsWith;
	}

	/** 
	 * Gets the value of friendsWith
	 */
	public String getFriendsWith()
	{
		return friendsWith;
	}

	/** 
	 * Sets the value of crudMethod
	 */
	public void setCrudMethod(String crudMethod)
	{
		this.crudMethod = crudMethod;
	}

	/** 
	 * Gets the value of crudMethod
	 */
	public String getCrudMethod()
	{
		return crudMethod;
	}

}
