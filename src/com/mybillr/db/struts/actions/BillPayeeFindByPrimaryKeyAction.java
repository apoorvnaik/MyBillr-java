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

public class BillPayeeFindByPrimaryKeyAction extends Action
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
			// parse parameters
			int _billId = Integer.parseInt( request.getParameter("billId") );
			int _userId = Integer.parseInt( request.getParameter("userId") );
		
			// create the DAO class
			BillPayeeDao dao = BillPayeeDaoFactory.create();
		
			// execute the finder
			BillPayee dto = dao.findByPrimaryKey(_billId, _userId);
		
			// check that we have found a row
			if (dto == null) {
				throw new RuntimeException( "Finder did not return any data" );
			}
		
			String crudMethod = request.getParameter("crudMethod");
			if (crudMethod == null) {
				crudMethod = "view";
			}
		
			// populate a struts form
			BillPayeeForm billPayeeForm = new BillPayeeForm();
			billPayeeForm.setCrudMethod( request.getParameter("crudMethod") );
			billPayeeForm.setBillId(String.valueOf( dto.getBillId() ));
			billPayeeForm.setUserId(String.valueOf( dto.getUserId() ));
			billPayeeForm.setShare(String.valueOf( dto.getShare() ));
			billPayeeForm.setAmount(String.valueOf( dto.getAmount() ));
			// store the results
			request.getSession().setAttribute( "BillPayee", billPayeeForm );
		
			return mapping.findForward( crudMethod );
		}
		catch (Exception e) {
			ActionErrors _errors = new ActionErrors();
			_errors.add( ActionErrors.GLOBAL_ERROR, new ActionError("internal.error", e.getClass().getName() + ": " + e.getMessage() ) );
			saveErrors( request, _errors );
			return mapping.findForward( "failure" );
		}
		
	}

}
