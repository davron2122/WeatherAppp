package com.example.myapplication.firebase

import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage


class MyFirebaseMessagingService: FirebaseMessagingService(){
    override fun onMessageReceived(message: RemoteMessage) {
        super.onMessageReceived(message)
    }

}
