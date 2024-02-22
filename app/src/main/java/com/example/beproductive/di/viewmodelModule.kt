package com.example.beproductive.di

import org.koin.dsl.module
import com.example.beproductive.viewmodel.NoteDetailVM
import org.koin.core.module.dsl.singleOf

val viewmodelModule = module {
    singleOf(::NoteDetailVM)
}

