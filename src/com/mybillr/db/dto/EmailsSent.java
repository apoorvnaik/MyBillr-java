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

public class EmailsSent implements Serializable
{
	/** 
	 * This attribute maps to the column id in the emails_sent table.
	 */
	protected int id;

	/** 
	 * This attribute represents whether the attribute id has been modified since being read from the database.
	 */
	protected boolean idModified = false;

	/** 
	 * This attribute maps to the column sender_id in the emails_sent table.
	 */
	protected int senderId;

	/** 
	 * This attribute represents whether the attribute senderId has been modified since being read from the database.
	 */
	protected boolean senderIdModified = false;

	/** 
	 * This attribute maps to the column receiver_id in the emails_sent table.
	 */
	protected int receiverId;

	/** 
	 * This attribute represents whether the attribute receiverId has been modified since being read from the database.
	 */
	protected boolean receiverIdModified = false;

	/** 
	 * This attribute maps to the column subject in the emails_sent table.
	 */
	protected String subject;

	/** 
	 * This attribute represents whether the attribute subject has been modified since being read from the database.
	 */
	protected boolean subjectModified = false;

	/** 
	 * This attribute maps to the column content in the emails_sent table.
	 */
	protected String content;

	/** 
	 * This attribute represents whether the attribute content has been modified since being read from the database.
	 */
	protected boolean contentModified = false;

	/**
	 * Method 'EmailsSent'
	 * 
	 */
	public EmailsSent()
	{
	}

	/**
	 * Method 'getId'
	 * 
	 * @return int
	 */
	public int getId()
	{
		return id;
	}

	/**
	 * Method 'setId'
	 * 
	 * @param id
	 */
	public void setId(int id)
	{
		this.id = id;
		this.idModified = true;
	}

	/** 
	 * Sets the value of idModified
	 */
	public void setIdModified(boolean idModified)
	{
		this.idModified = idModified;
	}

	/** 
	 * Gets the value of idModified
	 */
	public boolean isIdModified()
	{
		return idModified;
	}

	/**
	 * Method 'getSenderId'
	 * 
	 * @return int
	 */
	public int getSenderId()
	{
		return senderId;
	}

	/**
	 * Method 'setSenderId'
	 * 
	 * @param senderId
	 */
	public void setSenderId(int senderId)
	{
		this.senderId = senderId;
		this.senderIdModified = true;
	}

	/** 
	 * Sets the value of senderIdModified
	 */
	public void setSenderIdModified(boolean senderIdModified)
	{
		this.senderIdModified = senderIdModified;
	}

	/** 
	 * Gets the value of senderIdModified
	 */
	public boolean isSenderIdModified()
	{
		return senderIdModified;
	}

	/**
	 * Method 'getReceiverId'
	 * 
	 * @return int
	 */
	public int getReceiverId()
	{
		return receiverId;
	}

	/**
	 * Method 'setReceiverId'
	 * 
	 * @param receiverId
	 */
	public void setReceiverId(int receiverId)
	{
		this.receiverId = receiverId;
		this.receiverIdModified = true;
	}

	/** 
	 * Sets the value of receiverIdModified
	 */
	public void setReceiverIdModified(boolean receiverIdModified)
	{
		this.receiverIdModified = receiverIdModified;
	}

	/** 
	 * Gets the value of receiverIdModified
	 */
	public boolean isReceiverIdModified()
	{
		return receiverIdModified;
	}

	/**
	 * Method 'getSubject'
	 * 
	 * @return String
	 */
	public String getSubject()
	{
		return subject;
	}

	/**
	 * Method 'setSubject'
	 * 
	 * @param subject
	 */
	public void setSubject(String subject)
	{
		this.subject = subject;
		this.subjectModified = true;
	}

	/** 
	 * Sets the value of subjectModified
	 */
	public void setSubjectModified(boolean subjectModified)
	{
		this.subjectModified = subjectModified;
	}

	/** 
	 * Gets the value of subjectModified
	 */
	public boolean isSubjectModified()
	{
		return subjectModified;
	}

	/**
	 * Method 'getContent'
	 * 
	 * @return String
	 */
	public String getContent()
	{
		return content;
	}

	/**
	 * Method 'setContent'
	 * 
	 * @param content
	 */
	public void setContent(String content)
	{
		this.content = content;
		this.contentModified = true;
	}

	/** 
	 * Sets the value of contentModified
	 */
	public void setContentModified(boolean contentModified)
	{
		this.contentModified = contentModified;
	}

	/** 
	 * Gets the value of contentModified
	 */
	public boolean isContentModified()
	{
		return contentModified;
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
		
		if (!(_other instanceof EmailsSent)) {
			return false;
		}
		
		final EmailsSent _cast = (EmailsSent) _other;
		if (id != _cast.id) {
			return false;
		}
		
		if (idModified != _cast.idModified) {
			return false;
		}
		
		if (senderId != _cast.senderId) {
			return false;
		}
		
		if (senderIdModified != _cast.senderIdModified) {
			return false;
		}
		
		if (receiverId != _cast.receiverId) {
			return false;
		}
		
		if (receiverIdModified != _cast.receiverIdModified) {
			return false;
		}
		
		if (subject == null ? _cast.subject != subject : !subject.equals( _cast.subject )) {
			return false;
		}
		
		if (subjectModified != _cast.subjectModified) {
			return false;
		}
		
		if (content == null ? _cast.content != content : !content.equals( _cast.content )) {
			return false;
		}
		
		if (contentModified != _cast.contentModified) {
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
		_hashCode = 29 * _hashCode + id;
		_hashCode = 29 * _hashCode + (idModified ? 1 : 0);
		_hashCode = 29 * _hashCode + senderId;
		_hashCode = 29 * _hashCode + (senderIdModified ? 1 : 0);
		_hashCode = 29 * _hashCode + receiverId;
		_hashCode = 29 * _hashCode + (receiverIdModified ? 1 : 0);
		if (subject != null) {
			_hashCode = 29 * _hashCode + subject.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (subjectModified ? 1 : 0);
		if (content != null) {
			_hashCode = 29 * _hashCode + content.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (contentModified ? 1 : 0);
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return EmailsSentPk
	 */
	public EmailsSentPk createPk()
	{
		return new EmailsSentPk(id);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.mybillr.db.dto.EmailsSent: " );
		ret.append( "id=" + id );
		ret.append( ", senderId=" + senderId );
		ret.append( ", receiverId=" + receiverId );
		ret.append( ", subject=" + subject );
		ret.append( ", content=" + content );
		return ret.toString();
	}

}