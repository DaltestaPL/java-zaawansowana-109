package lecture.lambda.generic;

@FunctionalInterface
public interface Process<T> {

    T apply(String s);
}
