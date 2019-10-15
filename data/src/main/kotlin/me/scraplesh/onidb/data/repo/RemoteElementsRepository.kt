package me.scraplesh.onidb.data.repo

import me.scraplesh.onidb.data.datasources.FirebaseWebApi
import me.scraplesh.onidb.domain.repo.ElementsRepository

class RemoteElementsRepository(private val webDataSource: FirebaseWebApi) : ElementsRepository