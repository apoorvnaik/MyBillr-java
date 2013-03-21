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

public interface GroupDao
{
	/** 
	 * Inserts a new row in the group table.
	 */
	public GroupPk insert(Group dto) throws GroupDaoException;

	/** 
	 * Updates a single row in the group table.
	 */
	public void update(GroupPk pk, Group dto) throws GroupDaoException;

	/** 
	 * Deletes a single row in the group table.
	 */
	public void delete(GroupPk pk) throws GroupDaoException;

	/** 
	 * Returns the rows from the group table that matches the specified primary-key value.
	 */
	public Group findByPrimaryKey(GroupPk pk) throws GroupDaoException;

	/** 
	 * Returns all rows from the group table that match the criteria 'id = :id'.
	 */
	public Group findByPrimaryKey(int id) throws GroupDaoException;

	/** 
	 * Returns all rows from the group table that match the criteria ''.
	 */
	public Group[] findAll() throws GroupDaoException;

	/** 
	 * Returns all rows from the group table that match the criteria 'id = :id'.
	 */
	public Group[] findWhereIdEquals(int id) throws GroupDaoException;

	/** 
	 * Returns all rows from the group table that match the criteria 'name = :name'.
	 */
	public Group[] findWhereNameEquals(String name) throws GroupDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the group table that match the specified arbitrary SQL statement
	 */
	public Group[] findByDynamicSelect(String sql, Object[] sqlParams) throws GroupDaoException;

	/** 
	 * Returns all rows from the group table that match the specified arbitrary SQL statement
	 */
	public Group[] findByDynamicWhere(String sql, Object[] sqlParams) throws GroupDaoException;

}