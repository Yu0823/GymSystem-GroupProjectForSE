package service;
import dao.alldo.VideoDO;
import java.util.List;
import static dao.VideoDataUtil.findNodes;
import static dao.VideoDataUtil.xpathBuilder;

/**
 * @author yly
 * */
public class CustomerSearchVideoByType {
    /**
     * customer search the video
     * @param type, video's types
     * @return l, the video list of certain type.
     */
    public List<VideoDO> searchVideoByType(String type)
    {
        List<VideoDO> l = findNodes(xpathBuilder("videotype",type));
        return l;
    }
}
