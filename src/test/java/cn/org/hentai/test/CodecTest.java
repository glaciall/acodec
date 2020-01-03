package cn.org.hentai.test;

import cn.org.hentai.acodec.AudioCodec;
import cn.org.hentai.acodec.CodecFactory;

import java.io.InputStream;

/**
 * Created by matrixy on 2020/1/4.
 */
public class CodecTest
{
    // reads encodec audio data from stdin and output to stdout
    public static void main(String[] args) throws Exception
    {
        if (args.length != 1)
        {
            System.err.println("missing parameter for audio codec name");
            System.exit(1);
            return;
        }

        AudioCodec codec = CodecFactory.getCodec(args[0]);
        InputStream in = System.in;
        int len = -1;
        byte[] data = new byte[320];
        while ((len = in.read(data)) > -1)
        {
            byte[] pcm;
            if (len == data.length)
            {
                pcm = codec.toPCM(data);
            }
            else
            {
                byte[] block = new byte[len];
                System.arraycopy(data, 0, block, 0, len);

                pcm = codec.toPCM(block);
            }

            System.out.write(pcm);
        }
    }
}
