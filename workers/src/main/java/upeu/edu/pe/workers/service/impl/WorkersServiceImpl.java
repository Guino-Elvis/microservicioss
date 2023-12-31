package upeu.edu.pe.workers.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import upeu.edu.pe.workers.entity.Workers;
import upeu.edu.pe.workers.repository.WorkersRepository;
import upeu.edu.pe.workers.service.WorkersService;

@Service
public class WorkersServiceImpl implements WorkersService {
    @Autowired
    private WorkersRepository workersRepository;

    @Override
    public List<Workers> listar() {
        return workersRepository.findAll();
    }

    @Override
    public Workers guardar(Workers workers) {
        return workersRepository.save(workers);
    }

    @Override
    public Workers actualizar(Workers workers) {
        return workersRepository.save(workers);
    }

    @Override
    public Optional<Workers> listarPorId(Integer id) {
        return workersRepository.findById(id);
    }

    @Override
    public void eliminarPorId(Integer id) {
        workersRepository.deleteById(id);
    }
}
