package cc.captaincode.passwordvalt.activities.startup.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import cc.captaincode.passwordvalt.R
import cc.captaincode.passwordvalt.activities.startup.viewModel.LoginViewModel

class LoginActivity : AppCompatActivity() {

    lateinit var loginViewModel: LoginViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }
}
