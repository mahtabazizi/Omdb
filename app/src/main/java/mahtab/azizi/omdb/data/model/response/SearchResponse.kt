package mahtab.azizi.omdb.data.model.response

import com.squareup.moshi.Json
import mahtab.azizi.omdb.data.model.response.Search

/**
 * Mahtab Azizi <mahtab.azizy@gmail.com>
 */

/**
 * Result for search movie
 *
 * @property search
 * @property totalResults
 * @property response
 * @property error
 */
data class SearchResponse(
    @Json(name = "Search")
    var search: List<Search>? = null,
    @Json(name = "totalResults")
    var totalResults: Int? = null,
    @Json(name = "Response")
    var response: String? = null,
    @Json(name = "Error")
    var error: String? = null
)
