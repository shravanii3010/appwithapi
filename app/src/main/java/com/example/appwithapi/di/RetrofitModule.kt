package com.example.appwithapi.di

import com.example.appwithapi.data.remote.GameApi
import com.example.appwithapi.util.Constants.Companion.BASE_URL
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RetrofitModule{

    @Singleton
    @Provides
    fun provideRetrofit(): Retrofit{

        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Singleton
    @Provides
    fun provideGameApi(Retrofit): GameApi {
        return retrofit.create(GameApi::class.java)
    }


}