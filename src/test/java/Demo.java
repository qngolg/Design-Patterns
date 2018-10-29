import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @Author qiangl
 * Created by qgl on 2018/10/28.
 */
public class Demo {


    public static void main(String[] args) {

        Map map = new HashMap();
        map.put("aa","aa");
        map.put("bb","bb");
        map.put("cc","cc");

        //1
        Set set = map.keySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next() + "  " + map.get(iterator.next()));
        }

        //2
        Set set2 = map.entrySet();
        Iterator iterator1 = set2.iterator();
        while (iterator1.hasNext()){
            Map.Entry entry = (Map.Entry) iterator1.next();
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        //2
        for (Object o:map.entrySet()){
            Map.Entry entry = (Map.Entry) o;
            System.out.println(entry.getKey() + "  " + entry.getValue());
        }

        //3
        for (Object o:map.keySet()){
            System.out.println(o + "  " + map.get(o));
        }


    }
}
