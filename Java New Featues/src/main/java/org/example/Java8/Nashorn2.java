package org.example.Java8;

import javax.script.*;
import java.io.FileReader;

public class Nashorn2  {
    public static void main(String[] args) throws  Exception{
        ScriptEngine engineByName = new ScriptEngineManager().getEngineByName("Nashorn");
        try {
            Bindings bindings = engineByName.getBindings(ScriptContext.ENGINE_SCOPE);
//100 also work as input argument
            bindings.put("name", "Think");
            engineByName.eval(new FileReader("/home/noetic/Documents/GITPersonal/gitPer/Java New Featues/src/main/resources/a.js"));
            Invocable invocable = (Invocable) engineByName;
            invocable.invokeFunction("bbb"); //passing parameter also possible

        } catch (Exception e) {
           e.printStackTrace();
        }

    }
}
