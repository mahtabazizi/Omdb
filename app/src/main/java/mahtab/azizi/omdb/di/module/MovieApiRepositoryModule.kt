package mahtab.azizi.omdb.di.module

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityRetainedComponent
import dagger.hilt.android.scopes.ActivityRetainedScoped
import mahtab.azizi.omdb.data.repository.DefaultOmdbiRepository
import mahtab.azizi.omdb.data.repository.OmdbiRepository
import kotlinx.coroutines.ExperimentalCoroutinesApi

/**
 * Mahtab Azizi <mahtab.azizy@gmail.com>
 */

@ExperimentalCoroutinesApi
@InstallIn(ActivityRetainedComponent::class)
@Module
abstract class MovieApiRepositoryModule {

    /**
     * Init Api Repository
     *
     * @param repository
     * @return
     */
    @ActivityRetainedScoped
    @Binds
    abstract fun bindMovieRepository(repository: DefaultOmdbiRepository): OmdbiRepository
}
