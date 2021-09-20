package mahtab.azizi.omdb.utils

import mahtab.azizi.omdb.def.Const
import java.util.*

/**
 * Mahtab Azizi <mahtab.azizy@gmail.com>
 */

fun Int.getSearchType(): String {
    return if (this == 0) Const.MOVIE else Const.SERIES
}


