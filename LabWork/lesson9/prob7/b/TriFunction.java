package labwo.lesson9.problems.prob7.b;

@FunctionalInterface
public interface TriFunction<S, T, U, R> {
	R apply(S s, T t, U u);
}
