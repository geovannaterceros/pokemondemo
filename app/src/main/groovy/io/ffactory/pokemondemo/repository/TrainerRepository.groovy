package io.ffactory.pokemondemo.repository

import io.ffactory.pokemondemo.entity.Trainer
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface TrainerRepository extends JpaRepository<Trainer, Integer> {

    List<Trainer> findAll()

    Trainer findById(Integer id)
}