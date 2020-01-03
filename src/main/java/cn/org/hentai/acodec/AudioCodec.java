package cn.org.hentai.acodec;

import java.io.UnsupportedEncodingException;

/**
 * Created by houcheng on 2019-12-11.
 * the abstract AudioCodec prototype
 */
public abstract class AudioCodec
{
    /**
     * converts to PCM from current audio data encoding
     * @param data encoded audio data
     * @return decoded PCM data
     */
    public abstract byte[] toPCM(byte[] data);

    /**
     * converts to current audio data encoding
     * @param data raw PCM data
     * @return encoded audio data, like adpcm data
     */
    public abstract byte[] fromPCM(byte[] data);
}
