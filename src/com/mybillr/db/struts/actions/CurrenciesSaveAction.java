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

public class CurrenciesSaveAction extends Action
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
			CurrenciesForm currenciesForm = (CurrenciesForm) form;
		
			// create the DAO class
			CurrenciesDao dao = CurrenciesDaoFactory.create();
		
			Currencies dto = new Currencies();
			dto.setId( Integer.parseInt( currenciesForm.getId() ));
			dto.setName( currenciesForm.getName());
			dto.setSymbol( currenciesForm.getSymbol());
			dto.setRate( Long.parseLong( currenciesForm.getRate() ));
		
			if (currenciesForm.getCrudMethod().equalsIgnoreCase("insert")) {
				dao.insert( dto );
			} else if (currenciesForm.getCrudMethod().equalsIgnoreCase("update")) {
				dao.update( dto.createPk(), dto );
			} else if (currenciesForm.getCrudMethod().equalsIgnoreCase("delete")) {
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
