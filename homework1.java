package day01;
import java.io.*;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class homework1 {
    public static void main(String[] args)throws Exception{
        String expr = "1+3";
        //创建一个ScriptEngineManager对象
        ScriptEngineManager manager = new ScriptEngineManager();
        //通过ScriptEngineManager获得ScriptEngine对象
        ScriptEngine engine = manager.getEngineByName("js");
        //js的eval（）方法可以执行字符串的代码
        Object result = engine.eval(expr);
        System.out.println(result);
    }
}
