package service;

import dao.VideoDataUtil;
import dao.alldo.VideoDO;

import java.util.List;

/**
 * @author yly
 * */
public class TrainerListVideo {
    /**
     * list trainers' upload video object
     * @param trainerid trainer id
     * @return videos
     */
    public List<VideoDO> listUpload(String trainerid){
        List<VideoDO> videos = VideoDataUtil.findNodes(VideoDataUtil.xpathBuilder("uploader",trainerid));
        if(videos.isEmpty())
            return null;
        else
            return videos;
    }
}
