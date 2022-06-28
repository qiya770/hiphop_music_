package com.xuhuaze.music.service.impl;

import com.xuhuaze.music.dao.ListSongMapper;
import com.xuhuaze.music.domain.ListSong;
import com.xuhuaze.music.service.ListSongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/*
* 歌单歌曲service实现类
* */
@Service
public class ListSongServiceImpl implements ListSongService {
    @Autowired
    private ListSongMapper listSongMapper;
    @Override
    public boolean insert(ListSong listSong) {
        return listSongMapper.insert(listSong)>0;
    }

    @Override
    public boolean update(ListSong listSong) {
        return listSongMapper.update(listSong)>0;
    }

    @Override
    public boolean delete(Integer id) {
        return listSongMapper.delete(id)>0;
    }

    @Override
    public ListSong selectByPrimaryKey(Integer id) {
        return listSongMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<ListSong> allListSong() {
        return listSongMapper.allListSong();
    }

    @Override
    public List<ListSong> listSongOfSongListId(Integer songListId) {
        return listSongMapper.listSongOfSongListId(songListId);
    }
}
