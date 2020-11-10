package com.example.fivestar.Constant;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

import com.example.fivestar.BlueTooth.BluetoothTestActivity;
import com.example.fivestar.BlueTooth.SerialService;
import com.example.fivestar.BuildConfig;
import com.example.fivestar.Log.Log;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Constant {
    private static ControlEnum controlEnum = ControlEnum.INTERNET;
    private static List<Device> devices = new ArrayList<>();
    private static List<Senario> senarios = new ArrayList<>();
    private static List<IfThen> ifThens = new ArrayList<>();
    private static List<Account> accounts = new ArrayList<>();
    private static List<Log> logs = new ArrayList<>();
    private static List<Group> groups = new ArrayList<>();

    ////////Ino dorostkon
    private static Account mainAccount;

    ///////Ino vel kon
    private static List<Device> groupDeice = new ArrayList<>();
    private static List<Integer> images = new ArrayList<>();
    private static int imageOnIcon;
    private static int imageOffIcon;
    private static boolean on = false;

    //BlueTooth
    static private SerialService serialService = null;


    /**
     * important
     */

    private static void writeFileInPath(Activity activity, String path, String data){
        try {
            File file = new File(activity.getFilesDir(), path);

            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter writer = new FileWriter(file);
            writer.append(data);
            writer.flush();
            writer.close();
        } catch (IOException e) {
        }
    }

    private static String readFileInPath(Activity activity, String path){
        try {
            FileInputStream fileInputStream = activity.openFileInput(path);
            BufferedReader reader = new BufferedReader(new InputStreamReader(fileInputStream));
            StringBuilder sb = new StringBuilder();
            String line = "";
            int a = 0;
            while ((line = reader.readLine()) != null){
                if (a!= 0) sb.append("\n");
                sb.append(line);
                a++;
            }
            return sb.toString();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     *
     */



    public static void sendMessage(String code,Context context) {
        if (controlEnum == ControlEnum.BLUETOOTH) sendBluetooth(code, context);
        else sendInternet(code);
    }

    private static void sendInternet(String code){}

    private static void sendBluetooth(String message,Context context){
        if (serialService == null){
            Toast.makeText(context,"Select Bluetooth Device",Toast.LENGTH_SHORT).show();
            Intent my = new Intent(context, BluetoothTestActivity.class);
            context.startActivity(my);
            return;
        }
        try {
            serialService.write(message.getBytes());
            Toast.makeText(context,"Sent",Toast.LENGTH_SHORT).show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     *
     * @param
     */

////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static void changeAccount(Account oldAccount ,Account newAccount){
        /**
         * Do something
         */
    }

    public static void removeAccount(Account account){
        /**
         * Do something
         */
    }

    public static void addAccount(Account account) {
        /**
         * Do something
         */
    }

    public static List<Account> getAccounts() {
        return accounts;
    }

    public static Account getAccounts(int position) {
        return accounts.get(position);
    }

    public static void setAccounts(List<Account> accounts) {
        Constant.accounts = accounts;
    }

    public static String getPassword(){
        return "";
    }

    public static List<Device> getDevices(){
        return devices;
    }

    public static Device getDevices(int position){
        return devices.get(position);
    }

    public static void changeDevice(Device oldDevice, Device newDevice){
        /**
         * Do something
         */
    }

    public static void addDevice(Device device){
        /**
         * Do something
         */
    }

    public static void setDevices(List<Device> devices) {
        Constant.devices = devices;
    }

    public static List<Senario> getSenarios() {
        return senarios;
    }

    public static Senario getSenarios(int position) {
        return senarios.get(position);
    }

    public static void setSenarios(List<Senario> senarios) {
        Constant.senarios = senarios;
    }

    public static List<IfThen> getIfThens() {
        return ifThens;
    }

    public static void setIfThens(List<IfThen> ifThens) {
        Constant.ifThens = ifThens;
    }

    public static List<Log> getLogs() {
        return logs;
    }

    public static void setLogs(List<Log> logs) {
        Constant.logs = logs;
    }

    public static ControlEnum getControlEnum() {
        return controlEnum;
    }

    public static void setControlEnum(ControlEnum controlEnum) {
        Constant.controlEnum = controlEnum;
    }

    public static void setControlDevice(ControlEnum controlDevice, Context context) {
        Constant.controlEnum = controlDevice;
        Toast.makeText(context,controlDevice.toString() + "-Mode" ,Toast.LENGTH_SHORT).show();
    }

    public static List<Device> getGroupDeice() {
        return groupDeice;
    }

    public static void setGroupDeice(List<Device> groupDeice) {
        Constant.groupDeice = groupDeice;
    }

    public static void addGroupDeice(Device groupDeice) {
        Constant.groupDeice.add(groupDeice);
    }

    public static void removeGroupDeice(Device groupDeice) {
        try {
            Constant.groupDeice.remove(groupDeice);
        } catch (Exception e) {
        }
    }

    public static void removeDevice(Device device) {
        /**
         * Do something
         */
    }

    public static void backup() {
        /**
         * Do something
         */
    }

    public static void restore() {
        /**
         * Do something
         */
    }

    public static void clearLog() {
        /**
         * Do something
         */
    }

    public static void changePassword(String toString) {
        /**
         * Do Something
         */
    }

    public static SerialService getSerialService() {
        return serialService;
    }

    public static void setSerialService(SerialService serialService) {
        Constant.serialService = serialService;
    }

    public static List<Group> getGroups() {
        return groups;
    }

    public static void setGroups(List<Group> groups) {
        Constant.groups = groups;
    }

    public static void addGroup(Group group) {
        groups.add(group);
    }

    public static void clearGroupDevice(){
        groupDeice.clear();
    }

    public static Group getGroup(Integer position) {
        return groups.get(position);
    }

    public static void changeGroup(Group oldGroup, Group newGroup) {
        /**
         * Do something
         */
    }

    public static Account getMainAccount() {
        return mainAccount;
    }

    public static void setMainAccount(Account mainAccount) {
        /**
         * Do something
         */
        Constant.mainAccount = mainAccount;
    }

    /////////////////////////////////////////////////
    // values have to be globally unique
    public static final String INTENT_ACTION_DISCONNECT = BuildConfig.APPLICATION_ID + ".Disconnect";
    public static final String NOTIFICATION_CHANNEL = BuildConfig.APPLICATION_ID + ".Channel";
    public static final String INTENT_CLASS_MAIN_ACTIVITY = BuildConfig.APPLICATION_ID + ".MainActivity";

    // values have to be unique within each app
    public static final int NOTIFY_MANAGER_START_FOREGROUND_SERVICE = 1001;

    /**
     * check is device on ot not from Mqtt Broker
     * @param device
     * @return
     */
    public static boolean isDeviceOn(Device device) {
        /**
         * Do something
         */
        return false;
    }

    public static void addLog(String s) {
        /**
         * Do something
         */
    }

    public static List<Integer> getImages() {
        /**
         * Do something
         */
        return images;
    }

    public static void setImages(List<Integer> images) {
        Constant.images = images;
    }

    public static void addImage(int image){
        images.add(image);
    }

    public static int getImageOnIcon() {
        return imageOnIcon;
    }

    public static void setImageOnIcon(int imageOnIcon) {
        Constant.imageOnIcon = imageOnIcon;
    }

    public static int getImageOffIcon() {
        return imageOffIcon;
    }

    public static void setImageOffIcon(int imageOffIcon) {
        Constant.imageOffIcon = imageOffIcon;
    }

    public static Boolean isOn() {
        return on;
    }

    public static void setOn(boolean onn){
        on = onn;
    }
}
