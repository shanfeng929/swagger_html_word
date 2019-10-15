package org.word;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Test02 {

    public static void main(String[] args) throws Exception {
        String msg = "iVBORw0KGgoAAAANSUhEUgAAABgAAAAYCAYAAADgdz34AAAABHNCSVQICAgIfAhkiAAAAc5JREFUSIntlMFq1EAYx3+ZyVpwwIXu1rbSk0+wUESNB/sIHjwKxRfwYMV38OITeGnRmwcxmtNC2JOCvfgC4mGFPYiWxLWS2eTzsEmabZN2qeutPxhIZr78v+/7z0zgggXj5uO/EQMJcGXRwi4wBLJ8xIBZpLhorSUIAun3+9JutwWQfI0Q3PAfrIu11uL7voRhKAXGGCG3ax/iT5B8rLFOnVH5EDC+72OMwfO8cnE0GhUx3w7PYdeMLYPBQKy1cpwkSaTT6QggHxo6aKLWliaqds1T+RDI3r1/K49eLMuvw4NSaGf3am2COI6FhtPlHBO3AEEQYIzh5q0bPHm5QjIZA/B8+weX3Dbdvc9ENjtq92GPJTK63S5RFAG0gAnMbvLPambvzm2evlorxQEe7y6Xz71rq2xurLO5sY5yqnUC8Luwq3p21/LMXz3PaytHc+/6aybp5BRHa1kFxvmYSTAu3rXWZJLy5st9/tgIEcgyUAq27qa0lIPrgDpReKlTtj3X7ctS2NuBB8+gpRXft3snYqxNa7897aIdBempuLs0T/QstR1Ya9GuIkuh2ALlTjux1tYKNc3XJTxg+iM772i8BwWXG+bnZXx2yAUV/gKxzw7l3g3FcwAAAABJRU5ErkJggg==";
        byte[] bytes = Base64.getDecoder().decode(msg
        );
        String mm = new String(bytes, StandardCharsets.US_ASCII.name());
        System.out.println(mm);

    }
}
