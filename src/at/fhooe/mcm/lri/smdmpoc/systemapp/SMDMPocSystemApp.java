package at.fhooe.mcm.lri.smdmpoc.systemapp;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class SMDMPocSystemApp extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_smdmpoc_system_app);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.smdmpoc_system_app, menu);
		return true;
	}

}
