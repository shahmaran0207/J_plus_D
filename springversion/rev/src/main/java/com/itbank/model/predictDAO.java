package com.itbank.model;

import org.apache.ibatis.annotations.Select;

public interface predictDAO {

	@Select("select max(predict_value) from ${table_name}")
	int search(String table_name);
	
	
	
}
