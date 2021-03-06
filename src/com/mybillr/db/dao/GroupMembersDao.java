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

public interface GroupMembersDao
{
	/** 
	 * Inserts a new row in the group_members table.
	 */
	public GroupMembersPk insert(GroupMembers dto) throws GroupMembersDaoException;

	/** 
	 * Updates a single row in the group_members table.
	 */
	public void update(GroupMembersPk pk, GroupMembers dto) throws GroupMembersDaoException;

	/** 
	 * Deletes a single row in the group_members table.
	 */
	public void delete(GroupMembersPk pk) throws GroupMembersDaoException;

	/** 
	 * Returns the rows from the group_members table that matches the specified primary-key value.
	 */
	public GroupMembers findByPrimaryKey(GroupMembersPk pk) throws GroupMembersDaoException;

	/** 
	 * Returns all rows from the group_members table that match the criteria 'group_id = :groupId AND user_id = :userId'.
	 */
	public GroupMembers findByPrimaryKey(int groupId, int userId) throws GroupMembersDaoException;

	/** 
	 * Returns all rows from the group_members table that match the criteria ''.
	 */
	public GroupMembers[] findAll() throws GroupMembersDaoException;

	/** 
	 * Returns all rows from the group_members table that match the criteria 'group_id = :groupId'.
	 */
	public GroupMembers[] findByGroup(int groupId) throws GroupMembersDaoException;

	/** 
	 * Returns all rows from the group_members table that match the criteria 'user_id = :userId'.
	 */
	public GroupMembers[] findByUser(int userId) throws GroupMembersDaoException;

	/** 
	 * Returns all rows from the group_members table that match the criteria 'group_id = :groupId'.
	 */
	public GroupMembers[] findWhereGroupIdEquals(int groupId) throws GroupMembersDaoException;

	/** 
	 * Returns all rows from the group_members table that match the criteria 'user_id = :userId'.
	 */
	public GroupMembers[] findWhereUserIdEquals(int userId) throws GroupMembersDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the group_members table that match the specified arbitrary SQL statement
	 */
	public GroupMembers[] findByDynamicSelect(String sql, Object[] sqlParams) throws GroupMembersDaoException;

	/** 
	 * Returns all rows from the group_members table that match the specified arbitrary SQL statement
	 */
	public GroupMembers[] findByDynamicWhere(String sql, Object[] sqlParams) throws GroupMembersDaoException;

}
