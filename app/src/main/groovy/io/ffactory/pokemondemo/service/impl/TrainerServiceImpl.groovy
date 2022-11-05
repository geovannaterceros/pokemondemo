package io.ffactory.pokemondemo.service.impl

import io.ffactory.pokemondemo.entity.Trainer
import io.ffactory.pokemondemo.repository.TrainerRepository
import io.ffactory.pokemondemo.service.TrainerService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class TrainerServiceImpl implements TrainerService {

    @Autowired
    private final TrainerRepository trainerRepository

    @Override
    List<Trainer> findAll() {
        trainerRepository.findAll()
    }

    Trainer findById(int id) {
        trainerRepository.findById(id)
    }
}
