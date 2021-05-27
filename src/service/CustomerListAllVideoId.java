package service;

import dao.alldo.VideoDO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static dao.VideoDataUtil.findNodes;
import static dao.VideoDataUtil.xpathBuilder;

public class CustomerListAllVideoId {
    /**
     * customer search the video
     * @param level, user's level
     * @return l, the video list of all video that can be accessed.
     */
    public List<String> listAllVideoId(String level){
        List<String> result =  new ArrayList<String>();
        List<VideoDO> l;
        List<VideoDO> l1;
        List<VideoDO> l2;
        if(level.equals("normol"))
            l = findNodes(xpathBuilder("level","0"));
        else if(level.equals("VIP"))
        {
            l = findNodes(xpathBuilder("level","0"));
            l1 = findNodes(xpathBuilder("level","1"));
            l.addAll(l1);
        }else{
            l = findNodes(xpathBuilder("level","0"));
            l1 = findNodes(xpathBuilder("level","1"));
            l2 =  findNodes(xpathBuilder("level","2"));
            l.addAll(l1);
            l.addAll(l2);
        }
        for(VideoDO v:l){
            String str = v.getId();
            result.add(str);
        }
        return result;
    }
}
