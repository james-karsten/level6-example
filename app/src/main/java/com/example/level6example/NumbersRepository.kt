package com.example.level6example

class NumbersRepository {

    private val numbersApi: NumbersApiService = NumbersApi.createApi()

    fun getRandomNumberTrivia() = numbersApi.getRandomNumberTrivia()
}