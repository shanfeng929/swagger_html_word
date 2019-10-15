package org.word;

import lombok.extern.slf4j.Slf4j;
import org.mozilla.universalchardet.UniversalDetector;

@Slf4j
public class GetByteEncode {

    /**
     * 获取文件编码类型
     *
     * @param bytes 文件bytes数组
     * @return      编码类型
     */
    public static String getEncoding(byte[] bytes) {
        String defaultEncoding = "UTF-8";
        UniversalDetector detector = new UniversalDetector(null);
        detector.handleData(bytes, 0, bytes.length);
        detector.dataEnd();
        String encoding = detector.getDetectedCharset();
        detector.reset();
        log.info("字符编码是：{}", encoding);
        if (encoding == null) {
            encoding = defaultEncoding;
        }
        return encoding;
    }
}
