package cz.havlena.ffmpeg.ui;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

public class FFMpegMessageBox {
	
	public static void showDialog(Context context, String title, String msg) {
		new AlertDialog.Builder(context)  
        .setMessage(msg)  
        .setTitle(title)  
        .setCancelable(true) 
        .setNeutralButton(android.R.string.ok,  
           new DialogInterface.OnClickListener() {  
           public void onClick(DialogInterface dialog, int whichButton){}  
           })  
        .show();
	}
	
	public static void showDialog(Context context, Exception ex) {
		showDialog(context, "Error", ex.getMessage());
	}

}
