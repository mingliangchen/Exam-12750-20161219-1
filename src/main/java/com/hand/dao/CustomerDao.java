package com.hand.dao;
public interface CustomerDao {
	/**
	 * 根据姓名查询
	 * @param first_name
	 * @return
	 */
	int SelectByName(String first_name);
}
