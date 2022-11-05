package io.ffactory.pokemondemo.service.impl

import io.ffactory.pokemondemo.entity.WildPokemon
import io.ffactory.pokemondemo.repository.WildPokemonRepository
import io.ffactory.pokemondemo.service.WildPokemonService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class WildPokemonServiceImpl implements WildPokemonService {

    @Autowired
    private final WildPokemonRepository wildPokemonRepository

    List<WildPokemon> findByTrainer(int trainerId) {
        wildPokemonRepository.findByTrainerId(trainerId)
    }
}
