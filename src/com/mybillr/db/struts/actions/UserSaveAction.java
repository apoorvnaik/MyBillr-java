package com.mybillr.db.struts.actions;

import org.apache.struts.*;
import org.apache.struts.action.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.*;
import java.math.*;
import com.mybillr.db.dao.*;
import com.mybillr.db.dto.*;
import com.mybillr.db.factory.*;
import com.mybillr.db.struts.forms.*;

public class UserSaveAction extends Action
{
	/**
	 * Method 'execute'
	 * 
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @throws Exception
	 * @return ActionForward
	 */
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		try {
			// cast the form to the appropriate type
			UserForm userForm = (UserForm) form;
		
			// create the DAO class
			UserDao dao = UserDaoFactory.create();
		
			User dto = new User();
			dto.setId( Integer.parseInt( userForm.getId() ));
			dto.setEmail( userForm.getEmail());
			dto.setSalt( userForm.getSalt());
			dto.setPassword( userForm.getPassword());
			dto.setActive( Short.parseShort( userForm.getActive() ));
		
			if (userForm.getCrudMethod().equalsIgnoreCase("insert")) {
				dao.insert( dto );
			} else if (userForm.getCrudMethod().equalsIgnoreCase("update")) {
				dao.update( dto.createPk(), dto );
			} else if (userForm.getCrudMethod().equalsIgnoreCase("delete")) {
				dao.delete( dto.createPk() );
			}
		
			return mapping.findForward( "success" );
		}
		catch (Exception e) {
			ActionErrors _errors = new ActionErrors();
			_errors.add( ActionErrors.GLOBAL_ERROR, new ActionError("internal.error", e.getClass().getName() + ": " + e.getMessage() ) );
			saveErrors( request, _errors );
			return mapping.findForward( "failure" );
		}
		
	}

}
