package com.exam.board.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.exam.board.dto.BoardDto;

@Mapper
public interface BoardDao {

	public List<BoardDto> mtdBoardList();
	public BoardDto mtdBoardView(int num);
	public int mtdBoardWriter(String writer, String title, String content);
	public int mtdBoardDelete(int num);
}
