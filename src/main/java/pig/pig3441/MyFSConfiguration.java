package pig.pig3441;

import org.apache.hadoop.conf.Configuration;

public class MyFSConfiguration {
    static {
        Configuration.addDefaultResource("myfs-site.xml");
    }

    public static void init() {}
}
