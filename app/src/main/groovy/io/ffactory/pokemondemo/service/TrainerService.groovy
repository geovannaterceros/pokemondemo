package io.ffactory.pokemondemo.service

import io.ffactory.pokemondemo.entity.Trainer

interface TrainerService {

    List<Trainer> findAll()

    Trainer findById(int id)
}