package com.apptivitylab.learn.todolist;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by jamehii on 9/10/2016.
 */
public class AddTaskActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_task);

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.activity_vg_container_add_task, new AddTaskFragment() )
                .commit();
    }
}
