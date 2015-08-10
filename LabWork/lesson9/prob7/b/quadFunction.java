package labwo.lesson9.problems.prob7.b;

@FunctionalInterface
public interface quadFunction<S, T, C, U, R> {
	R apply(S s, T t, C c, U u);
}
