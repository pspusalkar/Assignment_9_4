package com.example.poojajoshi.assignment_9_4;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuInflater;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TextView tv = findViewById(R.id.textView);
        registerForContextMenu(tv);
    }

    @Override
    public void onCreateContextMenu(android.view.ContextMenu menu, View v, android.view.ContextMenu.ContextMenuInfo menuInfo)
    {
        // create context menu
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        menu.setHeaderTitle("Context Menu");

        super.onCreateContextMenu(menu, v, menuInfo);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item){
        if(item.getItemId() == R.id.action1 && item.getGroupId()==0){
            Toast.makeText(getApplicationContext(), "Action 1 Clicked", Toast.LENGTH_SHORT).show();
        }
        else if(item.getItemId()== R.id.action2 && item.getGroupId()==0){
            Toast.makeText(getApplicationContext(), "Action 2 Clicked", Toast.LENGTH_SHORT).show();
        } else if ( item.getItemId() == R.id.action3 && item.getGroupId()==0) {
            Toast.makeText(getApplicationContext(), "Action 3 Clicked", Toast.LENGTH_SHORT).show();
        }
        else return false;
        return true;
    }
}
