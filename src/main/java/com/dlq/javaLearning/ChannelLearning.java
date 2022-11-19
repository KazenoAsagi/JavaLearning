package com.dlq.javaLearning;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.Channel;

public class ChannelLearning {
    public static void main(String[] args) {
        String filepath = "";
        try (RandomAccessFile randomAccessFile
                   = new RandomAccessFile(filepath, "rw")) {
            Channel channel = randomAccessFile.getChannel();
            
            /*
            do {
                // 向 buffer 写入
                int len = channel.read(buffer);
                log.debug("读到字节数：{}", len);
                //读取到的位置，如果返回是-1， 表示没有内容了，直接返回
                if (len == -1) {
                    break;
                }
                // 切换 buffer 读模式
                buffer.flip();
                while(buffer.hasRemaining()) {
                    log.debug("{}", (char)buffer.get());
                }
                // 切换 buffer 写模式
                buffer.clear();
            } while (true);

作者：手辰_
链接：https://juejin.cn/post/6986109064145190925
来源：稀土掘金
著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
             */
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
