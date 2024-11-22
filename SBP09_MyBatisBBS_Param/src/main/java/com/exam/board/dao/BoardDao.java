package com.exam.board.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.exam.board.dto.BoardDto;

@Mapper
public interface BoardDao {

	public List<BoardDto> mtdBoardList();
	public BoardDto mtdBoardView(int num);
	public int mtdBoardWriter(Map<String, String> map);
	public int mtdBoardDelete(int num);
}
