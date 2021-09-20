package mahtab.azizi.omdb.di.module

import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import mahtab.azizi.omdb.data.remote.api.OmdbiService
import mahtab.azizi.omdb.def.Const
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import javax.inject.Singleton

/**
 * Mahtab Azizi <mahtab.azizy@gmail.com>
 */


@InstallIn(SingletonComponent::class)
@Module
class ApiModule {

    /**
     * Retrofit init
     */
    @Singleton
    @Provides
    fun provideRetrofitService(): OmdbiService = Retrofit.Builder()
        .baseUrl(Const.OMDB_API_URL)
        .addConverterFactory(
            MoshiConverterFactory.create(
                Moshi.Builder().add(KotlinJsonAdapterFactory()).build()
            )
        )
        .build()
        .create(OmdbiService::class.java)
}

