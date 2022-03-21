package br.com.estudos.notifications

import android.app.Service
import android.content.Intent
import android.os.IBinder
import com.google.firebase.iid.FirebaseInstanceIdReceiver
import com.google.firebase.iid.FirebaseInstanceIdService

class MyFirebaseInstanceService() : FirebaseInstanceIdService(){

    override fun onTokenRefresh() {
        super.onTokenRefresh()
    }




}