package service;

import dao.VideoDataUtil;
import dao.alldo.UserDO;
import dao.alldo.VideoDO;

import java.util.List;

import static service.Util.generateIDforVideo;

/**
 * @author yly
 * */
public class TrainerListUpload {
    /**
     * list trainers' upload video information
     * @param trainerid trainer id
     * @return result, video's id,type,name
     */
    public String listUpload(String trainerid){
        String result = null;
        List<VideoDO> videos = VideoDataUtil.findNodes(VideoDataUtil.xpathBuilder("uploader",trainerid));
        if(!videos.isEmpty()){
            int i = 0;
            for(VideoDO v: videos){
                if (i==0){
                    result = "************\n"+
                            "video's id: "+v.getId()+"\n"+
                            "video's type: "+v.getVideoType()+"\n"
                    + "video's name: "+v.getName()+"\n"
                    ;
                    i++;
                }else
                {
                    result = result +  "************\n"+
                            "video's id: "+v.getId()+"\n"+
                            "video's type: "+v.getVideoType()+"\n"
                            + "video's name: "+v.getName()+"\n"
                    ;
                }
            }

        }
        return result;
    }
}
