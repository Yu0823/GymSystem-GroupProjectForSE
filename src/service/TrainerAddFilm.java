package service;

import dao.VideoDataUtil;
import dao.alldo.VideoDO;

import static service.Util.generateIDforVideo;

/**
 * @author yly
 * */
public class TrainerAddFilm {
    /**
     * add the film
     * @param video object
     * @return weather add successful
     */
    public Boolean addFilm(VideoDO video){
        VideoDataUtil.addVideo(video);
        return true;
    }
}
