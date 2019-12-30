package cc.captaincode.passwordvalt.utils

class ConfigHelper {
    val ROOST_REMOTE_BASE = "https://roost-remote-devices.herokuapp.com/api"
    val VERSION = "/v1"
    val LOCATION = "/places"
    val LOGIN = "/session"
    val REGISTRATION = "/users"


    fun getApiURL(urlForContext: String): String {
        val url = ROOST_REMOTE_BASE + VERSION

        return "$url/$urlForContext"
    }
}