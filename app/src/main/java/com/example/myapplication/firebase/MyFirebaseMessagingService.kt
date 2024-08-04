package com.example.myapplication.firebase

import android.app.NotificationChannel
import android.app.NotificationManager

import android.media.RingtoneManager

import android.util.Log


import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage
import com.google.gson.Gson


class MyFirebaseMessagingService : FirebaseMessagingService() {

    companion object {
        private const val CHANNEL_ID = "NOTEAPP_NOTIFICIATION"
    }

    override fun onNewToken(token: String) {
        super.onNewToken(token)
        Log.d("New token", token)
    }

    override fun onMessageReceived(message: RemoteMessage) {
        super.onMessageReceived(message)

        message.notification?.let {
            Log.d("FCM title:", it.title ?: "No Title")
            Log.d("FCM body:", it.body ?: "No Body")
        }

        message.data.takeIf { it.isNotEmpty() }?.let { data ->
            val title = data["title"]
            val content = data["body"]

            val sound = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION)

            val name = "MyApplication"
            var description = "Note app"
            val importance = NotificationManager.IMPORTANCE_DEFAULT
            val channel =
                if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
                    NotificationChannel(CHANNEL_ID, name, importance).apply {
                        description = description
                    }.also { channel ->
                        val notificationManager = getSystemService(NotificationManager::class.java)
                        notificationManager.createNotificationChannel(channel)
                    }
                } else null


        }
    }


}
