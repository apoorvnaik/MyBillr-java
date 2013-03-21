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

public interface BugReportGeneralDao
{
	/** 
	 * Inserts a new row in the bug_report_general table.
	 */
	public BugReportGeneralPk insert(BugReportGeneral dto) throws BugReportGeneralDaoException;

	/** 
	 * Updates a single row in the bug_report_general table.
	 */
	public void update(BugReportGeneralPk pk, BugReportGeneral dto) throws BugReportGeneralDaoException;

	/** 
	 * Deletes a single row in the bug_report_general table.
	 */
	public void delete(BugReportGeneralPk pk) throws BugReportGeneralDaoException;

	/** 
	 * Returns the rows from the bug_report_general table that matches the specified primary-key value.
	 */
	public BugReportGeneral findByPrimaryKey(BugReportGeneralPk pk) throws BugReportGeneralDaoException;

	/** 
	 * Returns all rows from the bug_report_general table that match the criteria 'id = :id'.
	 */
	public BugReportGeneral findByPrimaryKey(int id) throws BugReportGeneralDaoException;

	/** 
	 * Returns all rows from the bug_report_general table that match the criteria ''.
	 */
	public BugReportGeneral[] findAll() throws BugReportGeneralDaoException;

	/** 
	 * Returns all rows from the bug_report_general table that match the criteria 'id = :id'.
	 */
	public BugReportGeneral[] findWhereIdEquals(int id) throws BugReportGeneralDaoException;

	/** 
	 * Returns all rows from the bug_report_general table that match the criteria 'reported_by = :reportedBy'.
	 */
	public BugReportGeneral[] findWhereReportedByEquals(String reportedBy) throws BugReportGeneralDaoException;

	/** 
	 * Returns all rows from the bug_report_general table that match the criteria 'title = :title'.
	 */
	public BugReportGeneral[] findWhereTitleEquals(String title) throws BugReportGeneralDaoException;

	/** 
	 * Returns all rows from the bug_report_general table that match the criteria 'bug = :bug'.
	 */
	public BugReportGeneral[] findWhereBugEquals(String bug) throws BugReportGeneralDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the bug_report_general table that match the specified arbitrary SQL statement
	 */
	public BugReportGeneral[] findByDynamicSelect(String sql, Object[] sqlParams) throws BugReportGeneralDaoException;

	/** 
	 * Returns all rows from the bug_report_general table that match the specified arbitrary SQL statement
	 */
	public BugReportGeneral[] findByDynamicWhere(String sql, Object[] sqlParams) throws BugReportGeneralDaoException;

}
