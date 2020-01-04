## acodec
A Java Audio Codec for G711A/G711U/ADPCM. Pure java implements, no any other 3rd-party library required.

### Audio Codec

|Codec|Support?|
|---|---|
|ADPCM|Y|
|G711A (alaw)|Y|
|G711U (ulaw)|Y|
|G726|N|

### Maven
```xml
<dependency>
  <groupId>cn.org.hentai</groupId>
  <artifactId>acodec</artifactId>
  <version>1.0.0</version>
</dependency>
```

### Example

```java
class Test
{
    public static void main(String[] args) throws Exception
    {
        // create AudioCodec instance by name
        AudioCodec codec = CodecFactory.getCodec("adpcm");
        
        // prepare some encodec adpcm data
        byte[] rawADPCMData;
        
        // decode adpcm to pcm
        byte[] pcmData = codec.toPCM(rawADPCMData);
        
        // encode pcm to adpcm
        byte[] adpcmData = codec.fromPCM(pcmData);
    }
}

```