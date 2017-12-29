package com.ars.myrccar;

import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.Toast;

public class MyRCCarActivity extends Activity {
	BluetoothAdapter mBluetoothAdapter;
	// Called when the activity is first created.
    
public void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
       
     
		startActivity(new Intent("com.ars.myrccar.MENUUU"));
		mBluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
        if (mBluetoothAdapter == null) {
            Toast.makeText(this, "Bluetooth is not available", Toast.LENGTH_LONG).show();
            finish();
            return;
        }
		} 
	
    
    public void onStart() {
        super.onStart();
        
        // If BT is not on, request that it be enabled.
        // setupChat() will then be called during onActivityResult
        if (!mBluetoothAdapter.isEnabled()) {
            Intent enableIntent = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
            startActivityForResult(enableIntent, 3);
        // Otherwise, setup the chat session
        }
    } 	
    
    
@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
	}

	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
	}

}
  
    
    
    
    
    
    
    
    
    
    
    
    
    