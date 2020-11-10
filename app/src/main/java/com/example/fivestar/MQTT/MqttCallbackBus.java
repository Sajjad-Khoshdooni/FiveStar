package com.example.fivestar.MQTT;

import com.example.fivestar.Constant.Constant;

import org.eclipse.paho.client.mqttv3.IMqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.MqttCallback;
import org.eclipse.paho.client.mqttv3.MqttMessage;


import java.util.logging.Logger;

public class MqttCallbackBus implements MqttCallback {

    @Override
    public void connectionLost(Throwable cause) {
        /**
         * Do something
         */
        Constant.addLog("");
    }

    @Override
    public void messageArrived(String topic, MqttMessage message) {
        /**
         * Do something
         */
    }

    @Override
    public void deliveryComplete(IMqttDeliveryToken token) {

    }

}