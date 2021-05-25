package service;

import dao.alldo.VideoDO;

import java.util.Collections;
import java.util.List;

import static dao.VideoDataUtil.findNodes;
import static dao.VideoDataUtil.xpathBuilder;

public class CustomerListAllVideoId {
    public List<String> listAllVideoId(){
        List<String> result = null;
//        List<VideoDO> l = findNodes(xpathBuilder("id","class002"));
//        for(VideoDO v:l){
//            String str = v.getId();
//            result.add(str);
//        }
        return result;
    }
}
