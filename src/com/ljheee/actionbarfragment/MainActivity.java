package com.ljheee.actionbarfragment;

import com.example.actionbarfragment.R;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /**
     * 创建选项菜单
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    /**
     * 选项菜单-选项监听
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
    	
    	switch (item.getItemId()) {
		case R.id.action_settings:
			Toast.makeText(MainActivity.this , "action_settings", Toast.LENGTH_SHORT).show();
			break;
		case R.id.action_view:
			Toast.makeText(MainActivity.this , "action_view", Toast.LENGTH_SHORT).show();
			break;
		case R.id.action_exit:
			finish();
			break;

		default:
			break;
		}
    	
    	
    	return super.onOptionsItemSelected(item);
    }
    
    
    
    
    
}
