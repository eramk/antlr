/*------------------------------------------------------------------------------
 *******************************************************************************
 * COPYRIGHT Ericsson 2012
 *
 * The copyright to the computer program(s) herein is the property of
 * Ericsson Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *******************************************************************************
 *----------------------------------------------------------------------------*/
package com.ericsson.ne;

import java.util.List;

public class SearchCriteria {

	private List<String> mo;
	private List<String> filter;
	/**
	 * @return the mo
	 */
	public List<String> getMo() {
		return mo;
	}
	/**
	 * @param mo the mo to set
	 */
	public void setMo(List<String> mo) {
		this.mo = mo;
	}
	/**
	 * @return the filter
	 */
	public List<String> getFilter() {
		return filter;
	}
	/**
	 * @param filter the filter to set
	 */
	public void setFilter(List<String> filter) {
		this.filter = filter;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return mo.toString() ;//+ filter.toString();
	}
}
