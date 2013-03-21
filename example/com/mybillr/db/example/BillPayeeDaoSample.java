/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package com.mybillr.db.example;

import java.math.*;
import java.util.Date;
import java.util.Collection;
import com.mybillr.db.dao.BillPayeeDao;
import com.mybillr.db.dto.BillPayee;
import com.mybillr.db.exceptions.BillPayeeDaoException;
import com.mybillr.db.factory.BillPayeeDaoFactory;

public class BillPayeeDaoSample
{
	/**
	 * Method 'main'
	 * 
	 * @param arg
	 * @throws Exception
	 */
	public static void main(String[] arg) throws Exception
	{
		// Uncomment one of the lines below to test the generated code
		
		// findAll();
		// findByBill(0);
		// findByUser(0);
		// findWhereBillIdEquals(0);
		// findWhereUserIdEquals(0);
		// findWhereShareEquals(0);
		// findWhereAmountEquals(0);
	}

	/**
	 * Method 'findAll'
	 * 
	 */
	public static void findAll()
	{
		try {
			BillPayeeDao _dao = getBillPayeeDao();
			BillPayee _result[] = _dao.findAll();
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findByBill'
	 * 
	 * @param billId
	 */
	public static void findByBill(int billId)
	{
		try {
			BillPayeeDao _dao = getBillPayeeDao();
			BillPayee _result[] = _dao.findByBill(billId);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findByUser'
	 * 
	 * @param userId
	 */
	public static void findByUser(int userId)
	{
		try {
			BillPayeeDao _dao = getBillPayeeDao();
			BillPayee _result[] = _dao.findByUser(userId);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereBillIdEquals'
	 * 
	 * @param billId
	 */
	public static void findWhereBillIdEquals(int billId)
	{
		try {
			BillPayeeDao _dao = getBillPayeeDao();
			BillPayee _result[] = _dao.findWhereBillIdEquals(billId);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereUserIdEquals'
	 * 
	 * @param userId
	 */
	public static void findWhereUserIdEquals(int userId)
	{
		try {
			BillPayeeDao _dao = getBillPayeeDao();
			BillPayee _result[] = _dao.findWhereUserIdEquals(userId);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereShareEquals'
	 * 
	 * @param share
	 */
	public static void findWhereShareEquals(long share)
	{
		try {
			BillPayeeDao _dao = getBillPayeeDao();
			BillPayee _result[] = _dao.findWhereShareEquals(share);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereAmountEquals'
	 * 
	 * @param amount
	 */
	public static void findWhereAmountEquals(long amount)
	{
		try {
			BillPayeeDao _dao = getBillPayeeDao();
			BillPayee _result[] = _dao.findWhereAmountEquals(amount);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'getBillPayeeDao'
	 * 
	 * @return BillPayeeDao
	 */
	public static BillPayeeDao getBillPayeeDao()
	{
		return BillPayeeDaoFactory.create();
	}

	/**
	 * Method 'display'
	 * 
	 * @param dto
	 */
	public static void display(BillPayee dto)
	{
		StringBuffer buf = new StringBuffer();
		buf.append( dto.getBillId() );
		buf.append( ", " );
		buf.append( dto.getUserId() );
		buf.append( ", " );
		buf.append( dto.getShare() );
		buf.append( ", " );
		buf.append( dto.getAmount() );
		System.out.println( buf.toString() );
	}

}