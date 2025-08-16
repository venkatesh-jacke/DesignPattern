package Factory.Example2;

public class CompilerFactory {
    public static Compiler getCompiler(String language){
        return switch(language){
            case "cpp" -> new CppCompiler();
            case "java" -> new JavaCompiler();
            case "python" -> new PythonCompiler();
            default -> throw new IllegalArgumentException("Unsupported Language");
        };
    }
}
