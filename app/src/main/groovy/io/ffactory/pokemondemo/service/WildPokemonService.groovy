package io.ffactory.pokemondemo.service

import io.ffactory.pokemondemo.entity.WildPokemon

interface WildPokemonService {

    List<WildPokemon> findByTrainer(int trainerId)
}