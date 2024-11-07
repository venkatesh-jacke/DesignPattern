package Factory.Example2;

public class JavaCompiler implements Compiler{
    @Override
    public void compile(String code) {
        System.out.println(String.format("javac %s",code));
    }
}
