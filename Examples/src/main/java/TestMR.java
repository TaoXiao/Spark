import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileStatus;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

import java.io.IOException;

/**
 * Created by tao on 1/17/16.
 */
public class TestMR {
  public static void main(String[] args) {

  }

  public static void test_FSDownload(Path sCopy, Path dstDir) throws IOException {
    Configuration conf = new Configuration();

    FileSystem sourceFs = sCopy.getFileSystem(conf);
    Path dCopy = new Path(dstDir, "tmp_"+sCopy.getName());
    FileStatus sStat = sourceFs.getFileStatus(sCopy);


    System.out.println("sourceFs=" + sourceFs);
    System.out.println("dCopy=" + dCopy);
    System.out.println("sourceFs=" + sourceFs);


    System.out.println("sStat.getModificationTime()=" + sStat.getModificationTime());


  }
}
