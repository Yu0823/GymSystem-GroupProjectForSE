package service;

import dao.alldo.VideoDO;

import java.util.List;

import static dao.VideoDataUtil.findNodes;
import static dao.VideoDataUtil.xpathBuilder;

public class CustomerSearchVideoByType {
    /**
     * customer search the video
     *
     */
    public List<VideoDO> searchVideoByType(String type)
    {
        List<VideoDO> l = findNodes(xpathBuilder("videoType",type));
        return l;
    }
}
