package alzaichsank.com.aplikasifootbalmatchschedule.view.Match.`interface`

import alzaichsank.com.aplikasifootbalmatchschedule.model.EventsItem
import alzaichsank.com.aplikasifootbalmatchschedule.utils.ServerCallback
import android.app.Activity
import android.content.Context

interface MatchInterface {
    fun isNetworkAvailable(context: Activity): Boolean
    fun getSpinnerData(context: Activity,  callback: ServerCallback)
    fun getPrevMatch(context: Activity, id : String,  callback: ServerCallback)
    fun getNextMatch(context: Activity, id : String,  callback: ServerCallback)
    fun isSuccess(response: String): Boolean
    fun parsingData(context: Activity, response: String): ArrayList<EventsItem>
    fun getFavoritesAll(context: Context) : ArrayList<EventsItem>
}