package pig.pig3441;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.*;
import org.apache.hadoop.fs.permission.FsPermission;
import org.apache.hadoop.util.Progressable;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URI;

public class MyFileSystem extends FileSystem {
    static {
        MyFSConfiguration.init();
    }

    private URI uri = null;

    private static final String MYFS_SCHEME = "myfs";

    private static final Log LOG = LogFactory.getLog(MyFileSystem.class);

    public MyFileSystem() {
        super();
    }

    @Override
    public void initialize(URI name, Configuration conf) throws IOException {
        setConf(conf);
        if(conf.get("myfs.test") == null) {
            LOG.error("This is the error mentioned in PIG-3441. Conf is null since it is added as default resource - conf.get('myfs.test') = " + conf.get("myfs.test"));
            conf.addResource("myfs-site.xml");
            if(conf.get("myfs.test") != null) {
                LOG.error("Conf can now be found after adding it as non-default resource - conf.get('myfs.test') = " + conf.get("myfs.test"));
            }
            throw new IllegalStateException("This is the error mentioned in PIG-3441");
        }
        LOG.error("found default resource myfs-site.xml. conf.get(\"myfs.test\") = " + getConf().get("myfs.test"));
        uri = name;
    }

    @Override
    public URI getUri() {
        return uri;
    }

    @Override
    public String getScheme() {
        return MYFS_SCHEME;
    }

    @Override
    public FSDataInputStream open(Path f, int bufferSize) throws IOException {
        LOG.warn("found default resource myfs-site.xml. conf.get(\"myfs.test\") = " + getConf().get("myfs.test"));
        throw new UnsupportedOperationException("myfs is dummy");
    }

    @Override
    public FSDataOutputStream create(Path f, FsPermission permission, boolean overwrite, int bufferSize, short replication, long blockSize, Progressable progress) throws IOException {
        LOG.warn("found default resource myfs-site.xml. conf.get(\"myfs.test\") = " + getConf().get("myfs.test"));
        throw new UnsupportedOperationException("myfs is dummy");
    }

    @Override
    public FSDataOutputStream append(Path f, int bufferSize, Progressable progress) throws IOException {
        LOG.warn("found default resource myfs-site.xml. conf.get(\"myfs.test\") = " + getConf().get("myfs.test"));
        throw new UnsupportedOperationException("myfs is dummy");
    }

    @Override
    public boolean rename(Path src, Path dst) throws IOException {
        LOG.warn("found default resource myfs-site.xml. conf.get(\"myfs.test\") = " + getConf().get("myfs.test"));
        throw new UnsupportedOperationException("myfs is dummy");
    }

    @Override
    public boolean delete(Path f, boolean recursive) throws IOException {
        LOG.warn("found default resource myfs-site.xml. conf.get(\"myfs.test\") = " + getConf().get("myfs.test"));
        throw new UnsupportedOperationException("myfs is dummy");
    }

    @Override
    public FileStatus[] listStatus(Path f) throws FileNotFoundException, IOException {
        LOG.warn("found default resource myfs-site.xml. conf.get(\"myfs.test\") = " + getConf().get("myfs.test"));
        throw new UnsupportedOperationException("myfs is dummy");
    }

    @Override
    public void setWorkingDirectory(Path new_dir) {
        LOG.warn("found default resource myfs-site.xml. conf.get(\"myfs.test\") = " + getConf().get("myfs.test"));
        throw new UnsupportedOperationException("myfs is dummy");
    }

    @Override
    public Path getWorkingDirectory() {
        LOG.warn("config value = " + getConf().get("myfs.test"));
        throw new UnsupportedOperationException("myfs is dummy");
    }

    @Override
    public boolean mkdirs(Path f, FsPermission permission) throws IOException {
        LOG.warn("found default resource myfs-site.xml. conf.get(\"myfs.test\") = " + getConf().get("myfs.test"));
        throw new UnsupportedOperationException("myfs is dummy");
    }

    @Override
    public FileStatus getFileStatus(Path f) throws IOException {
        LOG.warn("found default resource myfs-site.xml. conf.get(\"myfs.test\") = " + getConf().get("myfs.test"));
        throw new UnsupportedOperationException("myfs is dummy");
    }
}
