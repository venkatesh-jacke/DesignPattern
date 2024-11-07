package Factory.Example2;

public class CppCompiler implements Compiler{
    @Override
    public void compile(String code) {
        System.out.println(String.format("cpp %s",code));
    }
}
