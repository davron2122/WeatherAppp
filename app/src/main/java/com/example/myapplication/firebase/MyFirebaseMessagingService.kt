package com.example.myapplication.firebase

import android.media.RingtoneManager
import android.net.Uri
import android.util.Log
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage


class MyFirebaseMessagingService : FirebaseMessagingService() {

    companion object {
        private const val CHANNEL_ID = "WEATHERAPP_NOTIFICATION"
    }

    override fun onNewToken(token: String) {
        super.onNewToken(token)
        Log.d("New token", token)

    }

    override fun onMessageReceived(message: RemoteMessage) {
        super.onMessageReceived(message)

        message.notification?.let {
            Log.d("FCM title:", it.title ?: "No title")
            Log.d("FCM body:", it.body ?: "No body")
        }

        message.data.let { data ->
            val title = data["title"]
            val content = data["body"]
            val sound: Uri = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION)


        }
    }
}

