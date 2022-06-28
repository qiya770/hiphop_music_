package com.xuhuaze.music.service;

import com.xuhuaze.music.domain.ListSong;

import java.util.List;

/*
* 歌单歌曲service类
* */
public interface ListSongService {
    /*
     * 增加
     * */
    public boolean  insert(ListSong listSong);

    /*
     * 修改
     * */
    public boolean update(ListSong listSong);

    /*
     * 删除
     * */
    public boolean delete(Integer id);

    /*
     * 根据主键查询整个对象
     * */
    public ListSong selectByPrimaryKey(Integer id);

    /*
     * 查询所有歌单里面的歌曲
     * */
    public List<ListSong> allListSong();


    /*根据歌单id查询所有的歌曲*/
    public List<ListSong> listSongOfSongListId(Integer songListId);
}
