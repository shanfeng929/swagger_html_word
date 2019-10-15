package org.word;


import org.apache.commons.codec.binary.Hex;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.nio.charset.StandardCharsets;

public class Test {

    public static void main(String[] args) throws Exception {
        File file = new File("/Users/kaye0110/aa");
        byte[] bytes = FileUtils.readFileToByteArray(file);

        String msg = new String(bytes, "GB2312");

        System.out.println(msg);

    }
}
