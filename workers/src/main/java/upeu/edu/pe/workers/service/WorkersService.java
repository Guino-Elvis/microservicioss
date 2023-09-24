package upeu.edu.pe.workers.service;

import java.util.List;
import java.util.Optional;

import upeu.edu.pe.workers.entity.Workers;

public interface WorkersService {
    public List<Workers> listar();

    public Workers guardar(Workers workers);

    public Workers actualizar(Workers workers);

    public Optional<Workers> listarPorId(Integer id);

    public void eliminarPorId(Integer id);
}
