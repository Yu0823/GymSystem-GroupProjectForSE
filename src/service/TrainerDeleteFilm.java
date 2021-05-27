package service;

import dao.VideoDataUtil;
import dao.alldo.VideoDO;

import java.util.List;

public class TrainerDeleteFilm {
    /**
     * delete the video by id
     * @param videoid
     * @return weather delete successful
     */
    public boolean deleteFilm(String videoid){
        return VideoDataUtil.delNodes(VideoDataUtil.xpathBuilder("id",videoid));
    }
}
