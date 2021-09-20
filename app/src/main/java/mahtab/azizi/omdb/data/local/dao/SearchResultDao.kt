package mahtab.azizi.omdb.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import mahtab.azizi.omdb.data.model.response.Search
import kotlinx.coroutines.flow.Flow

/**
 * Mahtab Azizi <mahtab.azizy@gmail.com>
 */


/**
 * Data Access Object (DAO) for [mahtab.azizi.omdb.data.local.OmdbiDatabase]
 */
@Dao
interface SearchResultDao {

    @Insert
    fun saveSearch(search: Search)

    @Query(value = "SELECT * from ${Search.TABLE_NAME} WHERE type = :searchType AND searchText = :searchText")
    fun getSearchResult(searchType: String, searchText: String): Flow<List<Search>>

}
