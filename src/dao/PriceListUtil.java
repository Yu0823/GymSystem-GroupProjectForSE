package dao;

import dao.alldo.PriceListDO;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

import java.io.File;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.List;

/**
 * Some utils for price data
 * @author yu
 */
public class PriceListUtil {
    /**
     * update the price list in the data
     * @param l a list of all price
     * @return true when success, false when fail
     */
    public static boolean updatePrice(PriceListDO l) {

        try {

            SAXReader reader = new SAXReader();

            File xmlFile = null;

            String pos = "data/priceList.xml";

            xmlFile = new File(pos);

            Document doc = reader.read(xmlFile);

            List<Element> result = doc.selectNodes("//priceList");

            for(Element e : result){
                System.out.println(e.getName() + e.getData());
                e.getParent().remove(e);
            }

            Element root = doc.getRootElement();

            Element newElement = root.addElement("priceList");

            newElement.addAttribute("price1", l.getPrice1());
            newElement.addAttribute("price2", l.getPrice2());

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
     * query the price list in database now
     * @return the real time price list
     */
    public static PriceListDO getPriceList(){

        String pos = "data/priceList.xml";

        try {
            // init the reader
            SAXReader reader = new SAXReader();

            // get the Document
            File xmlFile = new File(pos);

            Document doc = reader.read(xmlFile);

            String xpath = "//" + "priceList";

            //search
            Element e = (Element) doc.selectSingleNode(xpath);

            PriceListDO l = new PriceListDO();
            l.setPrice1(e.attributeValue("price1"));
            l.setPrice2(e.attributeValue("price2"));

            return l;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        PriceListDO l = new PriceListDO();
        l.setPrice1("150");
        l.setPrice2("250");
        updatePrice(l);
        PriceListDO now = getPriceList();
        System.out.println(now);
    }
}
