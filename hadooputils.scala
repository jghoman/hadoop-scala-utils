import org.apache.hadoop.conf._
import org.apache.hadoop.fs._
import org.apache.hadoop.io._
import org.apache.hadoop.hdfs._
import java.net._
import java.io.IOException

implicit def string2Path(s: String):Path = new Path(s)
implicit def string2Text(s: String):Text = new Text(s)
implicit def double2Writable(d: Double):DoubleWritable = new DoubleWritable(d)
implicit def int2Writable(i: Int):IntWritable = new IntWritable(i)
implicit def float2Writable(f: Float):FloatWritable = new FloatWritable(f)
implicit def bytes2Writable(b: Array[Byte]):BytesWritable = new BytesWritable(b)

lazy val defaultConf = new Configuration
lazy val defaultFsName = defaultConf.get("fs.default.name")
lazy val defaultFs = FileSystem.get(defaultConf)

