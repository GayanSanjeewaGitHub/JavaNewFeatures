package org.example.Java8;

import javax.script.*;
import java.io.*;

  class Nashorn {
    public static void main(String[] args)
            throws Exception
    {

        // Here we are generating Nashorn JavaScript Engine
        ScriptEngine ee = new ScriptEngineManager()
                .getEngineByName("Nashorn");

        ee.eval(new FileReader("../aaa.js"));
    }
}





