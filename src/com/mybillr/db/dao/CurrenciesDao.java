/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package com.mybillr.db.dao;

import com.mybillr.db.dto.*;
import com.mybillr.db.exceptions.*;

public interface CurrenciesDao
{
	/** 
	 * Inserts a new row in the currencies table.
	 */
	public CurrenciesPk insert(Currencies dto) throws CurrenciesDaoException;

	/** 
	 * Updates a single row in the currencies table.
	 */
	public void update(CurrenciesPk pk, Currencies dto) throws CurrenciesDaoException;

	/** 
	 * Deletes a single row in the currencies table.
	 */
	public void delete(CurrenciesPk pk) throws CurrenciesDaoException;

	/** 
	 * Returns the rows from the currencies table that matches the specified primary-key value.
	 */
	public Currencies findByPrimaryKey(CurrenciesPk pk) throws CurrenciesDaoException;

	/** 
	 * Returns all rows from the currencies table that match the criteria 'id = :id'.
	 */
	public Currencies findByPrimaryKey(int id) throws CurrenciesDaoException;

	/** 
	 * Returns all rows from the currencies table that match the criteria ''.
	 */
	public Currencies[] findAll() throws CurrenciesDaoException;

	/** 
	 * Returns all rows from the currencies table that match the criteria 'id = :id'.
	 */
	public Currencies[] findWhereIdEquals(int id) throws CurrenciesDaoException;

	/** 
	 * Returns all rows from the currencies table that match the criteria 'name = :name'.
	 */
	public Currencies[] findWhereNameEquals(String name) throws CurrenciesDaoException;

	/** 
	 * Returns all rows from the currencies table that match the criteria 'symbol = :symbol'.
	 */
	public Currencies[] findWhereSymbolEquals(String symbol) throws CurrenciesDaoException;

	/** 
	 * Returns all rows from the currencies table that match the criteria 'rate = :rate'.
	 */
	public Currencies[] findWhereRateEquals(long rate) throws CurrenciesDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the currencies table that match the specified arbitrary SQL statement
	 */
	public Currencies[] findByDynamicSelect(String sql, Object[] sqlParams) throws CurrenciesDaoException;

	/** 
	 * Returns all rows from the currencies table that match the specified arbitrary SQL statement
	 */
	public Currencies[] findByDynamicWhere(String sql, Object[] sqlParams) throws CurrenciesDaoException;

}
