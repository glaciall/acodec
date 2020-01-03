package cn.org.hentai.acodec;

import java.io.UnsupportedEncodingException;

/**
 * Created by matrixy on 2020/1/4.
 * audio codec factory
 */
public final class CodecFactory
{
    /**
     * create AudioCodec instance by the giving parameter codecName
     * @param codecName the codec name string, eg. adpcm
     * @return AudioCodec instance
     * @throws UnsupportedEncodingException throws if no codec matches
     */
    public static AudioCodec getCodec(String codecName) throws UnsupportedEncodingException
    {
        if ("adpcm".equalsIgnoreCase(codecName)) return new ADPCMCodec();
        else if ("g711a".equalsIgnoreCase(codecName)) return new G711ACodec();
        else if ("g711u".equalsIgnoreCase(codecName)) return new G711UCodec();
        else throw new UnsupportedEncodingException(codecName);
    }
}
