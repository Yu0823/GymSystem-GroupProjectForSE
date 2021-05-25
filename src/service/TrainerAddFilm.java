package service;

import dao.VideoDataUtil;
import dao.alldo.VideoDO;

import static service.Util.generateIDforVideo;

public class TrainerAddFilm {
    /**
     * add the film
     * @param path video's path, author
     * @return weather add successful
     */
    public Boolean  addFilm(String path,String author){
        VideoDO video = new VideoDO();
        video.setId(generateIDforVideo());
        video.setPath(path);
        video.setUploader(author);
        VideoDataUtil.addVideo(video);
        return true;
    }
}
