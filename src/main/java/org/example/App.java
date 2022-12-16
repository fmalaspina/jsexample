package org.example;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws ScriptException {
        // Here we are generating Nashorn JavaScript Engine
        ScriptEngine ee = new ScriptEngineManager()
                .getEngineByName("Nashorn");

        // Instead of reading JavaScript code from a file.
        // We can directly paste the JavaScript
        // code inside Java Code
        ee.eval("print('Welcome to Geeksforgeeks!!!"
                + " Executing JavaScript code with the"
                + " help of Nashorn engine');");

    }
}
