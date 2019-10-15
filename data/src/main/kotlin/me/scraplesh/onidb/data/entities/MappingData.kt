package me.scraplesh.onidb.data.entities

import me.scraplesh.onidb.domain.entities.Entity

interface MappingData<out E : Entity> {
  val entity: E
}
