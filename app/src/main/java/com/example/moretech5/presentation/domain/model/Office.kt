package com.example.moretech5.presentation.domain.model

data class Office(
    val workload:Int,
    val address:String,
    val status:Boolean,
    val isPrime:Boolean,
    val privateAccess:Boolean,
    val openLegalHours:List<OpenHour>?,
    val openIndividualHours:List<OpenHour>?,
    val rko:Boolean,
    val suo:Boolean,
    val hasRamp:Boolean,
    val latitude:Double,
    val longitude:Double
)
