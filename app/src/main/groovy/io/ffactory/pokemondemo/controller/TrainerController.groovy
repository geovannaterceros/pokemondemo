package io.ffactory.pokemondemo.controller

import io.ffactory.pokemondemo.entity.Pokemon
import io.ffactory.pokemondemo.entity.Trainer
import io.ffactory.pokemondemo.service.TrainerService
import io.ffactory.pokemondemo.service.WildPokemonService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping('/trainers')
class TrainerController {

    @Autowired
    private final TrainerService trainerService

    @Autowired
    private final WildPokemonService wildPokemonService

    @RequestMapping(method = RequestMethod.GET)
    List<Trainer> findAll() {
        trainerService.findAll()
    }

    @RequestMapping(value = '/{id}/pokemon', method = RequestMethod.GET)
    List<Trainer> findCaughtPokemon(@PathVariable('id') int id) {
        wildPokemonService.findByTrainer(id)
    }

    @RequestMapping(value = '/{id}', method = RequestMethod.GET)
    Trainer findById(@PathVariable('id') int id) {
        trainerService.findById(id)
    }
}
