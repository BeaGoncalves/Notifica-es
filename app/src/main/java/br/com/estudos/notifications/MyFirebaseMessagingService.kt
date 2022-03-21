package br.com.estudos.notifications

import android.util.Log
import com.google.firebase.iid.FirebaseInstanceId
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage

class MyFirebaseMessagingService : FirebaseMessagingService() {

    val tag = "FirebaseMessagingServ"

    override fun onMessageReceived(remoteMessage: RemoteMessage) {
        if (remoteMessage.notification != null){
            this.showNotification("1234",
                remoteMessage.notification?.title.toString(),
                remoteMessage.notification?.body.toString())
        }

        Log.i(tag,  remoteMessage.from.toString())
    }

    override fun onNewToken(p0: String) {
        Log.i("**newTokenService",FirebaseInstanceId.getInstance().token.toString())   }

}