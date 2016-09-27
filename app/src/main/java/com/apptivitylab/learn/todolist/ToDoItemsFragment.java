package com.apptivitylab.learn.todolist;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by jamehii on 9/10/2016.
 */
public class ToDoItemsFragment extends Fragment
{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        super.onCreateView(inflater, container, savedInstanceState);

        View rootView = inflater.inflate(R.layout.fragment_todo_items_fragment, container, false);

        return rootView;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState)
    {
        super.onActivityCreated(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater)
    {
        super.onCreateOptionsMenu(menu, inflater);
        inflater.inflate(R.menu.fragment_todo_items, menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        super.onOptionsItemSelected(item);

        if( item.getItemId() == R.id.menu_add_task )
        {
            Intent intent = new Intent( getContext(), AddTaskActivity.class);
            startActivity(intent);
        }

        return false;
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data)
    {
        super.onActivityResult(requestCode, resultCode, data);

        LayoutInflater inflater = (LayoutInflater) getActivity().getLayoutInflater();
        
    }
}
