package com.xuhuaze.music.service.impl;

import com.xuhuaze.music.dao.SongListMapper;
import com.xuhuaze.music.domain.Song;
import com.xuhuaze.music.domain.SongList;
import com.xuhuaze.music.service.SongListService;
import com.xuhuaze.music.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/*
 * 歌单service实现类
 * */
@Service
public class SongListServiceImpl implements SongListService {
    @Autowired
    private SongListMapper songListMapper;

    @Override
    public boolean insert(SongList songList) {
        return songListMapper.insert(songList)>0;
    }

    @Override
    public boolean update(SongList songList) {
        return songListMapper.update(songList)>0;
    }

    @Override
    public boolean delete(Integer id) {
        return songListMapper.delete(id)>0;
    }

    @Override
    public SongList selectByPrimaryKey(Integer id) {
        return songListMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<SongList> allSongList() {
        return songListMapper.allSongList();
    }

    @Override
    public List<SongList> songListOfTitle(String title) {
        return songListMapper.songListOfTitle(title);
    }

    @Override
    public List<SongList> likeTitle(String title) {
        return songListMapper.likeTitle(title);
    }

    @Override
    public List<SongList> likeStyle(String style) {
        return songListMapper.likeStyle(style);
    }
}
