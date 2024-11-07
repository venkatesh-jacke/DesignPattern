package Factory.Example2;

public class PythonCompiler implements Compiler{
    @Override
    public void compile(String code) {
        System.out.println(String.format("python %s",code));
    }
}
