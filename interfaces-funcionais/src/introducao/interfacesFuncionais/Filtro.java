package introducao.interfacesFuncionais;

@FunctionalInterface
public interface Filtro<T> {

    boolean avaliar(T obj);
    //isso é uma interface do tipo SAM
    //Single abstract method
}
