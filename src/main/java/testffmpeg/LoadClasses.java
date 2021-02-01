package testffmpeg;

import org.bytedeco.ffmpeg.avcodec.AVCodec;
import org.bytedeco.ffmpeg.global.*;
import org.bytedeco.javacpp.Loader;

public class LoadClasses
{
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        Loader.load(avcodec.class);
        Loader.load(avdevice.class);
        Loader.load(avformat.class);
        Loader.load(avutil.class);
        Loader.load(swscale.class);
        long end = System.currentTimeMillis();
        System.out.println(" duration: " + (end-start) + "ms");

    }
}
