package com.example.libraryappitpaydar;
import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

import pub.devrel.easypermissions.AfterPermissionGranted;
import pub.devrel.easypermissions.AppSettingsDialog;
import pub.devrel.easypermissions.EasyPermissions;


public  class Utils  extends AppCompatActivity  implements EasyPermissions.PermissionCallbacks {

    @AfterPermissionGranted(123)
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    public  void WRITE_CALENDAR_permission(Context context){
        String[] perms = {Manifest.permission.WRITE_CALENDAR};
        if (EasyPermissions.hasPermissions(context, perms)) {
            return;
        }
        EasyPermissions.requestPermissions((android.app.Activity) context, "نیاز به اجازه دارد", 123, perms);

    }
    public  void READ_CALENDAR_permission(Context context){
        String[] perms = {Manifest.permission.READ_CALENDAR};
        if (EasyPermissions.hasPermissions(context, perms)) {
            return;
        }
        EasyPermissions.requestPermissions((android.app.Activity) context, "نیاز به اجازه دارد", 123, perms);

    }

    public  void WRITE_CONTACTS_permission(Context context){
        String[] perms = {Manifest.permission.WRITE_CONTACTS};
        if (EasyPermissions.hasPermissions(context, perms)) {
            return;
        }
        EasyPermissions.requestPermissions((android.app.Activity) context, "نیاز به اجازه دارد", 123, perms);

    }
    public  void READ_CONTACTS_permission(Context context){
        String[] perms = {Manifest.permission.READ_CONTACTS};
        if (EasyPermissions.hasPermissions(context, perms)) {
            return;
        }
        EasyPermissions.requestPermissions((android.app.Activity) context, "نیاز به اجازه دارد", 123, perms);

    }
    public  void ANSWER_PHONE_CALLS_permission(Context context){
        String[] perms = {Manifest.permission.ANSWER_PHONE_CALLS};
        if (EasyPermissions.hasPermissions(context, perms)) {
            return;
        }
        EasyPermissions.requestPermissions((android.app.Activity) context, "نیاز به اجازه دارد", 123, perms);

    }
    public  void READ_PHONE_STATE_permission(Context context){
        String[] perms = {Manifest.permission.READ_PHONE_STATE};
        if (EasyPermissions.hasPermissions(context, perms)) {
            return;
        }
        EasyPermissions.requestPermissions((android.app.Activity) context, "نیاز به اجازه دارد", 123, perms);

    }
    public  void READ_PHONE_NUMBERS_permission(Context context){
        String[] perms = {Manifest.permission.READ_PHONE_NUMBERS};
        if (EasyPermissions.hasPermissions(context, perms)) {
            return;
        }
        EasyPermissions.requestPermissions((android.app.Activity) context, "نیاز به اجازه دارد", 123, perms);

    }
    public  void CALL_PHONE_permission(Context context){
        String[] perms = {Manifest.permission.CALL_PHONE};
        if (EasyPermissions.hasPermissions(context, perms)) {
            return;
        }
        EasyPermissions.requestPermissions((android.app.Activity) context, "نیاز به اجازه دارد", 123, perms);

    }
    public  void MODIFY_PHONE_STATE_permission(Context context){
        String[] perms = {Manifest.permission.MODIFY_PHONE_STATE};
        if (EasyPermissions.hasPermissions(context, perms)) {
            return;
        }
        EasyPermissions.requestPermissions((android.app.Activity) context, "نیاز به اجازه دارد", 123, perms);

    }
    public  void ACCESS_LOCATION_EXTRA_COMMANDS_permission(Context context){
        String[] perms = {Manifest.permission.ACCESS_LOCATION_EXTRA_COMMANDS};
        if (EasyPermissions.hasPermissions(context, perms)) {
            return;
        }
        EasyPermissions.requestPermissions((android.app.Activity) context, "نیاز به اجازه دارد", 123, perms);

    }
    public  void LOCATION_HARDWARE_permission(Context context){
        String[] perms = {Manifest.permission.LOCATION_HARDWARE};
        if (EasyPermissions.hasPermissions(context, perms)) {
            return;
        }
        EasyPermissions.requestPermissions((android.app.Activity) context, "نیاز به اجازه دارد", 123, perms);

    }
    public  void ACCESS_BACKGROUND_LOCATION_permission(Context context){
        String[] perms = {Manifest.permission.ACCESS_BACKGROUND_LOCATION};
        if (EasyPermissions.hasPermissions(context, perms)) {
            return;
        }
        EasyPermissions.requestPermissions((android.app.Activity) context, "نیاز به اجازه دارد", 123, perms);

    }
    public  void ACCESS_COARSE_LOCATION_permission(Context context){
        String[] perms = {Manifest.permission.ACCESS_COARSE_LOCATION};
        if (EasyPermissions.hasPermissions(context, perms)) {
            return;
        }
        EasyPermissions.requestPermissions((android.app.Activity) context, "نیاز به اجازه دارد", 123, perms);

    }
    public  void ACCESS_FINE_LOCATION_permission(Context context){
        String[] perms = {Manifest.permission.ACCESS_FINE_LOCATION};
        if (EasyPermissions.hasPermissions(context, perms)) {
            return;
        }
        EasyPermissions.requestPermissions((android.app.Activity) context, "نیاز به اجازه دارد", 123, perms);

    }
    public  void ACCESS_MEDIA_LOCATION_permission(Context context){
        String[] perms = {Manifest.permission.ACCESS_MEDIA_LOCATION};
        if (EasyPermissions.hasPermissions(context, perms)) {
            return;
        }
        EasyPermissions.requestPermissions((android.app.Activity) context, "نیاز به اجازه دارد", 123, perms);

    }
    public  void CONTROL_LOCATION_UPDATES_permission(Context context){
        String[] perms = {Manifest.permission.CONTROL_LOCATION_UPDATES};
        if (EasyPermissions.hasPermissions(context, perms)) {
            return;
        }
        EasyPermissions.requestPermissions((android.app.Activity) context, "نیاز به اجازه دارد", 123, perms);

    }
    public  void INSTALL_LOCATION_PROVIDER_permission(Context context){
        String[] perms = {Manifest.permission.INSTALL_LOCATION_PROVIDER};
        if (EasyPermissions.hasPermissions(context, perms)) {
            return;
        }
        EasyPermissions.requestPermissions((android.app.Activity) context, "نیاز به اجازه دارد", 123, perms);

    }
    public void SEND_SMS_permission(Context context){
        String[] perms = {Manifest.permission.SEND_SMS};
        if (EasyPermissions.hasPermissions(context, perms)) {
            return;
        }
        EasyPermissions.requestPermissions((android.app.Activity) context, "نیاز به اجازه دارد", 123, perms);
    }
    public void SMS_FINANCIAL_TRANSACTIONS_permission(Context context){
        String[] perms = {Manifest.permission.SMS_FINANCIAL_TRANSACTIONS};
        if (EasyPermissions.hasPermissions(context, perms)) {
            return;
        }
        EasyPermissions.requestPermissions((android.app.Activity) context, "نیاز به اجازه دارد", 123, perms);
    }
    public void BROADCAST_SMS_permission(Context context){
        String[] perms = {Manifest.permission.BROADCAST_SMS};
        if (EasyPermissions.hasPermissions(context, perms)) {
            return;
        }
        EasyPermissions.requestPermissions((android.app.Activity) context, "نیاز به اجازه دارد", 123, perms);
    }
    public void READ_SMS_permission(Context context){
        String[] perms = {Manifest.permission.READ_SMS};
        if (EasyPermissions.hasPermissions(context, perms)) {
            return;
        }
        EasyPermissions.requestPermissions((android.app.Activity) context, "نیاز به اجازه دارد", 123, perms);
    }
    public void RECEIVE_SMS_permission(Context context){
        String[] perms = {Manifest.permission.RECEIVE_SMS};
        if (EasyPermissions.hasPermissions(context, perms)) {
            return;
        }
        EasyPermissions.requestPermissions((android.app.Activity) context, "نیاز به اجازه دارد", 123, perms);
    }

    public void READ_EXTERNAL_STORAGE_permission(Context context){
        String[] perms = {Manifest.permission.READ_EXTERNAL_STORAGE};
        if (EasyPermissions.hasPermissions(context, perms)) {
            return;
        }
        EasyPermissions.requestPermissions((android.app.Activity) context, "نیاز به اجازه دارد", 123, perms);
    }
    public void WRITE_EXTERNAL_STORAGE_permission(Context context){
        String[] perms = {Manifest.permission.WRITE_EXTERNAL_STORAGE};
        if (EasyPermissions.hasPermissions(context, perms)) {
            return;
        }
        EasyPermissions.requestPermissions((android.app.Activity) context, "نیاز به اجازه دارد", 123, perms);
    }


    public void CAMERA_permission(Context context){
            String[] perms = {Manifest.permission.CAMERA};
            if (EasyPermissions.hasPermissions(context, perms)) {
                return;
            }
                EasyPermissions.requestPermissions((android.app.Activity) context, "نیاز به اجازه دارد", 123, perms);

    }
    public void ACCESS_NETWORK_STATE_permission(Context context){
        String[] perms = {Manifest.permission.ACCESS_NETWORK_STATE};
        if (EasyPermissions.hasPermissions(context, perms)) {
            return;
        }
        EasyPermissions.requestPermissions((android.app.Activity) context, "نیاز به اجازه دارد", 123, perms);
    }
    public void CHANGE_NETWORK_STATE_permission(Context context){
        String[] perms = {Manifest.permission.CHANGE_NETWORK_STATE};
        if (EasyPermissions.hasPermissions(context, perms)) {
            return;
        }
        EasyPermissions.requestPermissions((android.app.Activity) context, "نیاز به اجازه دارد", 123, perms);
    }
    public void INTERNET_permission(Context context){
            String[] perms = {Manifest.permission.INTERNET};
        if (EasyPermissions.hasPermissions(context, perms)) {
            return;
        }
        EasyPermissions.requestPermissions((android.app.Activity) context, "نیاز به اجازه دارد", 123, perms);
    }
    public void INSTANT_APP_FOREGROUND_SERVICE_permission(Context context){
            String[] perms = {Manifest.permission.INSTANT_APP_FOREGROUND_SERVICE};
        if (EasyPermissions.hasPermissions(context, perms)) {
            return;
        }
        EasyPermissions.requestPermissions((android.app.Activity) context, "نیاز به اجازه دارد", 123, perms);
    }
    public void ADD_VOICEMAIL_permission(Context context){
            String[] perms = {Manifest.permission.ADD_VOICEMAIL};
        if (EasyPermissions.hasPermissions(context, perms)) {
            return;
        }
        EasyPermissions.requestPermissions((android.app.Activity) context, "نیاز به اجازه دارد", 123, perms);
    }
    public void BIND_VISUAL_VOICEMAIL_SERVICE_permission(Context context){
            String[] perms = {Manifest.permission.BIND_VISUAL_VOICEMAIL_SERVICE};
        if (EasyPermissions.hasPermissions(context, perms)) {
            return;
        }
        EasyPermissions.requestPermissions((android.app.Activity) context, "نیاز به اجازه دارد", 123, perms);
    }
    public void BIND_VOICE_INTERACTION_permission(Context context){
            String[] perms = {Manifest.permission.BIND_VOICE_INTERACTION};
        if (EasyPermissions.hasPermissions(context, perms)) {
            return;
        }
        EasyPermissions.requestPermissions((android.app.Activity) context, "نیاز به اجازه دارد", 123, perms);
    }
    public void READ_VOICEMAIL_permission(Context context){
            String[] perms = {Manifest.permission.READ_VOICEMAIL};
        if (EasyPermissions.hasPermissions(context, perms)) {
            return;
        }
        EasyPermissions.requestPermissions((android.app.Activity) context, "نیاز به اجازه دارد", 123, perms);
    }
    public void WRITE_VOICEMAIL_permission(Context context){
            String[] perms = {Manifest.permission.WRITE_VOICEMAIL};
        if (EasyPermissions.hasPermissions(context, perms)) {
            return;
        }
        EasyPermissions.requestPermissions((android.app.Activity) context, "نیاز به اجازه دارد", 123, perms);
    }
    public void ACCEPT_HANDOVER_permission(Context context){
            String[] perms = {Manifest.permission.ACCEPT_HANDOVER};
        if (EasyPermissions.hasPermissions(context, perms)) {
            return;
        }
        EasyPermissions.requestPermissions((android.app.Activity) context, "نیاز به اجازه دارد", 123, perms);
    }
    public void ACCESS_CHECKIN_PROPERTIES_permission(Context context){
            String[] perms = {Manifest.permission.ACCESS_CHECKIN_PROPERTIES};
        if (EasyPermissions.hasPermissions(context, perms)) {
            return;
        }
        EasyPermissions.requestPermissions((android.app.Activity) context, "نیاز به اجازه دارد", 123, perms);
    }
    public void ACCESS_NOTIFICATION_POLICY_permission(Context context){
            String[] perms = {Manifest.permission.ACCESS_NOTIFICATION_POLICY};
        if (EasyPermissions.hasPermissions(context, perms)) {
            return;
        }
        EasyPermissions.requestPermissions((android.app.Activity) context, "نیاز به اجازه دارد", 123, perms);
    }
    public void ACCESS_WIFI_STATE_permission(Context context){
            String[] perms = {Manifest.permission.ACCESS_WIFI_STATE};
        if (EasyPermissions.hasPermissions(context, perms)) {
            return;
        }
        EasyPermissions.requestPermissions((android.app.Activity) context, "نیاز به اجازه دارد", 123, perms);
    }
     public void ACCOUNT_MANAGER_permission(Context context){
            String[] perms = {Manifest.permission.ACCOUNT_MANAGER};
        if (EasyPermissions.hasPermissions(context, perms)) {
            return;
        }
        EasyPermissions.requestPermissions((android.app.Activity) context, "نیاز به اجازه دارد", 123, perms);
    }
     public void ACTIVITY_RECOGNITION_permission(Context context){
            String[] perms = {Manifest.permission.ACTIVITY_RECOGNITION};
        if (EasyPermissions.hasPermissions(context, perms)) {
            return;
        }
        EasyPermissions.requestPermissions((android.app.Activity) context, "نیاز به اجازه دارد", 123, perms);
    }
    public void BATTERY_STATS_permission(Context context){
            String[] perms = {Manifest.permission.BATTERY_STATS};
        if (EasyPermissions.hasPermissions(context, perms)) {
            return;
        }
        EasyPermissions.requestPermissions((android.app.Activity) context, "نیاز به اجازه دارد", 123, perms);
    }
    public void BIND_ACCESSIBILITY_SERVICE_permission(Context context){
            String[] perms = {Manifest.permission.BIND_ACCESSIBILITY_SERVICE};
        if (EasyPermissions.hasPermissions(context, perms)) {
            return;
        }
        EasyPermissions.requestPermissions((android.app.Activity) context, "نیاز به اجازه دارد", 123, perms);
    }
      public void BIND_APPWIDGET_permission(Context context){
            String[] perms = {Manifest.permission.BIND_APPWIDGET};
        if (EasyPermissions.hasPermissions(context, perms)) {
            return;
        }
        EasyPermissions.requestPermissions((android.app.Activity) context, "نیاز به اجازه دارد", 123, perms);
    }
    public void BIND_AUTOFILL_SERVICE_permission(Context context){
            String[] perms = {Manifest.permission.BIND_AUTOFILL_SERVICE};
        if (EasyPermissions.hasPermissions(context, perms)) {
            return;
        }
        EasyPermissions.requestPermissions((android.app.Activity) context, "نیاز به اجازه دارد", 123, perms);
    }
    public void BIND_CALL_REDIRECTION_SERVICE_permission(Context context){
            String[] perms = {Manifest.permission.BIND_CALL_REDIRECTION_SERVICE};
        if (EasyPermissions.hasPermissions(context, perms)) {
            return;
        }
        EasyPermissions.requestPermissions((android.app.Activity) context, "نیاز به اجازه دارد", 123, perms);
    }
    public void BIND_CARRIER_MESSAGING_CLIENT_SERVICE_permission(Context context){
            String[] perms = {Manifest.permission.BIND_CARRIER_MESSAGING_CLIENT_SERVICE};
        if (EasyPermissions.hasPermissions(context, perms)) {
            return;
        }
        EasyPermissions.requestPermissions((android.app.Activity) context, "نیاز به اجازه دارد", 123, perms);
    }
    public void BIND_CARRIER_SERVICES_permission(Context context){
            String[] perms = {Manifest.permission.BIND_CARRIER_SERVICES};
        if (EasyPermissions.hasPermissions(context, perms)) {
            return;
        }
        EasyPermissions.requestPermissions((android.app.Activity) context, "نیاز به اجازه دارد", 123, perms);
    }
      public void BIND_CHOOSER_TARGET_SERVICE_permission(Context context){
            String[] perms = {Manifest.permission.BIND_CHOOSER_TARGET_SERVICE};
        if (EasyPermissions.hasPermissions(context, perms)) {
            return;
        }
        EasyPermissions.requestPermissions((android.app.Activity) context, "نیاز به اجازه دارد", 123, perms);
    }
    public void BIND_CONDITION_PROVIDER_SERVICE_permission(Context context){
            String[] perms = {Manifest.permission.BIND_CONDITION_PROVIDER_SERVICE};
        if (EasyPermissions.hasPermissions(context, perms)) {
            return;
        }
        EasyPermissions.requestPermissions((android.app.Activity) context, "نیاز به اجازه دارد", 123, perms);
    }
    public void BIND_DEVICE_ADMIN_permission(Context context){
            String[] perms = {Manifest.permission.BIND_DEVICE_ADMIN};
        if (EasyPermissions.hasPermissions(context, perms)) {
            return;
        }
        EasyPermissions.requestPermissions((android.app.Activity) context, "نیاز به اجازه دارد", 123, perms);
    }
    public void BIND_DREAM_SERVICE_permission(Context context){
            String[] perms = {Manifest.permission.BIND_DREAM_SERVICE};
        if (EasyPermissions.hasPermissions(context, perms)) {
            return;
        }
        EasyPermissions.requestPermissions((android.app.Activity) context, "نیاز به اجازه دارد", 123, perms);
    }
    public void BIND_INCALL_SERVICE_permission(Context context){
            String[] perms = {Manifest.permission.BIND_INCALL_SERVICE};
        if (EasyPermissions.hasPermissions(context, perms)) {
            return;
        }
        EasyPermissions.requestPermissions((android.app.Activity) context, "نیاز به اجازه دارد", 123, perms);
    }
    public void BIND_INPUT_METHOD_permission(Context context){
            String[] perms = {Manifest.permission.BIND_INPUT_METHOD};
        if (EasyPermissions.hasPermissions(context, perms)) {
            return;
        }
        EasyPermissions.requestPermissions((android.app.Activity) context, "نیاز به اجازه دارد", 123, perms);
    }
    public void BIND_MIDI_DEVICE_SERVICE_permission(Context context){
            String[] perms = {Manifest.permission.BIND_MIDI_DEVICE_SERVICE};
        if (EasyPermissions.hasPermissions(context, perms)) {
            return;
        }
        EasyPermissions.requestPermissions((android.app.Activity) context, "نیاز به اجازه دارد", 123, perms);
    }
    public void BIND_NFC_SERVICE_permission(Context context){
            String[] perms = {Manifest.permission.BIND_NFC_SERVICE};
        if (EasyPermissions.hasPermissions(context, perms)) {
            return;
        }
        EasyPermissions.requestPermissions((android.app.Activity) context, "نیاز به اجازه دارد", 123, perms);
    }
    public void BIND_NOTIFICATION_LISTENER_SERVICE_permission(Context context){
            String[] perms = {Manifest.permission.BIND_NOTIFICATION_LISTENER_SERVICE};
        if (EasyPermissions.hasPermissions(context, perms)) {
            return;
        }
        EasyPermissions.requestPermissions((android.app.Activity) context, "نیاز به اجازه دارد", 123, perms);
    }
    public void BIND_PRINT_SERVICE_permission(Context context){
            String[] perms = {Manifest.permission.BIND_PRINT_SERVICE};
        if (EasyPermissions.hasPermissions(context, perms)) {
            return;
        }
        EasyPermissions.requestPermissions((android.app.Activity) context, "نیاز به اجازه دارد", 123, perms);
    }
    public void BIND_QUICK_SETTINGS_TILE_permission(Context context){
            String[] perms = {Manifest.permission.BIND_QUICK_SETTINGS_TILE};
        if (EasyPermissions.hasPermissions(context, perms)) {
            return;
        }
        EasyPermissions.requestPermissions((android.app.Activity) context, "نیاز به اجازه دارد", 123, perms);
    }
    public void BIND_REMOTEVIEWS_permission(Context context){
            String[] perms = {Manifest.permission.BIND_REMOTEVIEWS};
        if (EasyPermissions.hasPermissions(context, perms)) {
            return;
        }
        EasyPermissions.requestPermissions((android.app.Activity) context, "نیاز به اجازه دارد", 123, perms);
    }
     public void BIND_SCREENING_SERVICE_permission(Context context){
            String[] perms = {Manifest.permission.BIND_SCREENING_SERVICE};
        if (EasyPermissions.hasPermissions(context, perms)) {
            return;
        }
        EasyPermissions.requestPermissions((android.app.Activity) context, "نیاز به اجازه دارد", 123, perms);
    }
       public void BIND_TELECOM_CONNECTION_SERVICE_permission(Context context){
            String[] perms = {Manifest.permission.BIND_TELECOM_CONNECTION_SERVICE};
        if (EasyPermissions.hasPermissions(context, perms)) {
            return;
        }
        EasyPermissions.requestPermissions((android.app.Activity) context, "نیاز به اجازه دارد", 123, perms);
    }
       public void BIND_TEXT_SERVICE_permission(Context context){
            String[] perms = {Manifest.permission.BIND_TEXT_SERVICE};
        if (EasyPermissions.hasPermissions(context, perms)) {
            return;
        }
        EasyPermissions.requestPermissions((android.app.Activity) context, "نیاز به اجازه دارد", 123, perms);
    }
    public void BIND_TV_INPUT_permission(Context context){
            String[] perms = {Manifest.permission.BIND_TV_INPUT};
        if (EasyPermissions.hasPermissions(context, perms)) {
            return;
        }
        EasyPermissions.requestPermissions((android.app.Activity) context, "نیاز به اجازه دارد", 123, perms);
    }
    public void BIND_VPN_SERVICE_permission(Context context){
            String[] perms = {Manifest.permission.BIND_VPN_SERVICE};
        if (EasyPermissions.hasPermissions(context, perms)) {
            return;
        }
        EasyPermissions.requestPermissions((android.app.Activity) context, "نیاز به اجازه دارد", 123, perms);
    }
    public void BIND_VR_LISTENER_SERVICE_permission(Context context){
            String[] perms = {Manifest.permission.BIND_VR_LISTENER_SERVICE};
        if (EasyPermissions.hasPermissions(context, perms)) {
            return;
        }
        EasyPermissions.requestPermissions((android.app.Activity) context, "نیاز به اجازه دارد", 123, perms);
    }
    public void BIND_WALLPAPER_permission(Context context){
            String[] perms = {Manifest.permission.BIND_WALLPAPER};
        if (EasyPermissions.hasPermissions(context, perms)) {
            return;
        }
        EasyPermissions.requestPermissions((android.app.Activity) context, "نیاز به اجازه دارد", 123, perms);
    }
    public void BLUETOOTH_permission(Context context){
            String[] perms = {Manifest.permission.BLUETOOTH};
        if (EasyPermissions.hasPermissions(context, perms)) {
            return;
        }
        EasyPermissions.requestPermissions((android.app.Activity) context, "نیاز به اجازه دارد", 123, perms);
    }
    public void BLUETOOTH_ADMIN_permission(Context context){
            String[] perms = {Manifest.permission.BLUETOOTH_ADMIN};
        if (EasyPermissions.hasPermissions(context, perms)) {
            return;
        }
        EasyPermissions.requestPermissions((android.app.Activity) context, "نیاز به اجازه دارد", 123, perms);
    }
    public void BLUETOOTH_PRIVILEGED_permission(Context context){
            String[] perms = {Manifest.permission.BLUETOOTH_PRIVILEGED};
        if (EasyPermissions.hasPermissions(context, perms)) {
            return;
        }
        EasyPermissions.requestPermissions((android.app.Activity) context, "نیاز به اجازه دارد", 123, perms);
    }
    public void BODY_SENSORS_permission(Context context){
            String[] perms = {Manifest.permission.BODY_SENSORS};
        if (EasyPermissions.hasPermissions(context, perms)) {
            return;
        }
        EasyPermissions.requestPermissions((android.app.Activity) context, "نیاز به اجازه دارد", 123, perms);
    }
    public void BROADCAST_PACKAGE_REMOVED_permission(Context context){
            String[] perms = {Manifest.permission.BROADCAST_PACKAGE_REMOVED};
        if (EasyPermissions.hasPermissions(context, perms)) {
            return;
        }
        EasyPermissions.requestPermissions((android.app.Activity) context, "نیاز به اجازه دارد", 123, perms);
    }
    public void BROADCAST_STICKY_permission(Context context){
            String[] perms = {Manifest.permission.BROADCAST_STICKY};
        if (EasyPermissions.hasPermissions(context, perms)) {
            return;
        }
        EasyPermissions.requestPermissions((android.app.Activity) context, "نیاز به اجازه دارد", 123, perms);
    }
    public void BROADCAST_WAP_PUSH_permission(Context context){
            String[] perms = {Manifest.permission.BROADCAST_WAP_PUSH};
        if (EasyPermissions.hasPermissions(context, perms)) {
            return;
        }
        EasyPermissions.requestPermissions((android.app.Activity) context, "نیاز به اجازه دارد", 123, perms);
    }
    public void CALL_COMPANION_APP_permission(Context context){
            String[] perms = {Manifest.permission.CALL_COMPANION_APP};
        if (EasyPermissions.hasPermissions(context, perms)) {
            return;
        }
        EasyPermissions.requestPermissions((android.app.Activity) context, "نیاز به اجازه دارد", 123, perms);
    }
    public void CALL_PRIVILEGED_permission(Context context){
            String[] perms = {Manifest.permission.CALL_PRIVILEGED};
        if (EasyPermissions.hasPermissions(context, perms)) {
            return;
        }
        EasyPermissions.requestPermissions((android.app.Activity) context, "نیاز به اجازه دارد", 123, perms);
    }
    public void CAPTURE_AUDIO_OUTPUT_permission(Context context){
            String[] perms = {Manifest.permission.CAPTURE_AUDIO_OUTPUT};
        if (EasyPermissions.hasPermissions(context, perms)) {
            return;
        }
        EasyPermissions.requestPermissions((android.app.Activity) context, "نیاز به اجازه دارد", 123, perms);
    }
    public void CHANGE_COMPONENT_ENABLED_STATE_permission(Context context){
            String[] perms = {Manifest.permission.CHANGE_COMPONENT_ENABLED_STATE};
        if (EasyPermissions.hasPermissions(context, perms)) {
            return;
        }
        EasyPermissions.requestPermissions((android.app.Activity) context, "نیاز به اجازه دارد", 123, perms);
    }
    public void CHANGE_CONFIGURATION_permission(Context context){
            String[] perms = {Manifest.permission.CHANGE_CONFIGURATION};
        if (EasyPermissions.hasPermissions(context, perms)) {
            return;
        }
        EasyPermissions.requestPermissions((android.app.Activity) context, "نیاز به اجازه دارد", 123, perms);
    }
    public void CHANGE_WIFI_STATE_permission(Context context){
            String[] perms = {Manifest.permission.CHANGE_WIFI_STATE};
        if (EasyPermissions.hasPermissions(context, perms)) {
            return;
        }
        EasyPermissions.requestPermissions((android.app.Activity) context, "نیاز به اجازه دارد", 123, perms);
    }
    public void CLEAR_APP_CACHE_permission(Context context){
            String[] perms = {Manifest.permission.CLEAR_APP_CACHE};
        if (EasyPermissions.hasPermissions(context, perms)) {
            return;
        }
        EasyPermissions.requestPermissions((android.app.Activity) context, "نیاز به اجازه دارد", 123, perms);
    }
    public void DELETE_CACHE_FILES_permission(Context context){
            String[] perms = {Manifest.permission.DELETE_CACHE_FILES};
        if (EasyPermissions.hasPermissions(context, perms)) {
            return;
        }
        EasyPermissions.requestPermissions((android.app.Activity) context, "نیاز به اجازه دارد", 123, perms);
    }
    public void DELETE_PACKAGES_permission(Context context){
            String[] perms = {Manifest.permission.DELETE_PACKAGES};
        if (EasyPermissions.hasPermissions(context, perms)) {
            return;
        }
        EasyPermissions.requestPermissions((android.app.Activity) context, "نیاز به اجازه دارد", 123, perms);
    }
    public void DIAGNOSTIC_permission(Context context){
            String[] perms = {Manifest.permission.DIAGNOSTIC};
        if (EasyPermissions.hasPermissions(context, perms)) {
            return;
        }
        EasyPermissions.requestPermissions((android.app.Activity) context, "نیاز به اجازه دارد", 123, perms);
    }
    public void DISABLE_KEYGUARD_permission(Context context){
            String[] perms = {Manifest.permission.DISABLE_KEYGUARD};
        if (EasyPermissions.hasPermissions(context, perms)) {
            return;
        }
        EasyPermissions.requestPermissions((android.app.Activity) context, "نیاز به اجازه دارد", 123, perms);
    }
    public void DUMP_permission(Context context){
            String[] perms = {Manifest.permission.DUMP};
        if (EasyPermissions.hasPermissions(context, perms)) {
            return;
        }
        EasyPermissions.requestPermissions((android.app.Activity) context, "نیاز به اجازه دارد", 123, perms);
    }
    public void EXPAND_STATUS_BAR_permission(Context context){
            String[] perms = {Manifest.permission.EXPAND_STATUS_BAR};
        if (EasyPermissions.hasPermissions(context, perms)) {
            return;
        }
        EasyPermissions.requestPermissions((android.app.Activity) context, "نیاز به اجازه دارد", 123, perms);
    }
    public void FACTORY_TEST_permission(Context context){
            String[] perms = {Manifest.permission.FACTORY_TEST};
        if (EasyPermissions.hasPermissions(context, perms)) {
            return;
        }
        EasyPermissions.requestPermissions((android.app.Activity) context, "نیاز به اجازه دارد", 123, perms);
    }
      public void FOREGROUND_SERVICE_permission(Context context){
            String[] perms = {Manifest.permission.FOREGROUND_SERVICE};
        if (EasyPermissions.hasPermissions(context, perms)) {
            return;
        }
        EasyPermissions.requestPermissions((android.app.Activity) context, "نیاز به اجازه دارد", 123, perms);
    }
      public void GET_ACCOUNTS_permission(Context context){
            String[] perms = {Manifest.permission.GET_ACCOUNTS};
        if (EasyPermissions.hasPermissions(context, perms)) {
            return;
        }
        EasyPermissions.requestPermissions((android.app.Activity) context, "نیاز به اجازه دارد", 123, perms);
    }
      public void GET_ACCOUNTS_PRIVILEGED_permission(Context context){
            String[] perms = {Manifest.permission.GET_ACCOUNTS_PRIVILEGED};
        if (EasyPermissions.hasPermissions(context, perms)) {
            return;
        }
        EasyPermissions.requestPermissions((android.app.Activity) context, "نیاز به اجازه دارد", 123, perms);
    }
    public void GET_PACKAGE_SIZE_permission(Context context){
            String[] perms = {Manifest.permission.GET_PACKAGE_SIZE};
        if (EasyPermissions.hasPermissions(context, perms)) {
            return;
        }
        EasyPermissions.requestPermissions((android.app.Activity) context, "نیاز به اجازه دارد", 123, perms);
    }
    public void GLOBAL_SEARCH_permission(Context context){
            String[] perms = {Manifest.permission.GLOBAL_SEARCH};
        if (EasyPermissions.hasPermissions(context, perms)) {
            return;
        }
        EasyPermissions.requestPermissions((android.app.Activity) context, "نیاز به اجازه دارد", 123, perms);
    }
    public void INSTALL_PACKAGES_permission(Context context){
            String[] perms = {Manifest.permission.INSTALL_PACKAGES};
        if (EasyPermissions.hasPermissions(context, perms)) {
            return;
        }
        EasyPermissions.requestPermissions((android.app.Activity) context, "نیاز به اجازه دارد", 123, perms);
    }
    public void INSTALL_SHORTCUT_permission(Context context){
            String[] perms = {Manifest.permission.INSTALL_SHORTCUT};
        if (EasyPermissions.hasPermissions(context, perms)) {
            return;
        }
        EasyPermissions.requestPermissions((android.app.Activity) context, "نیاز به اجازه دارد", 123, perms);
    }
    public void KILL_BACKGROUND_PROCESSES_permission(Context context){
            String[] perms = {Manifest.permission.KILL_BACKGROUND_PROCESSES};
        if (EasyPermissions.hasPermissions(context, perms)) {
            return;
        }
        EasyPermissions.requestPermissions((android.app.Activity) context, "نیاز به اجازه دارد", 123, perms);
    }
    public void MANAGE_DOCUMENTS_permission(Context context){
            String[] perms = {Manifest.permission.MANAGE_DOCUMENTS};
        if (EasyPermissions.hasPermissions(context, perms)) {
            return;
        }
        EasyPermissions.requestPermissions((android.app.Activity) context, "نیاز به اجازه دارد", 123, perms);
    }
    public void MANAGE_OWN_CALLS_permission(Context context){
            String[] perms = {Manifest.permission.MANAGE_OWN_CALLS};
        if (EasyPermissions.hasPermissions(context, perms)) {
            return;
        }
        EasyPermissions.requestPermissions((android.app.Activity) context, "نیاز به اجازه دارد", 123, perms);
    }
    public void MASTER_CLEAR_permission(Context context){
        String[] perms = {Manifest.permission.MASTER_CLEAR};
        if (EasyPermissions.hasPermissions(context, perms)) {
            return;
        }
        EasyPermissions.requestPermissions((android.app.Activity) context, "نیاز به اجازه دارد", 123, perms);
    }
    public void MEDIA_CONTENT_CONTROL_permission(Context context){
        String[] perms = {Manifest.permission.MEDIA_CONTENT_CONTROL};
        if (EasyPermissions.hasPermissions(context, perms)) {
            return;
        }
        EasyPermissions.requestPermissions((android.app.Activity) context, "نیاز به اجازه دارد", 123, perms);
    }
    public void MODIFY_AUDIO_SETTINGS_permission(Context context){
        String[] perms = {Manifest.permission.MODIFY_AUDIO_SETTINGS};
        if (EasyPermissions.hasPermissions(context, perms)) {
            return;
        }
        EasyPermissions.requestPermissions((android.app.Activity) context, "نیاز به اجازه دارد", 123, perms);
    }
    public void MOUNT_FORMAT_FILESYSTEMS_permission(Context context){
        String[] perms = {Manifest.permission.MOUNT_FORMAT_FILESYSTEMS};
        if (EasyPermissions.hasPermissions(context, perms)) {
            return;
        }
        EasyPermissions.requestPermissions((android.app.Activity) context, "نیاز به اجازه دارد", 123, perms);
    }
    public void MOUNT_UNMOUNT_FILESYSTEMS_permission(Context context){
        String[] perms = {Manifest.permission.MOUNT_UNMOUNT_FILESYSTEMS};
        if (EasyPermissions.hasPermissions(context, perms)) {
            return;
        }
        EasyPermissions.requestPermissions((android.app.Activity) context, "نیاز به اجازه دارد", 123, perms);
    }
       public void NFC_permission(Context context){
        String[] perms = {Manifest.permission.NFC};
        if (EasyPermissions.hasPermissions(context, perms)) {
            return;
        }
        EasyPermissions.requestPermissions((android.app.Activity) context, "نیاز به اجازه دارد", 123, perms);
    }
       public void NFC_TRANSACTION_EVENT_permission(Context context){
        String[] perms = {Manifest.permission.NFC_TRANSACTION_EVENT};
        if (EasyPermissions.hasPermissions(context, perms)) {
            return;
        }
        EasyPermissions.requestPermissions((android.app.Activity) context, "نیاز به اجازه دارد", 123, perms);
    }
       public void PACKAGE_USAGE_STATS_permission(Context context){
        String[] perms = {Manifest.permission.PACKAGE_USAGE_STATS};
        if (EasyPermissions.hasPermissions(context, perms)) {
            return;
        }
        EasyPermissions.requestPermissions((android.app.Activity) context, "نیاز به اجازه دارد", 123, perms);
    }
    public void READ_CALL_LOG_permission(Context context){
        String[] perms = {Manifest.permission.READ_CALL_LOG};
        if (EasyPermissions.hasPermissions(context, perms)) {
            return;
        }
        EasyPermissions.requestPermissions((android.app.Activity) context, "نیاز به اجازه دارد", 123, perms);
    }
    public void READ_LOGS_permission(Context context){
        String[] perms = {Manifest.permission.READ_LOGS};
        if (EasyPermissions.hasPermissions(context, perms)) {
            return;
        }
        EasyPermissions.requestPermissions((android.app.Activity) context, "نیاز به اجازه دارد", 123, perms);
    }
    public void READ_SYNC_SETTINGS_permission(Context context){
        String[] perms = {Manifest.permission.READ_SYNC_SETTINGS};
        if (EasyPermissions.hasPermissions(context, perms)) {
            return;
        }
        EasyPermissions.requestPermissions((android.app.Activity) context, "نیاز به اجازه دارد", 123, perms);
    }
    public void READ_SYNC_STATS_permission(Context context){
        String[] perms = {Manifest.permission.READ_SYNC_STATS};
        if (EasyPermissions.hasPermissions(context, perms)) {
            return;
        }
        EasyPermissions.requestPermissions((android.app.Activity) context, "نیاز به اجازه دارد", 123, perms);
    }
    public void REBOOT_permission(Context context){
        String[] perms = {Manifest.permission.REBOOT};
        if (EasyPermissions.hasPermissions(context, perms)) {
            return;
        }
        EasyPermissions.requestPermissions((android.app.Activity) context, "نیاز به اجازه دارد", 123, perms);
    }

   public void RECEIVE_BOOT_COMPLETED_permission(Context context){
        String[] perms = {Manifest.permission.RECEIVE_BOOT_COMPLETED};
        if (EasyPermissions.hasPermissions(context, perms)) {
            return;
        }
        EasyPermissions.requestPermissions((android.app.Activity) context, "نیاز به اجازه دارد", 123, perms);
    }

   public void RECEIVE_MMS_permission(Context context){
        String[] perms = {Manifest.permission.RECEIVE_MMS};
        if (EasyPermissions.hasPermissions(context, perms)) {
            return;
        }
        EasyPermissions.requestPermissions((android.app.Activity) context, "نیاز به اجازه دارد", 123, perms);
    }
    public void RECEIVE_WAP_PUSH_permission(Context context){
        String[] perms = {Manifest.permission.RECEIVE_WAP_PUSH};
        if (EasyPermissions.hasPermissions(context, perms)) {
            return;
        }
        EasyPermissions.requestPermissions((android.app.Activity) context, "نیاز به اجازه دارد", 123, perms);
    }
    public void RECORD_AUDIO_permission(Context context){
        String[] perms = {Manifest.permission.RECORD_AUDIO};
        if (EasyPermissions.hasPermissions(context, perms)) {
            return;
        }
        EasyPermissions.requestPermissions((android.app.Activity) context, "نیاز به اجازه دارد", 123, perms);
    }
    public void REORDER_TASKS_permission(Context context){
        String[] perms = {Manifest.permission.REORDER_TASKS};
        if (EasyPermissions.hasPermissions(context, perms)) {
            return;
        }
        EasyPermissions.requestPermissions((android.app.Activity) context, "نیاز به اجازه دارد", 123, perms);
    }
    public void REQUEST_COMPANION_RUN_IN_BACKGROUND_permission(Context context){
        String[] perms = {Manifest.permission.REQUEST_COMPANION_RUN_IN_BACKGROUND};
        if (EasyPermissions.hasPermissions(context, perms)) {
            return;
        }
        EasyPermissions.requestPermissions((android.app.Activity) context, "نیاز به اجازه دارد", 123, perms);
    }
     public void REQUEST_COMPANION_USE_DATA_IN_BACKGROUND_permission(Context context){
        String[] perms = {Manifest.permission.REQUEST_COMPANION_USE_DATA_IN_BACKGROUND};
        if (EasyPermissions.hasPermissions(context, perms)) {
            return;
        }
        EasyPermissions.requestPermissions((android.app.Activity) context, "نیاز به اجازه دارد", 123, perms);
    }
     public void REQUEST_DELETE_PACKAGES_permission(Context context){
        String[] perms = {Manifest.permission.REQUEST_DELETE_PACKAGES};
        if (EasyPermissions.hasPermissions(context, perms)) {
            return;
        }
        EasyPermissions.requestPermissions((android.app.Activity) context, "نیاز به اجازه دارد", 123, perms);
    }
     public void REQUEST_IGNORE_BATTERY_OPTIMIZATIONS_permission(Context context){
        String[] perms = {Manifest.permission.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS};
        if (EasyPermissions.hasPermissions(context, perms)) {
            return;
        }
        EasyPermissions.requestPermissions((android.app.Activity) context, "نیاز به اجازه دارد", 123, perms);
    }
    public void REQUEST_INSTALL_PACKAGES_permission(Context context){
        String[] perms = {Manifest.permission.REQUEST_INSTALL_PACKAGES};
        if (EasyPermissions.hasPermissions(context, perms)) {
            return;
        }
        EasyPermissions.requestPermissions((android.app.Activity) context, "نیاز به اجازه دارد", 123, perms);
    }
    public void REQUEST_PASSWORD_COMPLEXITY_permission(Context context){
        String[] perms = {Manifest.permission.REQUEST_PASSWORD_COMPLEXITY};
        if (EasyPermissions.hasPermissions(context, perms)) {
            return;
        }
        EasyPermissions.requestPermissions((android.app.Activity) context, "نیاز به اجازه دارد", 123, perms);
    }
    public void SEND_RESPOND_VIA_MESSAGE_permission(Context context){
        String[] perms = {Manifest.permission.SEND_RESPOND_VIA_MESSAGE};
        if (EasyPermissions.hasPermissions(context, perms)) {
            return;
        }
        EasyPermissions.requestPermissions((android.app.Activity) context, "نیاز به اجازه دارد", 123, perms);
    }
    public void SET_ALARM_permission(Context context){
        String[] perms = {Manifest.permission.SET_ALARM};
        if (EasyPermissions.hasPermissions(context, perms)) {
            return;
        }
        EasyPermissions.requestPermissions((android.app.Activity) context, "نیاز به اجازه دارد", 123, perms);
    }
    public void SET_ALWAYS_FINISH_permission(Context context){
        String[] perms = {Manifest.permission.SET_ALWAYS_FINISH};
        if (EasyPermissions.hasPermissions(context, perms)) {
            return;
        }
        EasyPermissions.requestPermissions((android.app.Activity) context, "نیاز به اجازه دارد", 123, perms);
    }
    public void SET_ANIMATION_SCALE_permission(Context context){
        String[] perms = {Manifest.permission.SET_ANIMATION_SCALE};
        if (EasyPermissions.hasPermissions(context, perms)) {
            return;
        }
        EasyPermissions.requestPermissions((android.app.Activity) context, "نیاز به اجازه دارد", 123, perms);
    }
    public void SET_DEBUG_APP_permission(Context context){
        String[] perms = {Manifest.permission.SET_DEBUG_APP};
        if (EasyPermissions.hasPermissions(context, perms)) {
            return;
        }
        EasyPermissions.requestPermissions((android.app.Activity) context, "نیاز به اجازه دارد", 123, perms);
    }

public void SET_PROCESS_LIMIT_permission(Context context){
        String[] perms = {Manifest.permission.SET_PROCESS_LIMIT};
        if (EasyPermissions.hasPermissions(context, perms)) {
            return;
        }
        EasyPermissions.requestPermissions((android.app.Activity) context, "نیاز به اجازه دارد", 123, perms);
    }

public void SET_TIME_permission(Context context){
        String[] perms = {Manifest.permission.SET_TIME};
        if (EasyPermissions.hasPermissions(context, perms)) {
            return;
        }
        EasyPermissions.requestPermissions((android.app.Activity) context, "نیاز به اجازه دارد", 123, perms);
    }

public void SET_TIME_ZONE_permission(Context context){
        String[] perms = {Manifest.permission.SET_TIME_ZONE};
        if (EasyPermissions.hasPermissions(context, perms)) {
            return;
        }
        EasyPermissions.requestPermissions((android.app.Activity) context, "نیاز به اجازه دارد", 123, perms);
    }

public void SET_WALLPAPER_permission(Context context){
        String[] perms = {Manifest.permission.SET_WALLPAPER};
        if (EasyPermissions.hasPermissions(context, perms)) {
            return;
        }
        EasyPermissions.requestPermissions((android.app.Activity) context, "نیاز به اجازه دارد", 123, perms);
    }

public void SET_WALLPAPER_HINTS_permission(Context context){
        String[] perms = {Manifest.permission.SET_WALLPAPER_HINTS};
        if (EasyPermissions.hasPermissions(context, perms)) {
            return;
        }
        EasyPermissions.requestPermissions((android.app.Activity) context, "نیاز به اجازه دارد", 123, perms);
    }

public void SIGNAL_PERSISTENT_PROCESSES_permission(Context context){
        String[] perms = {Manifest.permission.SIGNAL_PERSISTENT_PROCESSES};
        if (EasyPermissions.hasPermissions(context, perms)) {
            return;
        }
        EasyPermissions.requestPermissions((android.app.Activity) context, "نیاز به اجازه دارد", 123, perms);
    }
    public void START_VIEW_PERMISSION_USAGE_permission(Context context){
        String[] perms = {Manifest.permission.START_VIEW_PERMISSION_USAGE};
        if (EasyPermissions.hasPermissions(context, perms)) {
            return;
        }
        EasyPermissions.requestPermissions((android.app.Activity) context, "نیاز به اجازه دارد", 123, perms);
    }
    public void STATUS_BAR_permission(Context context){
        String[] perms = {Manifest.permission.STATUS_BAR};
        if (EasyPermissions.hasPermissions(context, perms)) {
            return;
        }
        EasyPermissions.requestPermissions((android.app.Activity) context, "نیاز به اجازه دارد", 123, perms);
    }
    public void SYSTEM_ALERT_WINDOW_permission(Context context){
        String[] perms = {Manifest.permission.SYSTEM_ALERT_WINDOW};
        if (EasyPermissions.hasPermissions(context, perms)) {
            return;
        }
        EasyPermissions.requestPermissions((android.app.Activity) context, "نیاز به اجازه دارد", 123, perms);
    }
    public void TRANSMIT_IR_permission(Context context){
        String[] perms = {Manifest.permission.TRANSMIT_IR};
        if (EasyPermissions.hasPermissions(context, perms)) {
            return;
        }
        EasyPermissions.requestPermissions((android.app.Activity) context, "نیاز به اجازه دارد", 123, perms);
    }
    public void UNINSTALL_SHORTCUT_permission(Context context){
        String[] perms = {Manifest.permission.UNINSTALL_SHORTCUT};
        if (EasyPermissions.hasPermissions(context, perms)) {
            return;
        }
        EasyPermissions.requestPermissions((android.app.Activity) context, "نیاز به اجازه دارد", 123, perms);
    }
    public void UPDATE_DEVICE_STATS_permission(Context context){
        String[] perms = {Manifest.permission.UPDATE_DEVICE_STATS};
        if (EasyPermissions.hasPermissions(context, perms)) {
            return;
        }
        EasyPermissions.requestPermissions((android.app.Activity) context, "نیاز به اجازه دارد", 123, perms);
    }
    public void USE_BIOMETRIC_permission(Context context){
        String[] perms = {Manifest.permission.USE_BIOMETRIC};
        if (EasyPermissions.hasPermissions(context, perms)) {
            return;
        }
        EasyPermissions.requestPermissions((android.app.Activity) context, "نیاز به اجازه دارد", 123, perms);
    }
    public void USE_FULL_SCREEN_INTENT_permission(Context context){
        String[] perms = {Manifest.permission.USE_FULL_SCREEN_INTENT};
        if (EasyPermissions.hasPermissions(context, perms)) {
            return;
        }
        EasyPermissions.requestPermissions((android.app.Activity) context, "نیاز به اجازه دارد", 123, perms);
    }
    public void USE_SIP_permission(Context context){
        String[] perms = {Manifest.permission.USE_SIP};
        if (EasyPermissions.hasPermissions(context, perms)) {
            return;
        }
        EasyPermissions.requestPermissions((android.app.Activity) context, "نیاز به اجازه دارد", 123, perms);
    }
    public void VIBRATE_permission(Context context){
        String[] perms = {Manifest.permission.VIBRATE};
        if (EasyPermissions.hasPermissions(context, perms)) {
            return;
        }
        EasyPermissions.requestPermissions((android.app.Activity) context, "نیاز به اجازه دارد", 123, perms);
    }
    public void WAKE_LOCK_permission(Context context){
        String[] perms = {Manifest.permission.WAKE_LOCK};
        if (EasyPermissions.hasPermissions(context, perms)) {
            return;
        }
        EasyPermissions.requestPermissions((android.app.Activity) context, "نیاز به اجازه دارد", 123, perms);
    }
    public void WRITE_APN_SETTINGS_permission(Context context){
        String[] perms = {Manifest.permission.WRITE_APN_SETTINGS};
        if (EasyPermissions.hasPermissions(context, perms)) {
            return;
        }
        EasyPermissions.requestPermissions((android.app.Activity) context, "نیاز به اجازه دارد", 123, perms);
    }
    public void WRITE_CALL_LOG_permission(Context context){
        String[] perms = {Manifest.permission.WRITE_CALL_LOG};
        if (EasyPermissions.hasPermissions(context, perms)) {
            return;
        }
        EasyPermissions.requestPermissions((android.app.Activity) context, "نیاز به اجازه دارد", 123, perms);
    }
    public void WRITE_GSERVICES_permission(Context context){
        String[] perms = {Manifest.permission.WRITE_GSERVICES};
        if (EasyPermissions.hasPermissions(context, perms)) {
            return;
        }
        EasyPermissions.requestPermissions((android.app.Activity) context, "نیاز به اجازه دارد", 123, perms);
    }
    public void WRITE_SECURE_SETTINGS_permission(Context context){
        String[] perms = {Manifest.permission.WRITE_SECURE_SETTINGS};
        if (EasyPermissions.hasPermissions(context, perms)) {
            return;
        }
        EasyPermissions.requestPermissions((android.app.Activity) context, "نیاز به اجازه دارد", 123, perms);
    }
    public void WRITE_SETTINGS_permission(Context context){
        String[] perms = {Manifest.permission.WRITE_SETTINGS};
        if (EasyPermissions.hasPermissions(context, perms)) {
            return;
        }
        EasyPermissions.requestPermissions((android.app.Activity) context, "نیاز به اجازه دارد", 123, perms);
    }
    public void WRITE_SYNC_SETTINGS_permission(Context context){
        String[] perms = {Manifest.permission.WRITE_SYNC_SETTINGS};
        if (EasyPermissions.hasPermissions(context, perms)) {
            return;
        }
        EasyPermissions.requestPermissions((android.app.Activity) context, "نیاز به اجازه دارد", 123, perms);
    }


    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);

        EasyPermissions.onRequestPermissionsResult(requestCode,permissions,grantResults,this);

    }


    @Override
    public void onPermissionsGranted(int requestCode, @NonNull List<String> perms) {

    }

    @Override
    public void onPermissionsDenied(int requestCode, @NonNull List<String> perms) {
     if (EasyPermissions.somePermissionPermanentlyDenied(this,perms)){
         new AppSettingsDialog.Builder(this).build().show();
     }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode  == AppSettingsDialog.DEFAULT_SETTINGS_REQ_CODE){
            Toast.makeText(this, " تست ", Toast.LENGTH_SHORT)
                    .show();
        }
    }
    public SharedPreferences.Editor editor;
    public SharedPreferences sharedPreferences;
    public void SharedPrefSave(Context context,String string){
        sharedPreferences = context.getSharedPreferences(string, MODE_PRIVATE);
        editor = sharedPreferences.edit();
    }
    public void SharedPrefget(Context context,String string){
        sharedPreferences = context.getSharedPreferences(string , MODE_PRIVATE);
    }
   public void SharedPrefclear(){
        editor.clear();
   }

    public AlertDialog.Builder builder;

    public void dialog_builder(Context context){
        builder = new AlertDialog.Builder(context);
    }
    public void dialog_show(){
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }

}



