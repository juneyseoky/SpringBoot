package com.qd03.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.qd03.dto.GoodsDto;

@Mapper
public interface GoodsDao {
	
	// 상품목록
	List<GoodsDto> selectGoods();
	// 상품 등록
	void goodsReg(Map<String,String> map);
	// 상품 검색
	GoodsDto searchGoods(String keyword);
	// 상품 삭제
	int deleteGoods(int num);
}
