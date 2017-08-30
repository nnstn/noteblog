package com.pursuit.noteblog.dao;

import java.util.List;

import com.pursuit.noteblog.po.NoteBook;

public interface NoteBookMapper {
    int deleteByPrimaryKey(String id);

    int insert(NoteBook record);

    int insertSelective(NoteBook record);

    NoteBook selectByPrimaryKey(String id);
    
    List<NoteBook> selectByUid(String uid);

    int updateByPrimaryKeySelective(NoteBook record);

    int updateByPrimaryKey(NoteBook record);
}