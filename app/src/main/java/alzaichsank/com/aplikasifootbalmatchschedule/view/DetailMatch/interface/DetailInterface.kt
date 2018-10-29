package alzaichsank.com.aplikasifootbalmatchschedule.view.DetailMatch.`interface`

import alzaichsank.com.aplikasifootbalmatchschedule.model.EventsItem
import alzaichsank.com.aplikasifootbalmatchschedule.utils.ServerCallback
import android.app.Activity
import android.content.Context

interface DetailInterface {
    fun isNetworkAvailable(context: Activity): Boolean
    fun geDetailTeam(context: Activity, id : String,  callback: ServerCallback)
    fun isSuccess(response: String): Boolean
    fun parsingData(context: Activity, response: String): ArrayList<EventsItem>
    fun addFavorites(context: Context, data: EventsItem)
    fun removeFavorites(context: Context, data: EventsItem)
    fun isFavorite(context: Context, data: EventsItem): Boolean
}