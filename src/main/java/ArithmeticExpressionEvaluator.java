import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class ArithmeticExpressionEvaluator implements Evaluator {
    public Object evaluate(String expression) throws ScriptException {
        ScriptEngineManager mgr = new ScriptEngineManager();
        ScriptEngine engine = mgr.getEngineByName("JavaScript");
        return engine.eval(expression);
    }
}
