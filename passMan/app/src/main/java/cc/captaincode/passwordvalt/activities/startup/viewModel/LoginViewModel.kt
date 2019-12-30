package cc.captaincode.passwordvalt.activities.startup.viewModel

import cc.captaincode.passwordvalt.activities.startup.ui.LoginActivity
import cc.captaincode.passwordvalt.coordinators.StartupFlowCoordinator
import cc.captaincode.passwordvalt.data.User
import cc.captaincode.passwordvalt.utils.SharedPreferencesManager
import org.json.JSONObject

class LoginViewModel(private val loginActivity: LoginActivity) {

    var sp = SharedPreferencesManager(loginActivity)

    private fun packageUserData(user: User): JSONObject {
        val params = HashMap<String, String>()
        params["password"] = user.password
        return JSONObject(params as Map<String, String>)
    }

    fun login(user: User) {
        //TODO: compute the hash of the pw and verify that it matches what is stored in the pw db

//        NetworkUtil().fire(LOGIN, Request.Method.POST, packageUserData(user), this::handleSuccess, this::handleFailure, HashMap())
    }

    private fun handleSuccess(json:JSONObject){
        StartupFlowCoordinator.mainCoordinator?.startMain(loginActivity)
    }

//    private fun handleFailure(vError:VolleyError) {
//    }
}
