package com.tkh.tech.cleanachitecturerickandmorty.data.remote.dto

data class Info(
    val count: Int? = null,
    val next: String,
    val pages: Int? = null,
    val prev: Any
)