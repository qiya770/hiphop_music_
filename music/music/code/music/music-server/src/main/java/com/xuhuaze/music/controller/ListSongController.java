package com.xuhuaze.music.controller;

import com.alibaba.fastjson.JSONObject;
import com.xuhuaze.music.domain.ListSong;
import com.xuhuaze.music.service.ListSongService;
import com.xuhuaze.music.utils.Consts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

/*
 * 歌单歌曲管理类
 * */
@RestController
@RequestMapping("/listSong")
public class ListSongController {
    @Autowired
    private ListSongService listSongService;

    /*
     * 给歌单添加歌曲
     * */
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public Object addListSong(HttpServletRequest request) {
        JSONObject jsonObject = new JSONObject();
        String songId = request.getParameter("songId").trim();  //歌曲id
        String songListId = request.getParameter("songListId").trim();   //歌单id
        ListSong listSong = new ListSong();
        listSong.setSongId(Integer.parseInt(songId));
        listSong.setSongListId(Integer.parseInt(songListId));
        boolean flag=listSongService.insert(listSong);
            if (flag) {
                jsonObject.put(Consts.CODE, 1);
                jsonObject.put(Consts.MSG, "保存成功");
                return jsonObject;
            }
            jsonObject.put(Consts.CODE, 0);
            jsonObject.put(Consts.MSG, "保存失败");
            return jsonObject;
    }

    /*
     * 根据歌单id查询歌曲
     * */
    @RequestMapping(value = "/detail", method = RequestMethod.GET)
    public Object detail(HttpServletRequest request) {
        String songListId = request.getParameter("songListId");
        return listSongService.listSongOfSongListId(Integer.parseInt(songListId));
    }


    /*
     * 删除歌单里的歌曲
     * */
    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public Object delete(HttpServletRequest request) {
        String id = request.getParameter("id").trim();
        //先查询到数据库中对应的文件地址,删除掉它
        JSONObject jsonObject = new JSONObject();
        boolean flag = listSongService.delete(Integer.parseInt(id));
        return flag;
    }
}
