package cc.captaincode.passwordvalt.coordinators
import android.content.Context
import android.content.Intent
import android.widget.Toast
import cc.captaincode.passwordvalt.activities.home.ui.HomeActivity
import cc.captaincode.passwordvalt.activities.startup.ui.LoginActivity

class StartupFlowCoordinator(context: Context) {
//    val queue: RequestQueue? = Volley.newRequestQueue(context)


    companion object {
        fun init(context: Context) {
            mainCoordinator =
                StartupFlowCoordinator(context)
        }

        var mainCoordinator: StartupFlowCoordinator? = null
    }

    fun startLogin(context: Context) {
        context.startActivity(Intent(context, LoginActivity::class.java))
    }

    fun setupLogin(loginActivity: LoginActivity) {
        loginActivity.loginViewModel::login
    }

//    fun setupRegistration(registerActivity: SignUpActivity) {
//        registerActivity.registerViewModel::register
//    }

    fun startMain(context: Context) {
        Toast.makeText(context, "Welcome back!", Toast.LENGTH_LONG).show()
        context.startActivity(Intent(context, HomeActivity::class.java))
    }

//    fun startRegistratin(context:Context){
//        context.startActivity(Intent(context, SignUpActivity::class.java))
//    }
}