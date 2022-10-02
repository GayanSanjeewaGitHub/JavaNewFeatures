package org.example.Java8;

import javax.script.Bindings;
import javax.script.ScriptContext;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import java.io.FileReader;

public class Nashorn {
    public static void main(String[] args) {
        try {
            ScriptEngine ee = new ScriptEngineManager().getEngineByName("Nashorn");
            Bindings bindings = ee.getBindings(ScriptContext.ENGINE_SCOPE);
//100 also work as input argument
            bindings.put("name", "Think");
            ee.eval(new FileReader("/home/noetic/Documents/GITPersonal/gitPer/Java New Featues/src/main/resources/a.js"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
