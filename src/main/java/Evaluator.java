import javax.script.ScriptException;

public interface Evaluator {
    public Object evaluate(String expression) throws ScriptException;
}

