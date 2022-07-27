package semana6;

public interface OperacionesSQL<T, K> {
    // Create
    public void Insertar(T objeto);

    // Update
    public void Actualizar(T objeto);

    // Read
    public void Obtener(K id);

    // Delete
    public void Borrar(K id);
}
