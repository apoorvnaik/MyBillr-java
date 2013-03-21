/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package com.mybillr.db.jdbc;

import com.mybillr.db.dao.*;
import com.mybillr.db.factory.*;
import com.mybillr.db.dto.*;
import com.mybillr.db.exceptions.*;
import java.sql.Connection;
import java.util.Collection;
import org.apache.log4j.Logger;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

public class BillPayeeDaoImpl extends AbstractDAO implements BillPayeeDao
{
	/** 
	 * The factory class for this DAO has two versions of the create() method - one that
takes no arguments and one that takes a Connection argument. If the Connection version
is chosen then the connection will be stored in this attribute and will be used by all
calls to this DAO, otherwise a new Connection will be allocated for each operation.
	 */
	protected java.sql.Connection userConn;

	protected static final Logger logger = Logger.getLogger( BillPayeeDaoImpl.class );

	/** 
	 * All finder methods in this class use this SELECT constant to build their queries
	 */
	protected final String SQL_SELECT = "SELECT bill_id, user_id, share, amount FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( bill_id, user_id, share, amount ) VALUES ( ?, ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET bill_id = ?, user_id = ?, share = ?, amount = ? WHERE bill_id = ? AND user_id = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE bill_id = ? AND user_id = ?";

	/** 
	 * Index of column bill_id
	 */
	protected static final int COLUMN_BILL_ID = 1;

	/** 
	 * Index of column user_id
	 */
	protected static final int COLUMN_USER_ID = 2;

	/** 
	 * Index of column share
	 */
	protected static final int COLUMN_SHARE = 3;

	/** 
	 * Index of column amount
	 */
	protected static final int COLUMN_AMOUNT = 4;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 4;

	/** 
	 * Index of primary-key column bill_id
	 */
	protected static final int PK_COLUMN_BILL_ID = 1;

	/** 
	 * Index of primary-key column user_id
	 */
	protected static final int PK_COLUMN_USER_ID = 2;

	/** 
	 * Inserts a new row in the bill_payee table.
	 */
	public BillPayeePk insert(BillPayee dto) throws BillPayeeDaoException
	{
		long t1 = System.currentTimeMillis();
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			StringBuffer sql = new StringBuffer();
			StringBuffer values = new StringBuffer();
			sql.append( "INSERT INTO " + getTableName() + " (" );
			int modifiedCount = 0;
			if (dto.isBillIdModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "bill_id" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isUserIdModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "user_id" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isShareModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "share" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isAmountModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "amount" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (modifiedCount==0) {
				// nothing to insert
				throw new IllegalStateException( "Nothing to insert" );
			}
		
			sql.append( ") VALUES (" );
			sql.append( values );
			sql.append( ")" );
			stmt = conn.prepareStatement( sql.toString() );
			int index = 1;
			if (dto.isBillIdModified()) {
				stmt.setInt( index++, dto.getBillId() );
			}
		
			if (dto.isUserIdModified()) {
				stmt.setInt( index++, dto.getUserId() );
			}
		
			if (dto.isShareModified()) {
				stmt.setLong( index++, dto.getShare() );
			}
		
			if (dto.isAmountModified()) {
				stmt.setLong( index++, dto.getAmount() );
			}
		
			if (logger.isDebugEnabled()) {
				logger.debug( "Executing " + sql.toString() + " with values: " + dto);
			}
		
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			if (logger.isDebugEnabled()) {
				logger.debug( rows + " rows affected (" + (t2-t1) + " ms)");
			}
		
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			logger.error( "Exception: " + _e.getMessage(), _e );
			throw new BillPayeeDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the bill_payee table.
	 */
	public void update(BillPayeePk pk, BillPayee dto) throws BillPayeeDaoException
	{
		long t1 = System.currentTimeMillis();
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			StringBuffer sql = new StringBuffer();
			sql.append( "UPDATE " + getTableName() + " SET " );
			boolean modified = false;
			if (dto.isBillIdModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "bill_id=?" );
				modified=true;
			}
		
			if (dto.isUserIdModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "user_id=?" );
				modified=true;
			}
		
			if (dto.isShareModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "share=?" );
				modified=true;
			}
		
			if (dto.isAmountModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "amount=?" );
				modified=true;
			}
		
			if (!modified) {
				// nothing to update
				return;
			}
		
			sql.append( " WHERE bill_id=? AND user_id=?" );
			if (logger.isDebugEnabled()) {
				logger.debug( "Executing " + sql.toString() + " with values: " + dto);
			}
		
			stmt = conn.prepareStatement( sql.toString() );
			int index = 1;
			if (dto.isBillIdModified()) {
				stmt.setInt( index++, dto.getBillId() );
			}
		
			if (dto.isUserIdModified()) {
				stmt.setInt( index++, dto.getUserId() );
			}
		
			if (dto.isShareModified()) {
				stmt.setLong( index++, dto.getShare() );
			}
		
			if (dto.isAmountModified()) {
				stmt.setLong( index++, dto.getAmount() );
			}
		
			stmt.setInt( index++, pk.getBillId() );
			stmt.setInt( index++, pk.getUserId() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			if (logger.isDebugEnabled()) {
				logger.debug( rows + " rows affected (" + (t2-t1) + " ms)");
			}
		
		}
		catch (Exception _e) {
			logger.error( "Exception: " + _e.getMessage(), _e );
			throw new BillPayeeDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the bill_payee table.
	 */
	public void delete(BillPayeePk pk) throws BillPayeeDaoException
	{
		long t1 = System.currentTimeMillis();
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			if (logger.isDebugEnabled()) {
				logger.debug( "Executing " + SQL_DELETE + " with PK: " + pk);
			}
		
			stmt = conn.prepareStatement( SQL_DELETE );
			stmt.setInt( 1, pk.getBillId() );
			stmt.setInt( 2, pk.getUserId() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			if (logger.isDebugEnabled()) {
				logger.debug( rows + " rows affected (" + (t2-t1) + " ms)");
			}
		
		}
		catch (Exception _e) {
			logger.error( "Exception: " + _e.getMessage(), _e );
			throw new BillPayeeDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the bill_payee table that matches the specified primary-key value.
	 */
	public BillPayee findByPrimaryKey(BillPayeePk pk) throws BillPayeeDaoException
	{
		return findByPrimaryKey( pk.getBillId(), pk.getUserId() );
	}

	/** 
	 * Returns all rows from the bill_payee table that match the criteria 'bill_id = :billId AND user_id = :userId'.
	 */
	public BillPayee findByPrimaryKey(int billId, int userId) throws BillPayeeDaoException
	{
		BillPayee ret[] = findByDynamicSelect( SQL_SELECT + " WHERE bill_id = ? AND user_id = ?", new Object[] {  new Integer(billId),  new Integer(userId) } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the bill_payee table that match the criteria ''.
	 */
	public BillPayee[] findAll() throws BillPayeeDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY bill_id, user_id", null );
	}

	/** 
	 * Returns all rows from the bill_payee table that match the criteria 'bill_id = :billId'.
	 */
	public BillPayee[] findByBill(int billId) throws BillPayeeDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE bill_id = ?", new Object[] {  new Integer(billId) } );
	}

	/** 
	 * Returns all rows from the bill_payee table that match the criteria 'user_id = :userId'.
	 */
	public BillPayee[] findByUser(int userId) throws BillPayeeDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE user_id = ?", new Object[] {  new Integer(userId) } );
	}

	/** 
	 * Returns all rows from the bill_payee table that match the criteria 'bill_id = :billId'.
	 */
	public BillPayee[] findWhereBillIdEquals(int billId) throws BillPayeeDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE bill_id = ? ORDER BY bill_id", new Object[] {  new Integer(billId) } );
	}

	/** 
	 * Returns all rows from the bill_payee table that match the criteria 'user_id = :userId'.
	 */
	public BillPayee[] findWhereUserIdEquals(int userId) throws BillPayeeDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE user_id = ? ORDER BY user_id", new Object[] {  new Integer(userId) } );
	}

	/** 
	 * Returns all rows from the bill_payee table that match the criteria 'share = :share'.
	 */
	public BillPayee[] findWhereShareEquals(long share) throws BillPayeeDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE share = ? ORDER BY share", new Object[] {  new Long(share) } );
	}

	/** 
	 * Returns all rows from the bill_payee table that match the criteria 'amount = :amount'.
	 */
	public BillPayee[] findWhereAmountEquals(long amount) throws BillPayeeDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE amount = ? ORDER BY amount", new Object[] {  new Long(amount) } );
	}

	/**
	 * Method 'BillPayeeDaoImpl'
	 * 
	 */
	public BillPayeeDaoImpl()
	{
	}

	/**
	 * Method 'BillPayeeDaoImpl'
	 * 
	 * @param userConn
	 */
	public BillPayeeDaoImpl(final java.sql.Connection userConn)
	{
		this.userConn = userConn;
	}

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows)
	{
		this.maxRows = maxRows;
	}

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows()
	{
		return maxRows;
	}

	/**
	 * Method 'getTableName'
	 * 
	 * @return String
	 */
	public String getTableName()
	{
		return "mybillr.bill_payee";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected BillPayee fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			BillPayee dto = new BillPayee();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected BillPayee[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			BillPayee dto = new BillPayee();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		BillPayee ret[] = new BillPayee[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(BillPayee dto, ResultSet rs) throws SQLException
	{
		dto.setBillId( rs.getInt( COLUMN_BILL_ID ) );
		dto.setUserId( rs.getInt( COLUMN_USER_ID ) );
		dto.setShare( rs.getLong( COLUMN_SHARE ) );
		dto.setAmount( rs.getLong( COLUMN_AMOUNT ) );
		reset(dto);
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(BillPayee dto)
	{
		dto.setBillIdModified( false );
		dto.setUserIdModified( false );
		dto.setShareModified( false );
		dto.setAmountModified( false );
	}

	/** 
	 * Returns all rows from the bill_payee table that match the specified arbitrary SQL statement
	 */
	public BillPayee[] findByDynamicSelect(String sql, Object[] sqlParams) throws BillPayeeDaoException
	{
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			// construct the SQL statement
			final String SQL = sql;
		
		
			if (logger.isDebugEnabled()) {
				logger.debug( "Executing " + SQL);
			}
		
			// prepare statement
			stmt = conn.prepareStatement( SQL );
			stmt.setMaxRows( maxRows );
		
			// bind parameters
			for (int i=0; sqlParams!=null && i<sqlParams.length; i++ ) {
				stmt.setObject( i+1, sqlParams[i] );
			}
		
		
			rs = stmt.executeQuery();
		
			// fetch the results
			return fetchMultiResults(rs);
		}
		catch (Exception _e) {
			logger.error( "Exception: " + _e.getMessage(), _e );
			throw new BillPayeeDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(rs);
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns all rows from the bill_payee table that match the specified arbitrary SQL statement
	 */
	public BillPayee[] findByDynamicWhere(String sql, Object[] sqlParams) throws BillPayeeDaoException
	{
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			// construct the SQL statement
			final String SQL = SQL_SELECT + " WHERE " + sql;
		
		
			if (logger.isDebugEnabled()) {
				logger.debug( "Executing " + SQL);
			}
		
			// prepare statement
			stmt = conn.prepareStatement( SQL );
			stmt.setMaxRows( maxRows );
		
			// bind parameters
			for (int i=0; sqlParams!=null && i<sqlParams.length; i++ ) {
				stmt.setObject( i+1, sqlParams[i] );
			}
		
		
			rs = stmt.executeQuery();
		
			// fetch the results
			return fetchMultiResults(rs);
		}
		catch (Exception _e) {
			logger.error( "Exception: " + _e.getMessage(), _e );
			throw new BillPayeeDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(rs);
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

}