package dao;

import dao.alldo.ClassDO;
import dao.alldo.VideoDO;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

import java.io.File;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

/**
 * @author yu
 */
public class VideoDataUtil {
    /**
     * add a video into the xml to store
     *
     * @param video a videoDO of the class you want to add
     * @return true when success, false when fail
     */
    public static boolean addVideo(VideoDO video) {


        try {

            SAXReader reader = new SAXReader();

            File xmlFile = null;

            String pos = "data/videos.xml";
            
            xmlFile = new File(pos);

            Document doc = reader.read(xmlFile);

            Element root = doc.getRootElement();

            Element newElement = root.addElement("video");

            newElement.addAttribute("id", video.getId());
            newElement.addAttribute("path", video.getPath());
            newElement.addAttribute("name", video.getName());
            newElement.addAttribute("videotype", video.getVideoType());
            newElement.addAttribute("length", video.getLength());
            newElement.addAttribute("uploader", video.getUploader());
            newElement.addAttribute("level", video.getLevel());


            Writer out = new PrintWriter(pos, "UTF-8");

            //format control
            OutputFormat format = OutputFormat.createPrettyPrint();
            format.setTrimText(false);
            format.setNewlines(true);

            XMLWriter writer = new XMLWriter(out, format);

            writer.write(doc);

            // close
            out.close();
            writer.close();

        } catch (Exception e) {
            // exception settle down
            e.printStackTrace();
        }
        return true;
    }

    /**
     * build a path to find all videos
     * @return
     */
    public static String xpathBuilder(){
        return "//" + "video";
    }
    /**
     *
     * @param searchCondition the name of the condition you want to delete
     * @param searchContent the content of the condition you want to delete
     * @return a xpath built by your conditions
     */
    public static String xpathBuilder(String searchCondition, String searchContent){
        return "//" + "video" + "[@" + searchCondition + "='" + searchContent + "']";
    }
    /**
     *
     * @param searchCondition1 the name of the condition you want to delete
     * @param searchContent1 the content of the condition you want to delete
     * @param searchCondition2 as above
     * @param searchContent2 as above
     * @return a xpath built by your conditions
     */
    public static String xpathBuilder(String searchCondition1, String searchContent1,
                                      String searchCondition2, String searchContent2){
        return "//" + "video" + "[@" + searchCondition1 + "='" + searchContent1 + "' and @" +
                searchCondition2 + "='" + searchContent2 + "']";
    }



    /**
     * delete videos by condition
     *
     * @param xpath Search path built by the builder
     * @return success or not
     */
    public static boolean delNodes(String xpath){
        
        String pos = "data/classes.xml";

        try {
            // init the reader
            SAXReader reader = new SAXReader();

            // get the Document
            File xmlFile = new File(pos);

            Document doc = reader.read(xmlFile);

            //search
            List<Element> result = doc.selectNodes(xpath);

            for(Element e : result){
                System.out.println(e.getName() + e.getData());
                e.getParent().remove(e);
            }

            Writer out = new PrintWriter(pos, "UTF-8");

            XMLWriter writer = new XMLWriter(out);

            writer.write(doc);

            // close
            out.close();
            writer.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }
    
    /**
     * search many classes by condition
     *
     * @param xpath the search path built by function xpathBuilder
     * @return the correct videoDOs
     */
    public static List<VideoDO> findNodes(String xpath){

        String pos = "data/videos.xml";

        try {
            // init the reader
            SAXReader reader = new SAXReader();

            // get the Document
            File xmlFile = new File(pos);

            Document doc = reader.read(xmlFile);

            //search
            List<Element> iniResult = doc.selectNodes(xpath);
            List<VideoDO> finalResult = new ArrayList<>();


            for(Element c : iniResult){
                VideoDO temp = new VideoDO();
                temp.setId(c.attributeValue("id"));
                temp.setPath(c.attributeValue("path"));
                temp.setVideoType(c.attributeValue("videotype"));
                temp.setName(c.attributeValue("name"));
                temp.setUploader(c.attributeValue("uploader"));
                temp.setLength(c.attributeValue("length"));
                temp.setLevel(c.attributeValue("level"));
                finalResult.add(temp);
            }
            return finalResult;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        VideoDO v = new VideoDO();
        v.setId("class002");
        v.setLength("120");
        v.setName("5");
        v.setUploader("t001");
        v.setVideoType("yoga");
        v.setLevel("1");
        //addVideo(v);
        VideoDataUtil.addVideo(v);
    }
}
