/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package com.mybillr.db.dto;

import com.mybillr.db.dao.*;
import com.mybillr.db.factory.*;
import com.mybillr.db.exceptions.*;
import java.io.Serializable;
import java.util.*;

public class BillPayee implements Serializable
{
	/** 
	 * This attribute maps to the column bill_id in the bill_payee table.
	 */
	protected int billId;

	/** 
	 * This attribute represents whether the attribute billId has been modified since being read from the database.
	 */
	protected boolean billIdModified = false;

	/** 
	 * This attribute maps to the column user_id in the bill_payee table.
	 */
	protected int userId;

	/** 
	 * This attribute represents whether the attribute userId has been modified since being read from the database.
	 */
	protected boolean userIdModified = false;

	/** 
	 * This attribute maps to the column share in the bill_payee table.
	 */
	protected long share;

	/** 
	 * This attribute represents whether the attribute share has been modified since being read from the database.
	 */
	protected boolean shareModified = false;

	/** 
	 * This attribute maps to the column amount in the bill_payee table.
	 */
	protected long amount;

	/** 
	 * This attribute represents whether the attribute amount has been modified since being read from the database.
	 */
	protected boolean amountModified = false;

	/**
	 * Method 'BillPayee'
	 * 
	 */
	public BillPayee()
	{
	}

	/**
	 * Method 'getBillId'
	 * 
	 * @return int
	 */
	public int getBillId()
	{
		return billId;
	}

	/**
	 * Method 'setBillId'
	 * 
	 * @param billId
	 */
	public void setBillId(int billId)
	{
		this.billId = billId;
		this.billIdModified = true;
	}

	/** 
	 * Sets the value of billIdModified
	 */
	public void setBillIdModified(boolean billIdModified)
	{
		this.billIdModified = billIdModified;
	}

	/** 
	 * Gets the value of billIdModified
	 */
	public boolean isBillIdModified()
	{
		return billIdModified;
	}

	/**
	 * Method 'getUserId'
	 * 
	 * @return int
	 */
	public int getUserId()
	{
		return userId;
	}

	/**
	 * Method 'setUserId'
	 * 
	 * @param userId
	 */
	public void setUserId(int userId)
	{
		this.userId = userId;
		this.userIdModified = true;
	}

	/** 
	 * Sets the value of userIdModified
	 */
	public void setUserIdModified(boolean userIdModified)
	{
		this.userIdModified = userIdModified;
	}

	/** 
	 * Gets the value of userIdModified
	 */
	public boolean isUserIdModified()
	{
		return userIdModified;
	}

	/**
	 * Method 'getShare'
	 * 
	 * @return long
	 */
	public long getShare()
	{
		return share;
	}

	/**
	 * Method 'setShare'
	 * 
	 * @param share
	 */
	public void setShare(long share)
	{
		this.share = share;
		this.shareModified = true;
	}

	/** 
	 * Sets the value of shareModified
	 */
	public void setShareModified(boolean shareModified)
	{
		this.shareModified = shareModified;
	}

	/** 
	 * Gets the value of shareModified
	 */
	public boolean isShareModified()
	{
		return shareModified;
	}

	/**
	 * Method 'getAmount'
	 * 
	 * @return long
	 */
	public long getAmount()
	{
		return amount;
	}

	/**
	 * Method 'setAmount'
	 * 
	 * @param amount
	 */
	public void setAmount(long amount)
	{
		this.amount = amount;
		this.amountModified = true;
	}

	/** 
	 * Sets the value of amountModified
	 */
	public void setAmountModified(boolean amountModified)
	{
		this.amountModified = amountModified;
	}

	/** 
	 * Gets the value of amountModified
	 */
	public boolean isAmountModified()
	{
		return amountModified;
	}

	/**
	 * Method 'equals'
	 * 
	 * @param _other
	 * @return boolean
	 */
	public boolean equals(Object _other)
	{
		if (_other == null) {
			return false;
		}
		
		if (_other == this) {
			return true;
		}
		
		if (!(_other instanceof BillPayee)) {
			return false;
		}
		
		final BillPayee _cast = (BillPayee) _other;
		if (billId != _cast.billId) {
			return false;
		}
		
		if (billIdModified != _cast.billIdModified) {
			return false;
		}
		
		if (userId != _cast.userId) {
			return false;
		}
		
		if (userIdModified != _cast.userIdModified) {
			return false;
		}
		
		if (share != _cast.share) {
			return false;
		}
		
		if (shareModified != _cast.shareModified) {
			return false;
		}
		
		if (amount != _cast.amount) {
			return false;
		}
		
		if (amountModified != _cast.amountModified) {
			return false;
		}
		
		return true;
	}

	/**
	 * Method 'hashCode'
	 * 
	 * @return int
	 */
	public int hashCode()
	{
		int _hashCode = 0;
		_hashCode = 29 * _hashCode + billId;
		_hashCode = 29 * _hashCode + (billIdModified ? 1 : 0);
		_hashCode = 29 * _hashCode + userId;
		_hashCode = 29 * _hashCode + (userIdModified ? 1 : 0);
		_hashCode = 29 * _hashCode + (int) (share ^ (share >>> 32));
		_hashCode = 29 * _hashCode + (shareModified ? 1 : 0);
		_hashCode = 29 * _hashCode + (int) (amount ^ (amount >>> 32));
		_hashCode = 29 * _hashCode + (amountModified ? 1 : 0);
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return BillPayeePk
	 */
	public BillPayeePk createPk()
	{
		return new BillPayeePk(billId, userId);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.mybillr.db.dto.BillPayee: " );
		ret.append( "billId=" + billId );
		ret.append( ", userId=" + userId );
		ret.append( ", share=" + share );
		ret.append( ", amount=" + amount );
		return ret.toString();
	}

}