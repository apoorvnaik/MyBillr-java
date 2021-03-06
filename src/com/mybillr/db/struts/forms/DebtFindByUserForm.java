package com.mybillr.db.struts.forms;

import java.math.*;
import java.text.*;
import org.apache.struts.action.*;
import javax.servlet.http.HttpServletRequest;
import com.mybillr.db.dto.*;

public class DebtFindByUserForm extends ActionForm
{
	protected String owedBy;

	protected String crudMethod;

	/** 
	 * Sets the value of owedBy
	 */
	public void setOwedBy(String owedBy)
	{
		this.owedBy = owedBy;
	}

	/** 
	 * Gets the value of owedBy
	 */
	public String getOwedBy()
	{
		return owedBy;
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
